package designPatterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 **/
public class Proxy02 {

    interface Subject {
        String action();
    }

    static class RealSubject implements Subject {

        @Override
        public String action() {
            System.out.println("被代理类操作！！");
            return "被代理被类 结束！！";
        }
    }

    static class ProxyInvocationHandler implements InvocationHandler {

        protected Subject subject;

        public ProxyInvocationHandler(Subject subject) {
            this.subject = subject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("do something before in ProxyInvocationHandler");
            return method.invoke(subject, args);
        }

    }

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(subject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), proxyInvocationHandler);

        proxySubject.action();
    }

}
