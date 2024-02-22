public class SumOfDigit {
    public static void main(String[] args) {

        {
            int sum = 0;
            int r;
            int num = 199;

            while (true) {
                r = num % 10;
                sum = sum + r;
                num = num / 10;

                if (num == 0 && sum > 9) {
                    num = sum;
                    sum = 0;
                }

                System.out.println(sum);

                if (sum == 1) {
                    System.out.println(true);
                } else {
                    System.out.println(false);

                }


            }


        }
    }}

