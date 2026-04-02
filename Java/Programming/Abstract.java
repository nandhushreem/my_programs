
/*abstract class

abstract class Vehicle {
    abstract void move(int wheels); // abstract method

    void display() { // concrete method
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle { // Car class is a subclass of Vehicle class
    void move(int wheels) { // implementing the abstract method
        System.out.println("Car has " + wheels + " wheels");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car car = new Car(); // creating an object of the subclass
        car.move(4); // calling the method of the subclass
        car.display(); // calling the method of the superclass
    }
}   */
//abstract class is a class which is declared with the abstract keyword and it can have both abstract and concrete methods
//abstract method is a method which is declared with the abstract keyword and it has no implementation
//concrete method is a method which is declared with the concrete keyword and it has implementation
//we can't create an object of an abstract class
//we can create an object of a subclass of an abstract class
//----------------------------------------------------------------

/* Develop a Java program that  
takes two integer operands and one operator from the user, perform Arithmetic  
operations and then prints the result*/
/* 
import java.util.Scanner;
public class Abstract {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            char op=sc.next().charAt(0);//to take the first character of  the operator from the user
            switch(op){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}
    */

//method overloading
class Abstract {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Abstract obj = new Abstract();
        System.out.println(obj.sum(5, 10));
        System.out.println(obj.sum(5, 10, 15));
    }
}