package Part2;

public class SomeClass {
    private int x = 13;
    // Inner class

    public class InnerClass{
        public void print(){
            System.out.println("Inner class");
        }
    }
    // Local class
    public void someMethod(){
        class Local{
            public void printX(){
                System.out.println("X from local class: " +x);
            }
        }
        Local local = new Local();
        local.printX();


    }
//    public class Anonymous{
//        public void Method(){
//            SomeClass obj = new SomeClass();
//            obj.printX(new Super(){
//
//            })



    public static void main(String[] args) {
        SomeClass some = new SomeClass();
        SomeClass.InnerClass inner = some.new InnerClass();
        inner.print();
        some.someMethod();

    }
}
