import java.util.*;
import java.io.*;

public class QuickSelect {

	private Random r = new Random();
	/*
	public int qSelect(int[] a, int k, int low, int high) {
		if (low >= high)
			return high;
		else {
			int p = r.nextInt(high-low+1)+low;
			System.out.println(p);
			int j = 0;
			int[] temp = new int[high-low+1];
			for (int i = low; i<=high; i++) {
				if (a[i] < a[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			if (j+low == k)
				return a[p];
			if (j+low>k)
				return qSelect(a,k,low,low+temp.length-1);
			temp[j] = a[p];
			p = j;
			j++;
			for (int i = low; i<= high; i++) {
				if (a[i] >= temp[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			return 
				qSelect(a,k,(high-temp.length)+1,high);
		}
	}
*/

	public int quickSelect(int[] a, int k, int low, int high) {
		if (low >= high)
			return high;
		else {
			int p = r.nextInt(high-low+1)+low;
			System.out.println(p);
			int j = 0;
			int[] temp = new int[high-low+1];
			for (int i = low; i<=high; i++) {
				if (a[i] < a[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			if (j+low == k)
				return a[p];
			if (j+low>k)
				return quickSelect(a,k,low,low+temp.length-1);
			temp[j] = a[p];
			p = j;
			j++;
			for (int i = low; i<= high; i++) {
				if (a[i] >= temp[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			return 
				quickSelect(a,k,(high-temp.length)+1,high);
		}
	}

	public int[] quickSort(int[] a) {
		if (a.length<=1)
			return a;
		else {
			int p = r.nextInt();
			ArrayList a1 = new ArrayList();
			ArrayList a2 = new ArrayList();
			for (int i = 0; i<a.length; i++) {
				if (a[i] <= a[p] && i != p)
					a1.add(a[i]);
				else if (a[i] > a[p])
					a2.add(a[i]);
			}
			int[] temp = new int[a.length];
			int[] A1 = a1.toArray(new int[a1.size()]);
			A1 = quickSort(A1);
			int[] A2 = a2.toArray(new int[a2.size()]);
			A2 = quickSort(A2);
			for (int i = 0; i<temp.length; i++) {
				if (i<A1.length)
					temp[i] = A1[i];
				else if (i == A1.length)
					temp[i] = a[p];
				else
					temp[i] = A2[i-A1.length];
			}
			return temp;
		}
	}




	public static void main(String[] args) {

		QuickSelect qs = new QuickSelect();
		int[] a = {1,8,6,7,2,4,5,6,8};
		//System.out.println(qs.quickSelect(a,3,0,8)+"!!");
		System.out.println(Arrays.toString(qs.quickSort(a)));
	}














}
