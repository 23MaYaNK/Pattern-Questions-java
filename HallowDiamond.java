import java.util.Scanner;

public class HallowDiamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the no. of the you want to print:");
        int n = sc.nextInt();
        int m = n;
        for (int line = 1; line <= n; line++) {
            for (int space = m - 1; space > 0; space--) {
                System.out.print(" ");
            }
            for (int num = 1; num <= 2 * line - 1; num++) {
                if(num==1 || num ==2*line-1)
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

        int p=n-1;
        for (int line=1;line<=n-1;line++) {
            
            for (int space = 1; space<=line; space++) {
                System.out.print(" ");
            }
            for (int num = 2*p-1; num >0; num--) {

                if(num==1 || num ==2*p-1)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            p--;
          

        }

        sc.close();
    }

}
