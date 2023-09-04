public final class Palindrome {

    private Palindrome() {}

    public static void main(String[] args) {
        var bool = checkIfPalindrome("osaid", 0);
        if(bool)System.out.printf("Yes\n");
        else System.out.printf("No\n");
        
        bool = checkIfPalindrome("OoHoO", 0);
        if(bool)System.out.printf("Yes\n");
        else System.out.printf("No\n");
    }

    public static boolean checkIfPalindrome(String value, int i){
        if(i == value.length()/2) return true;
        if(value.charAt(i) != value.charAt(value.length()-1-i)) return false;
        return checkIfPalindrome(value, i+1);
    }

}    
