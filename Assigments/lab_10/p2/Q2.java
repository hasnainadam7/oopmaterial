public class Q2 {
    public static void main(String[] args) {
        int[] arr ={15,20,14,57,12,67,47};
        
           for (int i = 8; i >= 0; i--) {
                try {
                   System.out.println(arr[i]);
               
           } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println(e.getMessage());
               
               }
       }
       }
}
