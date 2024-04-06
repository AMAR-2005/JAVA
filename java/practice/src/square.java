import java.util.*;
class square{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=2*n-1;
        for(int i=n;i>=1;i--){
            for(int j=l;j>=1;j--){
                if(i>=j || j+i>=2*n){
                    System.out.print("*  ");
                }
                else
                    System.out.print("   ");
            } 
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=l;j++){
                if(i>=j || j+i>=2*n){
                    System.out.print("*  ");
                }
                else
                System.out.print("   ");
            } 
            System.out.println();
        }
    }
}