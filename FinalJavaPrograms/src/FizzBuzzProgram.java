public class FizzBuzzProgram {


    public static void main(String[] args) {
        //Given an integer n, for every integer i <= n, the task is to print “FizzBuzz” if i is divisible by 3 and 5, “Fizz” if i is divisible by 3, “Buzz” if i is divisible by 5
        int n = 10;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":" + "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ":" + "Fizz");

            } else if (i % 5 == 0) {
                System.out.println(i + ":" + "Buzz");

            }
        }


    }
}


