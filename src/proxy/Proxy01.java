package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 * **/
public class Proxy01 {

    interface Animal {
        void call();

        void jump();
    }

    interface Friend {
        void hello();
    }

    static class Cat implements Animal, Friend {

        @Override
        public void call() {
            System.out.println("喵喵喵");
        }

        @Override
        public void jump() {
            System.out.println("猫猫跳");
        }

        @Override
        public void hello() {
            System.out.println("Cats are humans' friends!");
        }
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Object proxy = Proxy.newProxyInstance(cat.getClass().getClassLoader(), cat.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + " 方法开始执行");
                        Object result = method.invoke(cat, args);
                        System.out.println(result);
                        System.out.println(method.getName() + " 方法执行结束");
                        return result;
                    }
                });
        Animal proxyCat = (Animal) proxy;
        proxyCat.call();
        proxyCat.jump();

        Friend proxyFriend = (Friend) proxy;
        proxyFriend.hello();
    }

}
