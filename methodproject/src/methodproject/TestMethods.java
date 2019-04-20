
package methodproject;
import java.util.Scanner;
import methodproject.MyMethods;
public class TestMethods {


    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        int length;
        System.out.print("enter the length of rectangle : " );
        length = Integer.parseInt(user_input.next());
       int breadth;
       System.out.print("enter the breadth of rectangle : " );
        breadth = Integer.parseInt(user_input.next());
        MyMethods newarea=new MyMethods();
        int area=newarea.area(length,breadth);
       System.out.println("new area is" + " " + area);
    }
    
}
