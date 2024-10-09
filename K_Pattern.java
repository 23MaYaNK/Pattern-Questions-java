import java.util.Scanner;

public class K_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=sc.nextInt();
        int m=n;
        for(int line=1;line<=n;line++)
        {
            for(int star=m;star>=1;star--)
            {
                System.out.print("*");
            }
            m--;
             System.out.println();
        }
        for(int line=1;line<=n-1;line++)
        {
            for(int star=1;star<=line+1;star++)
            {
                System.out.print("*");
            }
          
             System.out.println();
        }

        sc.close();
    }
    
}
