import java.util.Scanner;

public class Zero_One_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of rows:");
        int n=sc.nextInt();
        for(int line =1;line<=n;line++)
        {
            for(int num=1;num<=line;num++)
            {
                if((line%2!=0 && num%2!=0) || (num%2==0 && line%2==0))
                {
                    System.out.print("1");
                }
                else if((line%2==0 && num%2!=0) ||(line%2!=0 && num%2==0))
                {
                    System.out.print("0");
                }
                
                


            }
            System.out.println();
        }

        sc.close();
    }
    
}
