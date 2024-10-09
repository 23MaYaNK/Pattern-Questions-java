import java.util.Scanner;

public class RightPasacalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the line for pattern:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        { 
            for(int star=1;star<=line;star++)
            {
                if((line%2==0 && star%2==0 )|| (line%2!=0 && star%2!=0 ))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int line=n-1;line>=1;line--)
        { 
            for(int star=1;star<=line;star++)
            {
                if((line%2!=0 && star%2!=0) || (line%2==0 && star%2==0 ))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
