import java.util.Scanner;

public class ChocolatesAmongChildren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of chocolates:");
        int n=sc.nextInt();
        System.out.println("number of childrens:");
        int m=sc.nextInt();
        if (m == 0) {
            System.out.println("chocolates cannot be distrubuted");
            return;
        }
        int chocolatesPerChildren=n/m;
        int remainingchocolates=n%m;
        System.out.println("chocolates per children:"+chocolatesPerChildren+" and remaining chocolates are:"+remainingchocolates);
        

    }
    
}