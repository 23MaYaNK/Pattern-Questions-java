import java.util.Scanner;

public class MirrorImagesTriangle {
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
    int count1=n;
    for(int line=1;line<=n-1;line++)
    {
        for(int space=(n-1)-line;space>=1;space--)
        {
            System.out.print(" ");

        }
        for(int num=count1-1;num<=n;num++ )
        {
            System.out.print(num+" ");
        }
        System.out.println();
        count1--;
    }
    sc.close();
    }
    
}
