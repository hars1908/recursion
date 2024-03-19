import java.util.Scanner;

public class NaturalNumbers{

    public static int firstNaturalNuber(int n){
        if(n==1){
            return n;
        }else{
            return firstNaturalNuber(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(firstNaturalNuber(n));
        sc.close();
    }
}