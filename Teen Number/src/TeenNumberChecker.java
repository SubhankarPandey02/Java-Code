public class TeenNumberChecker {
    public static void main(String[] args) {
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1>=13 || num2 >=13 || num3 >= 13) &&(num1>=19 || num2 >=19 || num3 >= 19)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isTeen(int number){
        if((number < 13)||(number>19)){
            return false;
        }else{
            return true;
        }
    }
}
