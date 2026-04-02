public class Ternary {
    public static void main(String args[]) {
        int a=30;
        int b=5;
        int c=8;
        int max=(a>b)?a:b;   //(a>b)?((a>c)?a:c):((b>c)?b:c);
        max=(c>max)?c:max;
        System.out.println("Max value is: "+max);
    }
}
