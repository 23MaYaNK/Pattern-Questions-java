import java.util.Scanner;

public class PallindromeTriangle {    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the row:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        {
            for(int space=n-1;space>=line;space--)
            {
                System.out.print(" ");
            }
            for(int star=line;star>=1;star--)
            {
                System.out.print(star);
            }
            for(int star=1;star<=line-1;star++)
            { if(star==1 &&line==1)
                {
                    break;
                }
                else
                {

                    System.out.print(star+1);
                }
            }
            System.out.println();
        }

        sc.close();
    }
    
}
