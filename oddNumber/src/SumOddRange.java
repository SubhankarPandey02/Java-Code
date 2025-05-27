public class SumOddRange {
    public static void main(String[] args) {
//        isOdd(2);
//         sumOdd(1,100);
//         sumOdd(-1,100);
//         sumOdd(100,100);
//         sumOdd(13,13);
//         sumOdd(100,-100);
         sumOdd(100,1000);
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
//        if (number < 0) {
//            return false;
//        } else if (number % 2 != 0) {
//            return true;
//        } else {
//            return false;
//        }
  }
    public static int sumOdd(int start , int end){
        int sum = 0;
        if((end < start) || (end < 0) || (start <0)){
            return -1;
        }else{
            for(int i =((isOdd(start)?start:start+1));i<=end;i+=2){
                sum+=i;
            }
        }
        return sum;
    }
}

