package Task_11;

public class ArrayStringProgram {
    public static void main(String[] args) {
        // declare an array with values
        int[] numbers = {1,5,8,9};
        // fetching array element 
        try{
        int pick_number = numbers[4];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured at loaction: "+e.getMessage());
            
        }
        //declare a string 
        String str = "Hello from Guvi";
        //attempting to get the charector in the string 
        try{
            char pick_char = str.charAt(20);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
    
}
