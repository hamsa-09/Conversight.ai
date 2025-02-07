// import java.util.*;

// public class EmailValid{
//      static boolean isValid(String s){
//         if( s.contains("@")&& s.contains(".") && !s.contains("@.")&&
//         !s.contains(".@")){
//             int atIndex=s.indexOf('@');
//             int dotIndex=s.indexOf(".");
//             if(atIndex==s.lastIndexOf('@') && dotIndex==s.lastIndexOf('.') && dotIndex!=atIndex+1 && atIndex>0 && dotIndex>atIndex && dotIndex<s.length()-1)
//             {
//                 String lastname=s.substring(atIndex+1);
//                 return lastname.contains("gmail" )&& lastname.endsWith(".com");
//             }
//         }
//         return false;
//      }
//     public static void main(String[] args) {
//         String email="ham@sagmail.com";
//         if(isValid(email)){
//             System.out.println("Valid");
//             return;
//             }
//         System.out.println("Invalid");
//     }
// }
import java.util.*;
public class EmailValidation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        boolean dot = false;
        boolean at = false;
        int atCount = 0;
        int dotCount = 0;


        // condition to check  the email starts with  @, .
        if(email.charAt(0) == '@' || email.charAt(0) == '.' )
        {
            System.out.println("It's Not a valid Email Id");
            return;
        }



        //iterate Each Character of the Email
        if(email.contains("gmail") && email.contains("@") && email.contains(".")&& email.contains("com")){
            for(int i = 0; i < email.length(); i++){

                //dot comes before || more than one times of @ or .
                if((dot == true && at == false) || atCount > 1 || dotCount > 1 ) {
                    System.out.println("It's Not a valid Email Id");
                    return;
                }

                //increment of @
                if(email.charAt(i) == '@'){
                    at = true;
                    atCount++;
                }

                //increment of .
                if(email.charAt(i) == '.'){
                    dot = true;
                    dotCount++;

                }
            }
        System.out.println("It is Valid EmailId");
        }else{
        System.out.println("It is Not Valid EmailId");

        }



        sc.close();
    }
}
