package stringbuffer;

public class Reverse {
	public static void main(String[] args) {
		/*
		 * stringBuffer.reverse()
		 * 将StringBuffer类的实例化对象反转
		 * */
		StringBuffer sb = new StringBuffer();
		sb.append("xiongyi");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
	}
}
