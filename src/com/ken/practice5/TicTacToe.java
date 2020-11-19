package com.ken.practice5;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		//读入矩阵
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				board[i][j]= in.nextInt(); 
			}
		}
		
		//检查行
		for(int i = 0; i < board.length; i++) {
			numOfX = 0;
			numOfO = 0;
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					numOfX ++;
				} else {
					numOfO ++;
				}
			}
			if(numOfO == SIZE || numOfX == SIZE) {
				gotResult = true;
				break;
			}
		}
		
		//检查列
		if(!gotResult) {
			for (int i = 0; i < board.length; i++) {
				numOfO = 0;
				numOfX = 0;
				for(int j = 0; j < board[i].length; j++) {
					if(board[j][i]== 1) {
						numOfX ++;
					} else {
						numOfO ++;
					}
				}
				if (numOfO == SIZE || numOfX == SIZE) {
					gotResult = true;
					break;
				}
			}
		}
		
		//检查对角线
		if(!gotResult) {
			numOfO = 0;
			numOfX = 0;
			for (int i = 0; i < board.length; i++) {
				if(board[i][i]== 1) {
					numOfX ++;
				} else {
					numOfO ++;
				}
				if (numOfO == SIZE || numOfX == SIZE) {
					gotResult = true;
					break;
				}
			}
		}
		
		//检查反对角线
		if(!gotResult) {
			numOfO = 0;
			numOfX = 0;
			for (int i = 0; i < board.length; i++) {
				if(board[i][SIZE-i-1]== 1) {
					numOfX ++;
				} else {
					numOfO ++;
				}
				if (numOfO == SIZE || numOfX == SIZE) {
					gotResult = true;
					break;
				}
			}
		}
		
		if(gotResult) {
			if (numOfX == SIZE) {
				System.out.println("X win!");
			} else {
				System.out.println("O win!");
			}
		} else {
			System.out.println("没人赢！");
		}
		in.close();
	}

}
