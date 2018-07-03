package access_modifier;

class OutterClass{
    private int a = 1;
}

public class Private01 {

    static class InnerClass{
        private int a = 0;
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.a);

        OutterClass outterClass = new OutterClass();
        // System.out.println(outterClass.a);
    }
}
