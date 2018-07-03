package string;

public class HashCode {
	/*
	 * String类型的hash值计算方法
	 * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	 * */
	public static void main(String[] args) {
		String string = new String();
		string = "xiongyi";
		System.out.println(string.hashCode());
	}
}
