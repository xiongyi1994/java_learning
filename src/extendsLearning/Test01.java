package extendsLearning;

public class Test01 {

    /**
     * 子类覆写父类的方法中可以通过Super.function()的方式调用父类相应的方法
     * */
    static class SuperClass {
        public void function() {
            System.out.println("父类方法");
        }
    }

    static class ChildClass extends SuperClass {

        @Override
        public void function() {

//			super.function();

            System.out.println("子类方法");

//			super.function();
        }

        public void function1() {
            System.out.println("子类方法1");
        }

    }

    public static void main(String[] args) {
        // 对象的多态性，对象向上转型
        SuperClass childClass = new ChildClass();
        childClass.function();
    }

}
