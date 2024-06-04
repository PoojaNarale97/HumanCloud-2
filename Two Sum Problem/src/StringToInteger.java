class StringToInteger {
    public static void main(String[] args) {
        String str = "12345"; // Change this to test with other strings
        try {
            int result = stringToInteger(str);
            System.out.println("The integer value is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int stringToInteger(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        int result = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            // Ensure the character is a digit
            if (ch < '0' || ch > '9') {
                throw new IllegalArgumentException("Invalid character in string: " + ch);
            }

            // Convert char to corresponding int value
            int digitValue = ch - '0';
            /*If ch is '0' (ASCII value 48), then the result is 0 (48 - 48 = 0).
              If ch is '1' (ASCII value 49), then the result is 1 (49 - 48 = 1).
              If ch is '2' (ASCII value 50), then the result is 2 (50 - 48 = 2).
              And so on, up to '9', where the result is 9 (57 - 48 = 9).*/

            result = result * 10 + digitValue;
        }

        return result;
    }
}
