public class PalindromWithoutTemp {

    public static void main(String[] args) {

        String str = "madam";
        if (isPalindrom(str)) {
            System.out.println(str + ":Is A Palindrom");
        } else {
            System.out.println(str + ":Is Not a Palindrom");
            System.out.println("Not Palindron String");
        }
    }

    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
}

