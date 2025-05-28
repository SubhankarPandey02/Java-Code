public class sumOfFirstAndLast {
    public static void main(String[] args) {
        System.out.println(sumOfFirstAndLast(121));
        System.out.println(sumOfFirstAndLast(0));
    }
    public static int sumOfFirstAndLast(int number){
       if(number < 0){
           return -1;
       }else{
           int lastDigit= number%10;
           int firstDigit=number;
           //int original=number; // if we don't use store the original into firstDigit then it will be an infinite loop bcz firstDigit while loop condition will not meet
           while(firstDigit >= 10){
               firstDigit/= 10;
           }
           return (lastDigit+firstDigit);
       }
    }
}
