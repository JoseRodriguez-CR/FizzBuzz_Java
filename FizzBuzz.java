public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"

        for(int i =0; i < number; i++ ){
            if(( i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
                return "FizzBuzz";
            }
            if( i % 3 == 0 ){
                System.out.println("Buzz");
                return "Buzz";
            }
            if( i % 5 == 0){
                System.out.println("Fizz");
                return"Fizz";
            }
            System.out.println("The number is: " + number);
            return Integer.toString(number);
            //or a String cast of the number itself. 
            // Hint: You can use a String method to cast the int to a String.
        }
    }
}
