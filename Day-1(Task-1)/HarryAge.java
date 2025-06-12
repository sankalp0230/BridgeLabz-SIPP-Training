import java.util.*;
public class HarryAge{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int birthyear=sc.nextInt();
        int curryear=sc.nextInt();
        int age=curryear-birthyear;
        System.out.println(age);
    }
}