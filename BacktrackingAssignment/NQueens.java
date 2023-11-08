package BacktrackingAssignment;

import java.util.*;

public class NQueens {

	static int answer = 0;
	public static void main(String[] args) {
		int n = 4;
		int [][]board = new int[n][n];
		nQueens(board, 0);
		System.out.println("the number of solutions for placing queens are : "+ answer);
	}
	
	public static void nQueens(int [][]board,int row) {
		int n = board.length;
		if (row == n) {
			answer+=1;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (isSafe(board,row,i)) {
				board[row][i]=1;
				nQueens(board, row+1);
				board[row][i]=0;
			}
		}
	}
	
	public static boolean isSafe(int [][]board,int row,int col) {
		int n = board.length;
		for (int i = 0; i < n; i++) {
			if (board[row][i]==1 || board[i][col]==1) {
				return false;
			}
		}
		
		int i = row, j = col;
		//north east
		while(i>=0 && j<n) {
			if(board[i][j]==1) return false;
			i--;
			j++;
		}
		i = row;
		j = col;
		//south east
		while(i<n && j<n) {
			if(board[i][j]==1) return false;
			i++;
			j++;
		}
		i = row;
		j = col;
		//south west
		while(i<n && j>=0) {
			if(board[i][j]==1) return false;
			i++;
			j--;
		}
		i = row;
		j = col;
		//north west
		while(i>=0 && j>=0) {
			if(board[i][j]==1) return false;
			i--;
			j--;
		}
		return true;
	}
}
