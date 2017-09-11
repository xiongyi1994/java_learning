package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


public class Target {

	/*
     * @Target说明了Annotation所修饰的对象
	 * 可被用于package、type（类、接口、枚举、Annotation类型）、类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量
	 * 在Annotation类型的声明中使用了target可更加明晰其修饰的目标
	 * 
	 * 作用：用于描述注解的使用范围（即：被描述的注解可以用在什么地方）
	 * 
	 * 取值（Element）：
	 * 
	 * 　 1.CONSTRUCTOR:用于描述构造器
　　　*　  2.FIELD:用于描述域
　　　*　  3.LOCAL_VARIABLE:用于描述局部变量
　　　*　  4.METHOD:用于描述方法
　　　*　  5.PACKAGE:用于描述包
　　　*　  6.PARAMETER:用于描述参数
　　　*　  7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
	 * 
	 * */

    public static void main(String[] args) {

    }
}
