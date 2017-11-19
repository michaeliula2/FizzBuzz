/**
 *
 * @author michaeliula
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a loop that will count from 1 to 100
        for(int i = 1; i < 101;i++){
            //If i is divisible by 3 and 5 without any remainder then print 'FizzBuzz'
            if(i%3 == 0 && i%5 == 0){
            System.out.println("FizzBuzz");
            }
            //Other wise if i is divisible by just 3 print 'Fizz'
            else if(i%3 == 0){
            System.out.println("Fizz");
            }
            //Otherwise if i is divisible by just 5 print 'Buzz'
            else if(i%5 == 0){
            System.out.println("Buzz");    
            }
            //If all the above is not true then simply print the number.
            else{
                System.out.println(i);
            }
        }
    }
}