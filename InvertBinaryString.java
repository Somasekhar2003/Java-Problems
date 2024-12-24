import java.util.*;
class InvertBinaryString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Positive Integer:");
        int n=sc.nextInt();
        String binaryString=Integer.toBinaryString(n);
        StringBuilder invertBinary=new StringBuilder();
        for(char c:binaryString.toCharArray()){
            if(c=='0'){
                invertBinary.append('1');
            }
            else{
                invertBinary.append('0');
            }
        }
        System.out.println(Integer.parseInt(invertBinary.toString(),2));
    }
}