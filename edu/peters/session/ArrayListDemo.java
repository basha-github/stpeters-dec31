package edu.peters.session;

import java.util.ArrayList;

class Student1{
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<ArrayList> universityList = new ArrayList<ArrayList>();	
			
	
	ArrayList<Student1> petersList = new ArrayList<Student1>();	
		
		
	petersList.add(new Student1(100 ,"Stu1"));
	petersList.add(new Student1(200 ,"Stu2"));
	petersList.add(new Student1(300 ,"Stu3"));
	petersList.add(new Student1(400 ,"Stu4"));
	petersList.add(new Student1(500 ,"Stu5"));
	petersList.add(new Student1(600 ,"Stu6"));
	petersList.add(new Student1(700 ,"Stu7"));
		
	
	
	ArrayList<Student1> mlrList = new ArrayList<Student1>();	
	
	
	mlrList.add(new Student1(1000 ,"Stu1"));
	mlrList.add(new Student1(2000 ,"Stu2"));
	mlrList.add(new Student1(3000 ,"Stu3"));
	mlrList.add(new Student1(4000 ,"Stu4"));
	mlrList.add(new Student1(5000 ,"Stu5"));
	mlrList.add(new Student1(6000 ,"Stu6"));
	mlrList.add(new Student1(7000 ,"Stu7"));
	
	
	universityList.add(petersList);
	universityList.add(mlrList);
	
	}

}
