package extendsLearning;

public class Test02 {
	
	/*
	 * 
	 * 子类继承父类
	 * 
	 * 方法的访问限制
	 * 
	 * */
	
	static class SuperClass {
		
		public static void function_public_static () {
			System.out.println("父类公有静态方法");
		}
		
		private void function_private () {
			System.out.println("父类私有方法");
		}
		
		protected void function_protected() {
			System.out.println("父类保护方法");
		}
		
		public void function1 () {
			System.out.println("父类公有方法1");
		}
		
		public void function2 () {
			System.out.println("父类公有方法2");
		}
		
	}
	
	static class ChildClass extends SuperClass {
		
		public ChildClass() {
//			super().function_private();
		}
		
		// 父类私有方法不能被覆写
//		@Override
//		public void function_private () {
//			
//		}
		
		public static void function_public_static () {
			System.out.println("子类公有静态方法");
		}
		
		// 父类保护方法覆写时可以扩大访问限制为public
		// 但是不能缩小为private
		@Override
		protected void function_protected() {
			System.out.println("子类保护方法");
		}
		
	}
	
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.function_protected();
		ChildClass.function_public_static();
	}
	
}
