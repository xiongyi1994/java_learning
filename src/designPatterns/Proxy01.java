package designPatterns;

public class Proxy01 {
	/*
	 * 代理模式
	 * 代理类 替 原对象 进行一些操作
	 * */
	
	static interface Sourceable {
		public void method ();
	}
	
	static class Source implements Sourceable {

		@Override
		public void method() {
			System.out.println("this is original method");
		}
		
	}
	
	static class Proxy implements Sourceable {

		private Source source;
		
		public Proxy() {
			super();
			this.source = new Source();
		}
		
		@Override
		public void method() {
			
			before();
			source.method();
			after();
			
		}

		private void after() {
			System.out.println("before proxy");
		}

		private void before() {
			System.out.println("after proxy");
		}
		
	}
	
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}
