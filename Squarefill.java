import java.util.Scanner;

public class Squarefill {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for the no. of the you want to print:");
        int n=sc.nextInt();
     
        for(int line=1;line<=n;line++)
        { 
           
            for(int star=1;star<=n;star++)
            {
                System.out.print(" * ");
            }
            System.out.println();
           
        }
        sc.close();
    }
}
