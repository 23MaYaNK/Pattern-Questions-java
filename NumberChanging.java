import java.util.Scanner;

public class NumberChanging {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for the no. of the you want to print:");
        int n=sc.nextInt();
        int count=1;
        for(int line=1;line<=n;line++)
        { 
            // for(int space=n-line;space>0;space--)
            // {
            //     System.out.print(" ");
            // }
            for(int num=1;num<=line;num++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
           
        }
        sc.close();
    }
    
}
