public class sumEven {
    public static void main(String[] args) {
        sumEven(10,20);
    }
    public static boolean isEven(int number){
        return (number > 0) && (number % 2 ==0);
    }
    public static int sumEven(int start , int end){
        int sum=0;
        if(start <0 || start > end){
            return -1;
        }else{
            for(int i=(isEven(start)?start:start+1); i<=end;i+=2){
                sum+=i;
            }
        }
        return sum;
    }
}
