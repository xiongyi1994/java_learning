package designPatterns;

public class Adapter03 {
	
	/*
	 * 接口的适配器模式
	 * 接口中定义了太多方法，在一些实用类中并不都需要
	 * */
	
	static interface Sourceable {
		public void method1();
		public void method2();
	}
	
	static class Wrapper implements Sourceable {

		@Override
		public void method1() {}

		@Override
		public void method2() {}
		
	}
	
	static class SourceSub1 extends Wrapper {
		public void method1() {
			System.out.println("the sourceable interface's first Sub1!");
		}
	}
	
	static class SourceSub2 extends Wrapper {
		public void method2() {
			System.out.println("the sourceable interface's second Sub2!");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
