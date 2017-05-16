package reflection;

import java.lang.reflect.Constructor;

interface China {
	public static final String NATIONAL = "China";
	public static final String AUTHOR = "李兴华";
	public void sayChina();
	public String sayHello(String name, int age);
}

class Person02 implements China{

	private String name;
	private int age;
	
	public Person02(){
		
	}
	
	public Person02(String name){
		this.name = name;
	}
	
	public Person02(String name, int age){
		this(name);
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
	
	@Override
	public void sayChina() {
		// TODO Auto-generated method stub
		System.out.println("作者：" + AUTHOR + "，国籍：" + NATIONAL);
	}

	@Override
	public String sayHello(String name, int age) {
		// TODO Auto-generated method stub
		return name + "，你好！我今年" + age + "岁了！";
	}
	
}

public class Class05 {
	/*
	 * 反射的应用：取得类的结构
	 * */
	public static void main(String[] args) {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("reflection.Person02");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces(); // 取得实现的全部接口
		for (int i = 0; i < c.length; i++) {
			System.out.println("实现的接口名称：" + c[i].getName());
		}
		
		Class<?> c2 = c1.getSuperclass(); // 取得父类
		System.out.println("父类名称：" + c2.getName());
		
		Constructor<?> con[] = c1.getConstructors(); // 取得所有的构造方法
		for (int i = 0; i < con.length; i++) {
			System.out.println("构造方法：" + con[i]);
		}
	}
	
}
