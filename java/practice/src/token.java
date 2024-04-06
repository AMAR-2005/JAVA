import java.util.*;
 
public class token
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
 
        StringTokenizer result = new StringTokenizer(str);
 
        List<String> tokens = new ArrayList<String>();
        while (result.hasMoreTokens()) {
            tokens.add(result.nextToken());
        }
        System.out.println(tokens);
    }
}