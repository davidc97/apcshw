import java.util.*;
import java.io.*;

public class MergeSorter {

/*	public int[] merge(int[] a, int[] b) {
		int x = 0;
		int y = 0;
		int z = 0;
		int[] r = new int[a.length+b.length];
		for (; z<r.length; z++) {
			if (x>=a.length) {
				r[z] = b[y];
				y++;
			}
			else if (y>=b.length) {
				r[z] = a[x];
				x++;
			}
			else if (a[x] < b[y]) {
				r[z] = a[x];
				x++;
			}
			else {
				r[z] = b[y];
				y++;
			}
		}
		return r;
	}

	public int[] sort(int[] a) {
		if (a.length <= 1)
			return a;
		else {
			int[] a1 = new int[a.length/2];
			int[] a2 = new int[a.length - a.length/2];
			int i = 0;
			for (; i<a1.length; i++)
				a1[i] = a[i];
			for (; i<a.length; i++)
				a2[i-a1.length] = a[i];
			return merge(sort(a1), sort(a2));
		}
	}

	public ArrayList<String> sortString(ArrayList<String> a) {
		if (a.size() <= 1)
			return a;
		else {
			ArrayList<String> a1 = new ArrayList();
			ArrayList<String> a2 = new ArrayList();
			int i = 0;
			for (; i<a.size()/2; i++)
				a1.add(a.get(i));
			for (; i<a.size(); i++)
				a2.add(a.get(i));
			return mergeString(sortString(a1), sortString(a2));
		}
	}

	public ArrayList<String> mergeString(ArrayList<String> a, ArrayList<String> b) {
		int x = 0;
		int y = 0;
		int z = 0;
		int i;
		ArrayList<String> r = new ArrayList();
		for (; z<a.size()+b.size(); z++) {
			if (x>=a.size()) {
				r.add(b.get(y));
				y++;
			}
			else if (y>=b.size()) {
				r.add(a.get(x));
				x++;
			}
			else {
			i = 0;	
			while (a.get(x).charAt(i) == b.get(y).charAt(i))
				i++;
			if (a.get(x).charAt(i) < b.get(y).charAt(i)) {
				r.add(a.get(x));
				x++;
			}
			else {
				r.add(b.get(y));
				y++;
			}
		}}
		return r;
	}
*/

	public ArrayList<Comparable> sortComp(ArrayList<Comparable> a) {
		if (a.size() <= 1)
			return a;
		else {
			ArrayList<Comparable> a1 = new ArrayList();
			ArrayList<Comparable> a2 = new ArrayList();
			int i = 0;
			for (; i<a.size()/2; i++)
				a1.add(a.get(i));
			for (; i<a.size(); i++)
				a2.add(a.get(i));
			return mergeComp(sortComp(a1), sortComp(a2));
		}
	}

	public ArrayList<Comparable> mergeComp(ArrayList<Comparable> a, ArrayList<Comparable> b) {
		int x = 0;
		int y = 0;
		int z = 0;
		ArrayList<Comparable> r = new ArrayList();
		for (; z<a.size()+b.size(); z++) {
			if (x>=a.size()) {
				r.add(b.get(y));
				y++;
			}
			else if (y>=b.size()) {
				r.add(a.get(x));
				x++;
			}
			
			else if (a.get(x).compareTo(b.get(y)) == -1) {
				r.add(a.get(x));
				x++;
			}
			else {
				r.add(b.get(y));
				y++;
			}
		}
		return r;
	}



	public static void main(String args[]) {
		Random r = new Random();
		MergeSorter ms = new MergeSorter();
		//int[] a = {1,2,3,4,5};
		//int[] b = {2,4,6,8,10};
	//	System.out.println(ms.merge(a,b));
		/*int[] c = new int[10000000];
		for (int i = 0; i<c.length; i++)
			c[i] = r.nextInt(1000);
		System.out.println("Start");
		System.out.println(Arrays.toString(ms.sort(c)));*/
		ArrayList<Comparable> a = new ArrayList();
		String[] b = {"jhadbjad", "kjadnkajnd", "hqwbdwqbd", "abdhwd", "bdjhqbwdjaw", "abhdbdbqwi"};
		for(int i = 0; i<b.length; i++) 
			a.add(new Person(b[i]));
		a = ms.sortComp(a);
		for (int i = 0; i<a.size(); i++)
			System.out.println(a.get(i));
	}















}
