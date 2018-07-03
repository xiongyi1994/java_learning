package comparator;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	private String name;
	private int age;
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Student)){
			return false;
		}
		Student student = (Student)obj;
		if(student.name.equals(this.name) && student.age == this.age){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return name + "\t\t" + age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}

// 定义比较规则
class StudentComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.equals(s2)){
			return 0;
		}else if(s1.getAge() < s2.getAge()){
			return 1;
		}else{
			return -1;
		}
	}
}

public class ComparatorDemo01 {
	public static void main(String[] args) {
		Student stu[] = {new Student("张三", 20),
				new Student("李四", 22),
				new Student("王五", 20),
				new Student("赵六", 20),
				new Student("孙七", 22)};
		Arrays.sort(stu,new StudentComparator());
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}
}
