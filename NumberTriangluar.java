import java.util.Scanner;

public class NumberTriangluar {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for the no. of the you want to print:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        { 
            for(int space=n-line;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int num=1;num<=line;num++)
            {
                System.out.print(line+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
