public class vowelConsonent {
    public static void main(String[] args) {
        System.out.print(vowelChecker("H"));
    }
    public static String vowelChecker(String checker){
        if((checker == "a")||(checker=="A") ||(checker == "e")||(checker=="E")||(checker == "i")||(checker=="I")||(checker == "o")||(checker=="O")||(checker == "u")||(checker=="U")){
            return "Vowel";
        }else{
            return "Consonent";
        }
    }
}
