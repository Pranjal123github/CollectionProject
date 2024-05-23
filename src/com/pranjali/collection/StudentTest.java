package com.pranjali.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<>();
		set.add(new Student(105, "Pranjali", 26, 99));
		set.add(new Student(106, "Bhumika", 22, 99));
		set.add(new Student(101, "Varsha", 23, 99));
		set.add(new Student(104, "Kavya", 24, 99));
		set.add(new Student(102, "Anaya", 28, 99));
		set.add(new Student(103, "Maya", 20, 99));
		set.add(new Student(107, "Amayra", 18, 99));
		set.add(new Student(105, "Swara", 19, 99));

		TreeSet<Student> studentSet = new TreeSet<>(set);

		Iterator<Student> itr = studentSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
