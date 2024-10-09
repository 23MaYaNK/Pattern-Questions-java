import java.util.Scanner;

public class ReverseNumTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the line:");
        int n=sc.nextInt();
        int count=1;
        for(int line=1;line<=n;line++)
        {
            for(int space=1;space<=line-1;space++)
        {
            System.out.print(" ");

        }
        for(int num=count;num<=n;num++)
            {
                System.out.print(num+" ");
            }
        System.out.println();
        count++;
    }
        sc.close();
        }

    }
    

