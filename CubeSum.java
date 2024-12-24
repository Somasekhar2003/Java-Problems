import java.util.*;
class CubeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Start Number:");
        int n=sc.nextInt();
        System.out.print("Enter End number:");
        int m=sc.nextInt();
        int cubesum=0;
        for(int i=n;i<=m;i++){
            cubesum+=(i*i*i);
        }
        System.out.println("Sum of cubes from "+n+" to "+m+" = "+cubesum);
    }
}