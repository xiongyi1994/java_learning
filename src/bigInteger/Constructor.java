package bigInteger;

import java.math.BigInteger;

public class Constructor {
	public static void main(String[] args) {
		/*
		 * BigInteger(String val)
		 * 将一个字符串变为BigInteger类型的数据
		 * */
		BigInteger bigInteger = new BigInteger("100000000000000000");
		System.out.println(bigInteger);
	}
}
