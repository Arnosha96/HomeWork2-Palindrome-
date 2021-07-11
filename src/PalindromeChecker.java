public class PalindromeChecker implements Palindrome {
    private int number;

    @Override
    public boolean isPalindrome(int x) {
        int reverseNumber = 0;
        if (x<0){
            x = Math.abs(x);
            number = x;
        }else {
            number = x;
        }

        while (number > 0){
            int mod = number % 10;
            reverseNumber = reverseNumber * 10 + mod;
            number = number / 10;
        }

        if (x == reverseNumber){
            System.out.format("Number %s is palindrome!\n", x);
            return true;
        }else
            System.out.format("Number %s isn't palindrome!\n", x);
            return false;
    }


}
