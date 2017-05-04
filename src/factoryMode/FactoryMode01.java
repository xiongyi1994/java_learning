package factoryMode;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("吃苹果");
	}
}

class Orange implements Fruit {
	public void eat() {
		System.out.println("吃橙子");
	}
}

class Factory{ // 定义工厂类
	public static Fruit getInstance(String className){
		Fruit fruit = null;
		if("apple".equals(className)){
			fruit = new Apple();
		}
		if("orange".equals(className)){
			fruit = new Orange();
		}
		return fruit;
	}
}

public class FactoryMode01 {

	public static void main(String[] args) {
		
		Fruit fruit = null;
		
		fruit = Factory.getInstance(args[0]);
		
		if(fruit != null){
			fruit.eat();
		}
		
	}
	
}
