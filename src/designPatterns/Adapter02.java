package designPatterns;

public class Adapter02 {
	
	/*
	 * 对象的适配器模式
	 * */
	
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
	
	static class Wrapper implements Targetable{
		
		private Source source;
		
		public  Wrapper() {
			super();
		}
		
		@Override
		public void method1() {
			  
		}

		@Override
		public void method2() {
			
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
