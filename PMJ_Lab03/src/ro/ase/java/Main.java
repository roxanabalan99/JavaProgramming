package ro.ase.java;

import ro.ase.java.classes.Student;
import ro.ase.java.classes.Tuition;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Student s1 = new Student();
		System.out.println(s1.getName());
		
		Student s2 = new Student("george", 22);
		System.out.println(s2.getAge());
		
		//reference types - classes, interfaces, enumerations - by default they are NULL
		
		System.out.println(s2.tuition);
		
		Student s3 = (Student) s2.clone();
		//boxing & unboxing - convert to object then back to stud
		System.out.println(s3.getName());
		
		int[] array = new int[3];
		//we don't have static arrays
		//initialized w/ 0
		//instances of a class 
		
		array[0] = 99;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		
		//!!! the i is read-only!!! 
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		float[][] matrix = new float[2][3];
		matrix[0][0] = 2.5f;
		//interpreted as a double without the f
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("matrix["+i+"]["+j+"]="+matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] raggedArray = new int[3][];
		raggedArray[0] = new int[2];
		raggedArray[1] = new int[1];
		raggedArray[2] = new int[3];
		
		
		int[] grades = new int[] {9, 10, 5};
		Student s4 = new Student ("Maria", 23, Tuition.BUDGET, grades);
		System.out.println(s4.grades[0]);
		
		grades[0] = 99;
		System.out.println(s4.grades[0]);

	}

}
