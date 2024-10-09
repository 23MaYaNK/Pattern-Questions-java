import java.util.Scanner;

public class NumberIncreaseReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for the no. of the you want to print:");
        int n=sc.nextInt();
        for(int line=n;line>=1;line--)
        {
            for(int num=1;num<=line;num++)
            {
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
