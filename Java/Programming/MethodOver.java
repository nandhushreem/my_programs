/* 
class Animal{
    void move(){
        System.out.println("Inside the animal class");
    }
    void display(){
        System.out.println("display method ");
    }
}
class Cat extends Animal{
    @Override void move(){
        System.out.println("inside the cat class");
    }
}
public class MethodOver{
    public static void main(String[] args){
        Cat c=new Cat();
         c.move();
    }
}
*/

class Outer{
    int age = 10;
    String name = "ravi";
    void display(){
        System.out.println("inside Outer class");
        Inner obj = new Inner();
        obj.display();
    }
    class Inner{
        double cgpa = 9.0;
        void display(){
            System.out.println("inside Inner class");
            System.out.println(age);
            System.out.println(name);
            System.out.println(cgpa);
        }
    }
}
public class MethodOver{
    public static void main(String[] args){
        Outer obj = new Outer();
        obj.display();
    }
}
