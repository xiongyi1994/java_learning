package keywords;

// this 不能放在静态代码块和方法中

public class This01 {

    private int a;
    public int b;
    protected int c;

    public void method() {
        System.out.println(this);
    }

    public This01() {

    }

    public static void main(String[] args) {
        This01 t = new This01();
        t.method();
    }
}
