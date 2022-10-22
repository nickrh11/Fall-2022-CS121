public class PalindromeDetector {
    boolean isThisPalindrome(String Word, int charNum){
        if (Word.charAt(charNum) != Word.charAt(Word.length()-charNum-1)){
            return false;
        }
        else if (charNum == Word.length()-1) {
            return true;
        }
        else {
         return isThisPalindrome(Word, ++charNum);
        }
    }
}
