public class primeNumber {
    public static void main(String[] args) {
        System.out.println("8 Is" + (isPrime(8) ? " " : " Not ") + "a Prime Number");
        System.out.println("5 Is" + (isPrime(5) ? " " : " Not ") + "a Prime Number");
        System.out.println("2 Is" + (isPrime(2) ? " " : " Not ") + "a Prime Number");
        System.out.println("1 Is" + (isPrime(1) ? " " : " Not ") + "a Prime Number");
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}