package keywords;

public class Final01 {

	/*
	 * 使用final声明的类不能有子类
	 * 使用final声明的方法不能被子类所覆写
	 * 使用final声明的变量即称为常量，常量不可以修改
	 * 在使用final声明变量时，变量名要求全部用大写字母
	 * */
	public static void main(String[] args) {
		final int a;
		a = 10;
		System.out.println(a);
		//a = 20;
		//System.out.println(a);
		FinalEx01 finalEx01 = new FinalEx01();
		finalEx01.finalFunction();
	}
}
