package transformation;

public class Question01 {
	static class Base {
		private String baseName = "base";
		public Base(){
			callName();
		}
		public void callName(){
			System.out.println(baseName);
		}
	}
	static class Sub extends Base{
		private String baseName = "sub";
		public void callName(){
			System.out.println(baseName);
			System.out.println(111);
		}
	}
	public static void main(String[] args) {
		Base base = new Sub();
	}
}
