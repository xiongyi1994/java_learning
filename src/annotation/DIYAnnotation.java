package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

public class DIYAnnotation {

    /*
    * 自定义注解
    * 格式：public @interface 注解名 {定义体}
    * */

    /*
    * 水果名称注解
    * */
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface FruitName {
        String value() default "";
    }

    /*
    * 水果颜色注解
    * */
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface FruitColor {

        // 颜色枚举
        public enum Color { BLUE,RED,GREEN }

        // 颜色属性
        Color fruitColor() default Color.GREEN;

    }

    static class Apple {

        @FruitName
        private String appleName;

        @FruitColor(fruitColor = FruitColor.Color.RED)
        private String appleColor;

        public String getAppleName() {
            return appleName;
        }

        public void setAppleName(String appleName) {
            this.appleName = appleName;
        }

        public String getAppleColor() {
            return appleColor;
        }

        public void setAppleColor(String appleColor) {
            this.appleColor = appleColor;
        }

    }

    public static void main(String[] args) {

    }
}
