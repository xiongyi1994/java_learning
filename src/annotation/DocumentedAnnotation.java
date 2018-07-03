package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

public class DocumentedAnnotation {

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface Column {
        String name() default "fieldName";
        String setFuncName() default "setField";
        String getFuncName() default "getField";
        boolean defaultDBValue() default false;
    }

    /*
    * Documented用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。
    * Documented是一个标记注解，没有成员。
    * */

    public static void main(String[] args) {

    }

}
