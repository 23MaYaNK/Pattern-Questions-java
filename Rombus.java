import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the row you want to print:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        {
            for(int space=1;space<=line;space++)
            {System.out.print(" ");

            }
            for(int star=1;star<=n;star++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        sc.close();
    }
    
}
