import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int i,j,temp;
        System.out.println("enter the array elements");

        for(i=0;i<5;i++);
        {
            a[i] = s.nextInt();
        }
        for(i=0;i<5;i++) {
            for ( j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

               for( j=0;j<5;j++) {
                   System.out.println(a[j]);
               }


        }

    }

