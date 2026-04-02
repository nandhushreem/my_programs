import java.util.*;
public class UserInput {
    public static void main(String args[]){
        java.util.Scanner sc=new Scanner(System.in);
        int age;
        String name;
        long phoneNumber;
        float salary;
        char gender=sc.next().charAt(0);
        String department;
        int experience;
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        System.out.println("Enter your phone number: ");
        phoneNumber=sc.nextLong();
        System.out.println("Enter your salary: ");
        salary=sc.nextFloat();
        System.out.println("Enter your department: ");
        sc.nextLine(); // consume newline left by nextFloat()
        department=sc.nextLine();
        System.out.println("Enter your experience: ");
        experience=sc.nextInt();
        System.out.println("Employee name is "+name+ " and her age is "+age+" , her Phone Number is "+phoneNumber+"and Salary she getting is "+salary+"\nGender: "+gender+"\nDepartment: "+department+"\nExperience: "+experience);
    }
}
