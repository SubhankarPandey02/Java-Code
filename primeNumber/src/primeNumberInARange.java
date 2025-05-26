public class primeNumberInARange {
    public static void main(String[] args) {
//        System.out.println("8 Is" + (isPrime(8) ? " " : " Not ") + "a Prime Number");
//        System.out.println("5 Is" + (isPrime(5) ? " " : " Not ") + "a Prime Number");
//        System.out.println("2 Is" + (isPrime(2) ? " " : " Not ") + "a Prime Number");
//        System.out.println("1 Is" + (isPrime(1) ? " " : " Not ") + "a Prime Number");
        int counter = 0;
        for (int i = 10; counter<3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                counter ++;
            }
//            if(counter == 3){
//                break;
//            }
        }
        System.out.println("Number of prime number between 10 and 50 is "+ counter);
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int counter =3;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
