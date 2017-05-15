package stringbuffer;

public class Insert {
	public static void main(String[] args) {
		/*
		 * insert(int offset, String str)
		 * 在索引offset处插入str
		 * */
		StringBuffer sb = new StringBuffer("xiongyi");
		System.out.println(sb);
		sb.insert(1,"123");
		System.out.println(sb);
	}
}
