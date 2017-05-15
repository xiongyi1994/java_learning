package comparable;

import java.util.Arrays;

class Student implements Comparable<Student>{

	private String name;
	private int age;
	private float score;
	
	public Student(String name, int age, float score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString(){
		return name + "\t\t" + age + "\t\t" + score;
	}
	
	@Override
	public int compareTo(Student stu) { // 覆写compareTo()方法，实现排序规则的应用
		// TODO Auto-generated method stub
		if(this.score > stu.score){
			return -1;
		}else if(this.score < stu.score){
			return 1;
		}else{
			if(this.age > stu.age){
				return 1;
			}else if( this.age < stu.age){
				return -1;
			}else{
				return 0;
			}
		}
	}
	
}

public class Comparable02 {
	/*
	 * 使用比较器进行排序操作
	 */
	public static void main(String[] args) {
		Student stu[] = {new Student("张三", 20, 90.0f),
				new Student("李四", 22, 90.0f),
				new Student("王五", 20, 99.0f),
				new Student("赵六", 20, 70.0f),
				new Student("孙七", 22, 100.0f)};
		Arrays.sort(stu);
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}
}
