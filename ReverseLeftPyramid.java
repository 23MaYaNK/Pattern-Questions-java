import java.util.Scanner;

public class ReverseLeftPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of the rows that you want to print:");
        int n=sc.nextInt();
        int m=n;
        for(int line=1;line<=n;line++)
        {
            for(int space=1;space<=line-1;space++)
            {
                System.out.print(" ");

            }
            for(int star=m;star>0;star--)
            {
                System.out.print("*");
            }
            System.out.println(); 
            m--;

        }
        sc.close();
    }
}
