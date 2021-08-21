package ifelse;

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {

        String username = "shuvo";
        String pass = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your user name: ");
        String _username = scanner.next();
        System.out.println("Type your password: ");
        String _pass = scanner.next();

        if ((username.contentEquals(_username)) && (pass.contains(_pass))){
            System.out.println("login successfully");

        }else{
            System.out.println("login failed");
        }





    }
}
