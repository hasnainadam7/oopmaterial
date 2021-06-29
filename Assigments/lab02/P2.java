public class P2 {
    public static void main(String[] args) {
        int inputOne = 52, inputTwo = 35, inputThree = 23, greater;
        if ( inputOne >= inputTwo && inputOne >= inputThree) {
            greater = inputOne;
            System.out.println("> The 1st number(" + greater + ") is the greatest among three ");
        }
        else if (inputTwo >= inputOne && inputTwo >= inputThree) {
            greater = inputTwo;
            System.out.println("> The 2nd number(" + greater + ") is the greatest among three ");
        }
        else if (inputThree >= inputOne && inputThree >= inputTwo) {
            greater = inputThree;
            System.out.println("> The 3rd number(" + greater + ") is the greatest among three ");
        }
    }
    
}
