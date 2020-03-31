import java.util.Scanner;

public class CompileTime {
    public static int power(int a){
        return a*a;
    }
    public static int power(int a,int b){
        int i,p=1;
        if(b==0)
            return 1;
        for(i=1;i<=b;i++)
            p=p*a;
        return p;
    }
    public static int power(int a,int b, String s){
        System.out.println(s);
        return power(a,b);
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        String s="Acest program afiseaza puterea a^b";
        System.out.println(power(a));
        System.out.println(power(a,b));
        System.out.println(power(a,b,s));
        sc.close();
    }
}
