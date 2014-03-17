import java.util.*;
import java.io.*;

public class QuickSelect {

	private Random r = new Random();
	

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
/*
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

*/

	public int partition(int[] a, int L, int R) {
	//	if (a.length = 1)
	//		return a[0];
		int temp;
		int wall = L;
		int p = r.nextInt((R-L)+1) + L;
		temp = a[p];
		a[p] = a[R];
		a[R] = temp;
		for (int i = L; i<R; i++) {
			if (a[i] < a[R]) {
				temp = a[wall];
				a[wall] = a[i];
				a[i] = temp;
				wall++;
			}
		}
		for (int i = wall; i<R; i++) {
			if (a[i] == a[R]) {
				temp = a[wall];
				a[wall] = a[i];
				a[i] = temp;
			//	System.out.println(a[wall]);
				wall++;
			}
		}
		temp = a[wall];
		a[wall] = a[R];
		a[R] = temp;
		return wall;
	}

	public void quickSort2(int[] a, int L, int R) {
		if (L>=R)
			return;
		else {
			int p = partition(a,L,R);
			quickSort2(a,p+1,R);
			quickSort2(a,L,p-1);
		}
	}
		
			


	public static void main(String[] args) {
		
		QuickSelect qs = new QuickSelect();
		int[] a = {1,8,6,7,2,4,5,6,8};
		//System.out.println(qs.quickSelect(a,3,0,8)+"!!");
		//System.out.println(Arrays.toString(qs.quickSort(a)));
		qs.quickSort2(a,0,8);
		System.out.println(Arrays.toString(a));
	}














}
