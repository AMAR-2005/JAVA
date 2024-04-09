import java.util.*;
import java.io.*;
class Main{
    public static void app(String s)throws IOException{

        FileWriter fw=new FileWriter("sam.txt");
        fw.write(s);
        System.out.print("APPENDED\n");
        fw.close();
        FileReader f=new FileReader("sam.txt");
        int i;
        while((i=f.read())!=-1){
            System.out.print((char)i);
        }
        f.close();

    }
    public static void main(String[] args)throws IOException{
        FileWriter fw=new FileWriter("sam.txt");
        Scanner s=new Scanner(System.in);
        String a="Hello! ";
        fw.write(a);
        fw.close();
        String b=s.nextLine();
        app(b);
    }
}