import java.util.*;
class PalindromeRangeNtoM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int n=sc.nextInt();
        System.out.print("\nEnter Ending Number: ");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            int h=i;
            int r=0,g=0;
            while(h!=0){
                r=h%10;
                g=g*10+r;
                h=h/10;
            }
            if(g==i){
                System.out.print(i+" ");
            }
        }
    }
}