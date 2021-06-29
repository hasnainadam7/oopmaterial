
public class Q1 {
   
    public static void main(String[] args) {

        String[] arr ={"0","1","2","3","4","5","6"};
        //trying to reach 9th index String that in not in the String Arr
       
        try {
            System.out.println("\nTying to reach String ");
            // 
            System.out.println(arr[9]);
        } 
        //catching exceptions of index 9 array
        catch (Exception e) {
            //AS we know that compiler didnot get the value so the error comes which is handle by catch
            System.out.println("\n9th index String Not found Because of this Error \n");
            System.out.println("********"+e.getMessage()+"********\n");
            }
      
    }
    
}