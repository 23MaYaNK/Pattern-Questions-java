import java.util.Scanner;

public class HallowTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the lines:");
        int n=sc.nextInt();
        int m=n;
        for(int line=1; line<=n;line++)
    {
        for(int space=m-1;space>=1;space--)
        { 
            System.out.print(" ");

        }
       for(int star=1;star<=(2*line)-1;star++)
       {
        if(star==1 || line==n || star==((2*line)-1))
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

        sc.close();
    }
    
}
