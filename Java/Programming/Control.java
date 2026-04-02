import java.util.Scanner;
public class Control {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
    
}
