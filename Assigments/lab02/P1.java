public class P1{
     public static void main(String[] args) {
        char myChar = 'g';
        String myStr = Character.toString(myChar);

        int length = myStr.length();

        if ( myChar >= 64 && myChar <= 90 || myChar >= 97 && myChar <= 122) {
            
            if (   myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' 
                || myChar == 'u' || myChar == 'A' || myChar == 'E' || myChar == 'I' 
                || myChar == 'O' || myChar == 'U' ) 
            {
                System.out.println("Input letter is Vowel");
            }
            else
            {
                System.out.println("Input letter is Consonant");
   
            }


        }
        else if ( !(myChar >= 64 && myChar <= 90) || !(myChar >= 97 && myChar <= 122) ){

            System.out.println("**Error : the user input is not a letter");
            
        }
        else if ( length > 1 ) {
            System.out.println("** More than one character entered **");
        }

        
       
    }
}