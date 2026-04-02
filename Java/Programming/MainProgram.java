import java.util.Scanner;
public class MainProgram{
    public static void main(String[] args){
        java.util.Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0){
                count++;
            }
        }
        System.out.println(count);


    }
}