
import java.util.Scanner;

public class DisplayArrayElements {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i;
        Scanner	sc=new Scanner(System.in);
        System.out.println("enter the array element to store");
        int n=sc.nextInt();
        int a[]=new int[10];
        System.out.println("enter the array element");
        for(i=0;i<=n;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("sum of Array elements are: ");
        for(i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }

    }
}


