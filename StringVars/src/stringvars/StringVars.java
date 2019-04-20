
package stringvars;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class StringVars {

    public static void main(String[] args) {
    
        String First_Name = "rituraj";
        String Last_Name = "Sinha";
         
       System.out.println("My name is " + First_Name +" "+ Last_Name);
        Scanner user_input=new Scanner(System.in);
        System.out.print("tell me your new name: ");
        String New_Name=user_input.next();
       //New_Name=user_input.next();
        System.out.println("your new name is : " + New_Name);
       // learning new way to store and read user input
        //JOptionPane new_user_input_way=new JOptionPane();
        String New_input_method=JOptionPane.showInputDialog("type your name");
        JOptionPane.showMessageDialog(null,"enjoy!! " + " " + New_input_method,"Name",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        
    }
    
}
