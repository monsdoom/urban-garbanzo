import java.util.Scanner;
public class Test {
    static String input;

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        input = in.nextLine();

        String check = passCheck(input);
        System.out.println(check);
        System.out.println(has8());
    }
    public static String passCheck(String str){
        return null;
    }
    public static boolean has8(){
        if (input.length()<8){
            return false;
        }
        else 
        return true;
    }
    public static boolean hasNumber(){
        for( int i=0; i<=input.length();i++){
              char number =input.charAt(i);
            Character.isDigit(number);
        }
        if (input.isUpperCase())
        return true;

        else 
        return false;


    }
    public static boolean hasUpper(){
        for(int i=0;i<input.length();i++){
            char upper= input.charAt(i);
            Character.isUpperCase(upper);
        }
    }
    public static boolean hasLower(){
        for(int i=0;i<input.length();i++){
            char lower= input.charAt(i);
            Character.isLowerCase(lower); 
        }
    }   
}
//am1989