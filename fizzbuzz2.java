public class fizzbuzz2 {
    

    public static void main(String[] args) {

        for (int i=1; i <= 100; i++){

            if((i%5 == 0) && (i%3 == 0)){
                System.out.print(i + " FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.print(i + " Fizz");
            }
            else if(i%5 == 0){
                System.out.print(i + " Buzz");
            }
            else
                System.out.print(i);

                System.out.println();
        }
    }
}