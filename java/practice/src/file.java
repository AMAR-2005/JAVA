import java.util.*;
import java.io.*;
class file{
    public static void app(String s)throws IOException{

        FileWriter fw=new FileWriter("sam.txt");
        String a="Hello! ";
        fw.write(a);
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
        String b=s.nextLine();
        app(b);
    }
}