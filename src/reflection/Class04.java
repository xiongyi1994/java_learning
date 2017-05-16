package reflection;

import java.lang.reflect.Constructor;

class Person01 {
	private String name;
	private int age;
	public Person01(String name,int age) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setAge(age);
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
	public String toString(){
		return "姓名：" + this.name + "，年龄：" + this.age;
	}
}

public class Class04 {
	/*
	 * 调用有参构造实例化对象
	 * */
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("reflection.Person01");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Person01 person01 = null;
		Constructor<?> cons[] = null; // 声明一个表示构造方法的数组
		cons = c.getConstructors(); // 通过反射取得全部构造
		try {
			person01 = (Person01) cons[0].newInstance("李兴华", 30);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(person01);
	}
	
}
