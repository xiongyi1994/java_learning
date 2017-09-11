package annotation;

public class Inherited {

    /*
    * @Inherited 元注解是一个标记注解，@Inherited阐述了某个被标注的类型是被继承的。
    * 如果一个使用了@Inherited修饰的annotation类型被用于一个class，则这个annotation将被用于该class的子类。
    * */

    @java.lang.annotation.Inherited
    @interface Greeting {
        public enum FontColor {BULE, RED, GREEN};
        String name();
        FontColor fontColor() default FontColor.GREEN;
    }

    public static void main(String[] args) {

    }

}
