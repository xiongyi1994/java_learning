package string;

/**
 * describe:
 *
 * @author xiongyi
 * @date 2020/05/31
 */
public class getBytes {
    public static void main(String[] args) {
        String a = "a";
        char c = 'c';
        System.out.println(String.valueOf((char)Integer.MAX_VALUE).getBytes().length);
        byte[] bytes = a.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }
}
