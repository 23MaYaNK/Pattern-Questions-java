

import java.util.Scanner;

public class Numbertriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of lines for the Pattern:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
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
