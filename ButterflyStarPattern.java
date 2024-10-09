import java.util.Scanner;

public class ButterflyStarPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("enter the num of the line:");
int n=sc.nextInt();
for(int line=1;line<=2*n-1;line++)
{
    for(int star=1;star<=line;star++)
    {
        if((line%2!=0 && star%2!=0) ||(line%2==0 && star%2==0) )
        {
            System.out.print("*");

        }
        else
        {
            System.out.print("_");
        }
    }
    System.out.println();
}
        sc.close();
    }
    
}
