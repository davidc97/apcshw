import java.util.*;
import java.io.*;

public class QueenGame {

	private int[][] board = new int[5][5];
	private boolean solved = false;

	public String toString() {
		String s = "";
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++) {
				s = s+board[i][j]+" ";
			}
			s = s+"\n";
		}
		return s;
	}

	//returns true if Queen CANNOT be placed
	public boolean check(int row, int col) {
		int x = row;
		int y = col;
		while (x < board.length && y < board[0].length) {
			if (board[x][y] > 0)
				return true;
			x=x+1;
			y=y+1;
		}
		x = row;
		y = col;
		while (x < board.length && y >= 0) {
			if (board[x][y] > 0)
				return true;
			x=x+1;
			y=y-1;
		}
		x = row;
		y = col;
		while (x >= 0 && y < board[0].length) {
			if (board[x][y] > 0)
				return true;
			x=x-1;
			y=y+1;
		}
		x = row;
		y = col;
		while (x >= 0 && y >= 0) {
			if (board[x][y] > 0)
				return true;
			x=x-1;
			y=y-1;
		}
		x = row;
		y = 0;
		for (; y < board[x].length; y++) {
			if (board[x][y] > 0)
				return true;
		}
		return false;
	}

	public void clear(int n) {
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++) {
				if (board[i][j] >= n)
					board[i][j] = 0;
			}
		}
	}

	public void play(int n, int x, int y) {
		clear(n);
		if (check(x,y) || solved == true)
			return;
		else {
			board[x][y] = n;
			if (n == board.length) {
				solved = true;
				System.out.println(this);
			}
			else {
			for (int i = 0; i<board.length; i++)
				play(n+1,i,y+1);
			}
		}
	}
		




}
