package designPatterns;

public class Decorator01 {
	
	/*
	 * 装饰模式
	 * 动态的给一个一个类增加新的功能
	 * */
	
	static interface Sourceable {
		public void method();
	}
	
	static class Source implements Sourceable {

		@Override
		public void method() {
			System.out.println("this is the original method");
		}
		
	}
	
	static class Decorateor implements Sourceable {

		private Sourceable source;
		
		public Decorateor(Sourceable source) {
			super();
			this.source = source;
		}
		
		@Override
		public void method() {
			System.out.println("before decorator");
			source.method();
			System.out.println("after decorator");
		}
		
	}
	
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorateor(source);
		obj.method();
	}
	
}
