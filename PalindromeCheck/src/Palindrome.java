public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
    public static boolean isPalindrome(int number){
//        if(number<0){
//            number= -number;
//        }
        int reverse=0;
        int numberCheck = number;
        //int digits;
        while(number!= 0){
           // digits= number%10;
            reverse= reverse*10 + number%10;
            number= number/10;
        }
        return numberCheck==reverse ;
    }
}
