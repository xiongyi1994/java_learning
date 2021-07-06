package operator;

public class BitOperation {
    public static void main(String[] args) {

        System.out.println('a');
        System.out.println((char) (65535 - 20000));
        System.out.println((char) (Integer.MAX_VALUE - 20000 & 65535));

        /*
         * & 按位与运算符
         * */
        int a = 10;
        int b = 11;
        System.out.println(Integer.toString(a, 2)); // => 1010
        System.out.println(Integer.toString(b, 2)); // => 1011
        System.out.println(a & b); // => 10

        /*
         * >> 右移
         * 用符号位填充高位
         * */
        System.out.println(a >> 1); // -> 5
        System.out.println(a >> 2); // -> 2

        /*
         * << 左移
         * */
        System.out.println(a << 1); // -> 20   相当于 a * 2
        System.out.println(a << 2); // -> 40   相当于 a * 2^2

        /*
         * >>> 右移
         * 用0填充高位
         * */

        /*
         * ^ 按位异或
         * 相同为0，不同为1
         */
        System.out.println(a ^ b); // -> 1
    }
}
