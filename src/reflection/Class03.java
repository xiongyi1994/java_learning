package reflection;

class Person {
	private String name;
	private int age;
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

public class Class03 {
	/*
	 * Class类在开发中最常见的用法就是实例化对象的操作
	 * 即可以通过一个给定的字符串（此字符串包含了完整的“包.类”的路径）来实例化一个类的对象
	 * 
	 * 通过无参构造实例化对象
	 * 
	 * newInstance()
	 * 
	 * */
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("reflection.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Person person = null;
		try {
			person = (Person) c.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		person.setName("李兴华");
		person.setAge(30);
		System.out.println(person);
	}
	
}
