public class perfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            //System.out.println("Invalid Number");
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return ((sum == number)? true:false);
    }
}

//Alternate solution
//public class PerfectNumber {
//    public static boolean isPerfectNumber(int number) {
//        int sum = 1;
//        if (number < 1) {
//            return false;
//        }
//        for(int i = 2; i < Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                sum += (i + number/i);
//            }
//        }
//        return sum == number;
//    }
//}
//Every whole divisor you find will have a "matching" pair. For example, if number = 50, then the first whole divisor is 2 and the "matching" pair is 25 because 2 x 25 = 50. Now if we keep iterating up, 3, 4, 5, we won't find the next whole divisor until 5 and the "matching" pair is 10. Note that the "matching" pair is getting smaller from 50 to 10, when we increment up the loop. That means that if we keep incrementing up the loop, the "matching" pair will only keep getting smaller. Thus, number/2 is the largest whole divisor if number happens to be divisible by 2. For example:
//
//if number = 6, then the divisors are 1, 2, 3, 6. Note that the divisor 2 has the "matching" divisor 3.
//
//if number = 10, then the divisors are 1, 2, 5, 10. Note that the divisor 2 has the "matching" divisor 5.
//
//if number = 32, then the divisors are 1, 2, 4, 8, 16, 32. Note that the divisor 2 has the "matching" divisor 16, and the divisor 4 has the "matching" divisor 8.
//
//Note that the "matching" pair moves "leftward" which is smaller in value, and that the greatest "matching" divisor not including number itself, is number/2. Therefore, you can optimize the loop iteration by stopping at number/2 because you won't find a divisor between number/2 and number. This "trick" will optimize the code performance by iterating half the number of iterations than if you iterate through the entire range between 1 and number.