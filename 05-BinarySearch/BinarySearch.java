import java.util.*;
import java.io.*;

public class BinarySearch {

	public int rbsearch(int n, int[] L) {
		if (L.length < 1)
			return -1;
		int m = L.length/2;
		if (L[m] == n)
			return m;
		else if (n < L[m]) {
			int[] u = new int[m];
			for (int i = 0; i<m; i++)
				u[i] = L[i];
			return rbsearch(n, u);
		}
		else {
			int[] u = new int[L.length-m];
			for (int i = m; i<L.length; i++)
				u[i-m] = L[m];
			return rbsearch(n,u);
		}
	}

	public int ibsearch(int n, int[] L) {
		int upper = L.length;
		int lower = 0;
		int temp = 0;
		if (L[0] == n)
			return 0;
		if (L[L.length - 1] == n)
			return L.length - 1;
		int m = L[L.length/2];
		while (m > 0 && m < L.length-1) {
			if (L[m] = n)
				return m;
			else if (L[m] > n) {
				upper = m;
				m = (m+lower)/2;
			}
			else {
				lower = m;
				m = (m+upper)/2;
			}
		}
		return -1;
	}
			




}
