package designPatterns;

public class Adapter01 {

	/*
	 * 类的适配器模式
	 */

	static class Source {
		public void method1() {
			System.out.println("this is original method!");
		}
	}

	static interface Targetable {

		// 与原类中的方法相同
		public void method1();

		// 新类的方法
		public void method2();

	}

	static class Adapter extends Source implements Targetable {

		@Override
		public void method2() {
			System.out.println("this is the targetable method!");
		}

	}

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		Adapter adapter = new Adapter();
		adapter.method1();
		adapter.method2();
	}
}
