import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the row you want to print the pattern for :");
        int n=sc.nextInt();
        int m=n;
        for(int line=1;line<=n;line++)
        {
            for(int space=1;space<=m-1;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++)
        {
            System.out.print("*");
        }
        System.out.println();
        m--;
        }
        sc.close();
    }
    
}
