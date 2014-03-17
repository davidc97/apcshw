import java.util.*;
import java.io.*;

public class Person implements Comparable<Person> {

	private int age;
	private String name;

	public Person(int n) {
		name = "";
		age = n;
	}

	public Person(String s) {
		age = 0;
		name = s;
	}

	public Person(int n, String s) {
		age = n;
		name = s;
	}


	public String toString() {
		String r = "(" + name + ", " + age + ")";
		return r;
	}

	public int getAge() {return age;}
	public String getName() {return name;}
/*
	public int compareTo(Person other) {
		if (this.getAge() > other.getAge())
			return 1;
		if (this.getAge() == other.getAge())
			return 0;
		else
			return -1;
	}
*/

	public int compareTo(Person other) {
		if (getName().compareTo(other.getName()) == 1) {
			System.out.println("?????????");
			return 1;}
		if (getName().equals(other.getName()))
			return 0;
		else
			return -1;
	}



}
