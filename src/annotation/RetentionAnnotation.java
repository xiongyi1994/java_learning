package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* Column注解的的RetentionPolicy的属性值是RUTIME,这样注解处理器可以通过反射，获取到该注解的属性值，从而去做一些运行时的逻辑处理
* */

public class RetentionAnnotation {

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Column {
        String name() default "fieldName";
        String setFuncName() default "setField";
        String getFuncName() default "getField";
        boolean defaultDBValue() default false;
    }

    /*
    * 定义了Annotation被保留的时间的长短：某些Anotation仅出现在源码中，而被编译器丢弃
    *
    * 作用：表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
    *
    * 取值（RetentionPoicy）有：
    * 1.SOURCE:在源文件中有效（即源文件保留）
    * 2.CLASS:在class文件中有效（即class保留）
    * 3.RUNTIME:在运行时有效（即运行时保留）
    * */

}
