import java.util.Scanner;

public class ReverseHollowTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the row you want to print for the pattern:");
        int n=sc.nextInt();
        int m=n;
        for(int line =1;line<=n;line++)
        {
            for(int space=1;space<=line-1;space++)
            {
                System.out.print(" ");
            }
           
            for(int star=2*m-1;star>=1;star--)
            {
                if(line==1 ||star==1 || star==(2*m-1))
                {

                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
            m--;


        }

        sc.close();
    }
    
}