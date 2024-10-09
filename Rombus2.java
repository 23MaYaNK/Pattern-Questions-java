import java.util.Scanner;

public class Rombus2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the row you want to print:");
        int n=sc.nextInt();
        int m=n;
        for(int line=1;line<=n;line++)
        {
            for(int space=m-1;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++)
            {
                System.out.print("*");

            }
            System.out.println();
            m--;
        }



        sc.close();
    }
    
}
