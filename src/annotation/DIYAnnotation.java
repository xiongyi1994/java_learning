package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class DIYAnnotation {

    /*
    * 自定义注解
    * 格式：public @interface 注解名 {定义体}
    * */

    /*
    * 水果名称注解
    * */
    @Target(ElementType.FIELD)
    public @interface FruitName {
        String value() default "";
    }

    public static void main(String[] args) {

    }
}
