import java.util.*;
import java.text.*;
class date{
    public static void main(String[] args)throws ParseException{
        Scanner s=new Scanner(System.in);
        String d=s.nextLine();
        Date dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(d);
        String date=new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(dd);
        System.out.println(date);
    }
}