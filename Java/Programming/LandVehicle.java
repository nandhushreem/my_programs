//Class and Object(MODULE 2)

/* this is a class named Box which has three properties height,
 width and breadth and a method volume which calculates the volume of the box.
 We have created two objects of the class Box named b1 and b2 and assigned values
 to the properties of the objects and called the volume method to 
 calculate the volume of the box. We have also calculated the volume using local variable and 
 printed it. We have also printed the properties of the objects. 
 We have also closed the scanner object to prevent memory leak.
c

class Box{
    double height;
    double width;
    double breadth;
    void volume(){  //instance method
        System.out.println("Volume: "+(height*width*breadth));  
    }
}

public class LandVehicle {
    public static void main(String[] args){
        Box b1=new Box();  //object of the class Box
        Box b2=new Box(); 
        b1.height=10.0;
        b1.width=20.0;
        b1.breadth=30.0;
        b2.height=15.0;
        b2.width=25.0;
        b2.breadth=35.0;    
        System.out.println("Height: "+b1.height);
        System.out.println("Width: "+b1.width);
        System.out.println("Breadth: "+b1.breadth);
        double volume=b1.height*b1.width*b1.breadth;  // volume is a local variable so we didn't declare b1.volume because it is not a property of the class Box
        System.out.println("Volume: "+volume);
        System.out.println("Height: "+b2.height+" " + "Width: "+b2.width+" " + "Breadth: "+b2.breadth );
        double volume2=b2.height*b2.width*b2.breadth;
        System.out.println("Volume: "+volume2);
        b1.volume();
        b2.volume();
    }
}
    */

//-------------------------------------------------------------------------------------------

/*cresting class named car with properties and method


class Car{
    String brand="BMW";
    String model="X5";
    String color="Black";
    int seats=5;
    void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Seats: "+seats);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Car car1=new Car();
        car1.displayInfo();
    }
}
*/
//-------------------------------------------------------------------------------------------
/*creating class named person with properties like gender,name,age and method like walking and talking ,taking two obects 

class Person{
    String name;
    int age;
    String gender;
    void walking(){
        System.out.println(name+" is walking");
    }
    void talking(){
        System.out.println(name+" is talking");
    }
}
public class ClassObject {
    public static void main(String[] args){
        Person p1=new Person();
        p1.name="Nandhu";
        p1.age=20;
        p1.gender="Female";
        p1.walking();   
        p1.talking();
        Person p2=new Person(); 
        p2.name="Thyme";
        p2.age=25;
        p2.gender="Male";
        p2.walking();
        p2.talking();

    }
}
*/
//-----------------------------------------------------------------------------------------------

/*
class CellPhone{
    String name;
    String color;
    int mfd;
    String type;
    double price;
    void Phoneinfo(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Manufacturing Year: "+mfd);
        System.out.println("Type: "+type);
        System.out.println("Price: "+price);
    }
    void calling(){
        System.out.println(name+" is calling");
    }
}
public class ClassObject {
    public static void main(String[] args){
        CellPhone c1=new CellPhone();
        c1.name="iPhone 13 Pro Max";
        c1.color="Graphite";
        c1.mfd=2021;
        c1.type="Smartphone";
        c1.price=1099.99;
        c1.Phoneinfo();
        CellPhone c2=new CellPhone();
        c2.name="Samsung Galaxy S21 Ultra";
        c2.color="Phantom Black";
        c2.mfd=2021;
        c2.type="Smartphone";
        c2.price=1199.99;
        c2.calling();
    }
}
 why we useing instace variable because we can access the properties of the class using the object and 
 we can also call the method of the class using the object and 
 we can also create multiple objects of the class and assign different values 
 to the properties of the objects and call the method of the class using the objects.
 */
//--------------------------------------------------------------------------------------------------

 /*how can we pass the parameters to the method of the class and how can we return the value from the method of the class

 class Box{
    double h,w,b;
    double volume(){
        return h*w*b;  // we can't return the value from the method because the return type of the method is void and we can't change the return type of the method because it is already defined as void
    }
    double addedVolume(int a){ //parameterized method
        return (h*w*b)+a; 
    }
    void multiplyVolume(int c){
        System.out.println("Triple Volume: "+(h*w*b)*c);
    }
 }
 class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.h=10.0;
        b1.w=20.0;
        b1.b=30.0;
        System.out.println("Volume: "+b1.volume());
        int a=100;
        System.out.println("Added Volume: "+b1.addedVolume(a));
        int c=30;
        b1.multiplyVolume(c);

    }

}
*/
//--------------------------------------------------------------------------------------------------

/*i want to create a parameterized constructor which takes the values of the properties as parameters and also create a default constructor which assigns default values to the properties of the class
class Student{
    String name;
    int age;
    int marks1;
    int marks2;
    int marks3;
    Student(){  //default constructor
        name="NULL";
        age=0;
        marks1=0;
        marks2=0;
        marks3=0;
    }
    Student(String name,int age,int marks1,int marks2,int marks3){  //parameterized constructor
        this.name=name;
        this.age=age;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    void Average(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        double avg=(marks1+marks2+marks3)/3.0;
        System.out.println("Average Marks: "+avg);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Nandhu";
        s1.age=20;
        s1.marks1=85;
        s1.marks2=90;
        s1.marks3=95;
        s1.Average();
    }
}
*/
//--------------------------------------------------------------------------------------------------

/*method overloading

class calculation{
    void multiply(int a,int b){
        System.out.println("Multiplication: "+(a*b));
    }
    void multiply(double a,double b){
        System.out.println("Multiplication: "+(a*b));
    }
    void multiply(int a,int b,int c){
        System.out.println("Multiplication: "+(a*b*c));
    }
    double multiply(double a){
        return a*5.0;
    }
}
public class ClassObject {
    public static void main(String[] args){
        calculation c=new calculation();
        System.out.println(c.multiply(5));
        c.multiply(3, 4);
        c.multiply(5.0, 10.0);
        c.multiply(5, 10, 15);
    }
}
    */
//--------------------------------------------------------------------------------------------

/*create a class Addition with no parameter,1 parameter,2 parameters(int),2 parameters(double),with 2 parameters(int)return int...

class Addition{
    void add(){
        System.out.println("No Parameter");
    }
    void add(int a){
        System.out.println("One Parameter: "+a);
    }
    void add(int a,int b){
        System.out.println("Two Parameters: "+a+" "+b);
    }
    void add(double a,double b){
        System.out.println("Two Parameters: "+a+" "+b);
    }
    int addAndReturn(int a,int b){
        return a+b;
    }
}
public class ClassObject {
    public static void main(String[] args){
        Addition add=new Addition();
        add.add();
        add.add(5);
        add.add(5, 10);
        add.add(5.0, 10.0);
        System.out.println("Sum of Two Parameters: "+add.addAndReturn(5, 10));
    }
}
*/
//--------------------------------------------------------------------------------------------

/*constuctor overloading
class Box{
    double height;
    double width;
    double breadth;
    Box(){  //default constructor
        height=10.0;
        width=20.0;
        breadth=30.0;
    }
    Box(double h,double w,double b){  //parameterized constructor
        height=h;
        width=w;
        breadth=b;
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        System.out.println("Volume of Box 1: "+(b1.height*b1.width*b1.breadth));
        Box b2=new Box(15.0, 25.0, 35.0);
        System.out.println("Volume of Box 2: "+(b2.height*b2.width*b2.breadth));
    }
}
*/

/*Acess Modifiers (or) Acess Specifiers
class Box{
    private double height; //private variable can be accessed only within the class
    private double width;
    private double breadth;
    public void setDimensions(double h,double w,double b){  //public method can be accessed from outside the class
        height=h;
        width=w;
        breadth=b;
    }
    public double getVolume(){
        return height*width*breadth;
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.setDimensions(10.0, 20.0, 30.0);
        System.out.println("Volume of Box: "+b1.getVolume());
    }
}
    */
/*private access modifier
class Box{
    private double height;
    Box(){  //default constructor
        height=70.0;
    }
    public void display(){
        System.out.println("Height: "+height);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.display();
    }
}
*/
//--------------------------------------------------------------------------------------------

/*default access modifier

class Box{
    private double height;
    Box(){
        height=10.0;
    }
    public void display(){
        System.out.println("Height: "+height);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.display();
    }
}
    */
//--------------------------------------------------------------------------------------------
/*protected access modifier
class Box{
    protected double height;
    Box(){
        height=10.0;
    }
    protected void display(){
        System.out.println("Height: "+height);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.display();
    }
}
*/
//--------------------------------------------------------------------------------------------
/*public access modifier
class Box{
    public double height;
    Box(){
        height=100.0;
    }
    public void display(){
        System.out.println("Height: "+height);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.display();
    }
}
*/
/* 
class Box{
    static int h; //class variable
    int w,l;// instance variable
    static void display(Box box){  //static method
        System.out.println("Height: "+h+" "+ "Width: "+box.w+" "+"Length: "+box.l); // Access instance variables through the passed object
    }
}
public class ClassObject {
    public static void main(String[] args){
        Box b1=new Box();
        b1.h=10;
        b1.w=20;
        b1.l=30;
        Box.display(b1);
        Box obj2=new Box();
        Box.h=15;
        obj2.w=25;
        obj2.l=35;
        Box.display(obj2);
    }
}
*/
//--------------------------------------------------------------------------------------------
/*generic example for inheritance

class Animal{
    void sound_animal(){
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal{    //extend keyword is used to inherit the properties and methods of the parent class to the child class 
    void sound(){
        System.out.println("Cat meows");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Cow moos");
    }
}
public class ClassObject{
    public static void main(String[] args){
        Cat cat=new Cat();
        Dog dog=new Dog();
        Cow cow=new Cow();
        Animal animal=new Animal();
        animal.sound_animal();
        cat.sound();
        dog.sound();
        cow.sound();
        cow.sound_animal(); // calling the method of the parent class using the object of the child class
        Cat cat2=new Cat();
        Dog dog2=new Dog();
        Cow cow2=new Cow();
        cat2.sound(); 
        dog2.sound();
        cow2.sound();

    }
}
    */

//--------------------------------------------------------------------------------------------
/*Single Inheritance

class Vehicle{
    String name;
    Vehicle(){
        System.out.println("Vehicle Constructor");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Car Constructor");
    }
}
public class ClassObject {
    public static void main(String[] args){
        Car car=new Car();
        car.name="BMW";
        System.out.println("Car Name: "+car.name);
        
    }
}
*/
//--------------------------------------------------------------------------------------------
/*multilevel inheritance
class Vehicle{
    String name;
    Vehicle(){
        System.out.println("Vehicle Constructor");
    }
}
class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("FourWheeler Constructor");
    }
}
class Car extends FourWheeler{
    Car(){
        System.out.println("Car Constructor");
    }
}
public class ClassObject {
    public static void main(String[] args){
        Car car=new Car();
        car.name="BMW";
        System.out.println("Car Name: "+car.name);
    }
}
    */
//-------------------------------------------------------------------------------------------
//hirarchical inheritance
class Vehicle{
    int wheels;
    String type;
    Vehicle(){
        wheels = 10;
        type = "goods";
    }
    void display(){
        System.out.println("i am inside the vehicle class");
    }
}
class Car extends Vehicle{
    Car(){
        wheels = 4;
        type = "passanger";
    }
    void display_Car(){
        System.out.println(" No of wheels = "+wheels);
        System.out.println("type="+type);
    }

}

class Bus extends Vehicle{
    void display_Bus(){
        System.out.println(" No of wheels = "+wheels);
        System.out.println("type="+type);
    }

}
public class ClassObject{
    public static void main(String [] args) {
        Car c1 = new Car();
        c1.display_Car();
        Bus b1 = new Bus();
        b1.display_Bus();
    }
}




