import java.util.Scanner;

/**
 * Created by admin on 9/27/2019.
 */
public class Main {
    public static void main(String[] args) {
            Sm s1 =new Sm();

            System.out.println("tul:");
            Scanner scanner=new Scanner(System.in);
            String a = scanner.next();
            a=Integer.parseInt(a);

            System.out.println("arz:");
            String t =scanner.next();
            t=Integer.parseInt(a);
            s1.m(a,t);
            s1.s(a,t);



    }
}
