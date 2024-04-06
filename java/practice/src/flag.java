import java.util.*;
class flag{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=s.nextInt();
        int f=0,k=0;
        for(int i=0; i<n; i++){
            f=0;
            for(int j=0; j<i;j++){
                if(a[i]==a[j])
                f++;
            }
            if(f==0){
                b[k]=a[i];
                k++;
            }
        }
        int c=0;
        for(int i=0; i<k; i++){
            c=0;
            for(int j=0; j<n; j++){
                if(b[i]==a[j]){
                    c++;
                }
            }
            System.out.println(b[i]+" "+c);
        }
    }
}