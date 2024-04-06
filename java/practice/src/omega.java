import java.util.*;
class omega{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        int l=a.length();
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        String r=sb.toString();
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(i==j){
                    System.out.print(a.charAt(i));
                }
                else if(i+j==l-1){
                    System.out.print(r.charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}