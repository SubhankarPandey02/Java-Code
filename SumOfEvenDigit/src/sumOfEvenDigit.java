public class sumOfEvenDigit {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
    public static int getEvenDigitSum(int number){
//        if(number<0){
//            return -1;
//        }else{
//            int digits=0;
//            int sum=0;
//            while(number !=0){
//                digits= number%10;
//                if(digits%2==0){
//                    sum+=digits;
//                }
//                number/=10;
//            }
//            return sum;
//        }
        int sum=0;
        while(number > 0){
            int digits= number%10;
            if(digits % 2 == 0){
                sum+= digits;
            }
            number/=10;
//            return (number<0)? -1:sum;
        }
        return (number<0)? -1:sum;
    }
}
