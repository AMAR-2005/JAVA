import java.util.*;
//AMAR
public class App {
    public static boolean p(int n){
        if(n<=1)
        return false;
        else
        {
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                return false;}
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int u=s.nextInt();
        int l=s.nextInt();
        int c=s.nextInt();
        int o=0;
        for(int i=u;i<=l;i++){
            int v=i;
            for(int j=2;j<=i;j++){
                if(p(j)){
                    while(v>0){
                        if(v%j!=0)
                        break;
                        else if(v%j==0){
                            v=v/j;
                            if(c==j)
                            o++;
                        }
                    }
                }
            }
        }
        System.out.print(o);
    }
}
