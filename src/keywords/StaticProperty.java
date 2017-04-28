package keywords;

public class StaticProperty {
	
	/*
	 * static声明属性，则这个属性称为全局属性（静态属性、类属性）
	 * */
	
	static int a = 1;
	int b = 1;
	
	public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(b);   会报错。
	}
}
