import java.util.Scanner;

public class FabionacciSeries {

    public static int nFabionacciSeries(int n){
        if(n==0 || n==1){
            //System.out.print(n+",");
            return n;
        }
        int num=nFabionacciSeries(n-1)+nFabionacciSeries(n-2);
        System.out.print(num+",");
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nFabionacciSeries(n);
        sc.close();
    }
}
