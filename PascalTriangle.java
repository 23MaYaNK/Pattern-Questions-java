import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line you want in pattern:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        {
            for(int space=n-1;space>=line;space--)
            {
                System.out.print(" ");
            }
            for(int num=1;num<=line;num++)
            {
                if(num==1 || num==line)
                System.out.print("1 ");
                else
                {
                    System.out.print(line-1 +" ");
                }

            }
            System.out.println();
        }
        sc.close();

    }
    
}
