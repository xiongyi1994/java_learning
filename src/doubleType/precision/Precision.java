package doubleType.precision;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Precision {
	/*
	 * 精确double类型到小数点后多少位
	 * */
	public static void main(String[] args) {
		double pi = 3.154159;
		
		// method 1 bigDecimal
		BigDecimal bigDecimal = new BigDecimal(pi);
		System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		
		// method 2 DecimalFormat
		System.out.println(new DecimalFormat("#.00").format(pi));
		
		// method 3 String.format()
		System.out.println(String.format("%.2f", pi));
		
	}
}
