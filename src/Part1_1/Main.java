package Part1_1;

public class Main {
    public static void main(String[] args) {
        Superclass a = new Subclass();
        a.theMethod(); // Object "a" is an instance of a Subclass
                       // so the overriden method of a Subclass will be called
    }
}
class Superclass{
       public void theMethod(){
           System.out.println("Method of superclass was called");
       }
}

class Subclass extends Superclass{
        @Override
        public void theMethod(){
            System.out.println("Method of subclass was called");
        }
}

