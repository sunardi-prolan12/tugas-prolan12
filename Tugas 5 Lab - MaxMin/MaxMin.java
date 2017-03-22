package maxmin;
import java.util.Scanner;

public class MaxMin {
    public static int max,min;
    public static void carimaksmin(int b1,int a[]){
        max=a[0];
        min=a[0];
        for(int i=1;i<b1;i++)
            if (max<a[i]){
                max=a[i];
            }
            else if (min>a[i]){
                min=a[i];
            }
    }
    public static void main(String[] args){        
        System.out.print("Banyaknya data = ");
        Scanner inputbanyak = new Scanner(System.in);
        int b1;
        b1=inputbanyak.nextInt();
       
        int a[]=new int[b1];
       
        int jml=0;
        for(int i=0;i<b1;i++){
            System.out.print("Bil["+i+"] = ");
            a[i]=inputbanyak.nextInt();
       
            jml+=a[i];
        }
        System.out.println("Jumlah data = "+jml);
       
        carimaksmin(b1,a);
        System.out.println("PilA (Max) = "+max);
        System.out.println("PilB (Min) = "+min);
    }

}