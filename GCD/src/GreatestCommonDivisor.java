public class GreatestCommonDivisor {
    public static void main(String[] args) {
    }

    //public static int getGreatestCommonDivisor(int a, int b) {
        public static int getGreatestCommonDivisor ( int a, int b){
            if ((a < 10) || (b < 10)) {
                return -1;
            }
            int Min = Math.min(a, b);
            for (int i = Min; i >= 1; i--) {
                if ((a % i == 0) && (b % i == 0)) {
                    return i;
                }
            }
            return 1;
        }
    }
