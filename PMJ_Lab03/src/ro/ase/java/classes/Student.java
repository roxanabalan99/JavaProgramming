package ro.ase.java.classes;

public class Student {
	//default, public - visibilities for classes
	//default - doesn't have a public keyword; cannot be used by classes from another package
	
	private String name;
	private int age;
	public Tuition tuition;
	public int[] grades;
	//private, public, protected, default
	//protected - can be accessed by that class & inherited classes & package classes
	//default - package only
	
	public Student() {
		name = "Anonymous";
		age = 18;
		tuition = Tuition.TAX;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public Student(String name, int age, Tuition tuition, int[] grades) {
		super();
		this.name = name;
		this.age = age;
		this.tuition = tuition;
		//this.grades = grades;
		if(grades != null) {
			this.grades = new int[grades.length];
			for(int i = 0; i < grades.length; i++) {
				this.grades[i] = grades[i];
			}
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//overriding only works on virtual methods
	//if the method is not virtual - hiding/shadowing - the new one will hide the other one(like it doesn't exist)
	//in  java all methods are virtual

	@Override
	public Object clone() {
		Student copy = new Student();
		copy.name = name;
		copy.age = age;
		copy.tuition = tuition;
		return copy;
	}
	
	
	
}
