import java.util.*;
import java.io.*;

public class KnightGame {
	private int[][] board;
	private boolean solved;

	public KnightGame(int x, int y) {
		board = new int[x][y];
		solved = false;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++) {
				s = s + board[i][j] + " ";
				if (board[i][j] < 10)
					s = s + " ";
			}
			s = s + "\n";
		}
		return s;
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
		if (x >= board.length || y >= board[0].length || x < 0 || y < 0 || (board[x][y] > 0 && board[x][y] < n) || solved == true) {
			//System.out.println(this);
			return;
		}
		else if (n >= board.length * board[0].length) {
			solved = true;
			board[x][y] = n;
			System.out.println(this);
		}
		else {
			board[x][y] = n;
			//System.out.println(this);
			play(n+1,x+2,y+1);
			play(n+1,x+2,y-1);
			play(n+1,x+1,y+2);
			play(n+1,x+1,y-2);
			play(n+1,x-2,y+1);
			play(n+1,x-2,y-1);
			play(n+1,x-1,y+2);
			play(n+1,x-1,y-2);
		}
	}





}
















