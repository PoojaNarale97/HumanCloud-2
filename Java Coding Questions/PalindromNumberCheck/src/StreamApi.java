import java.util.Arrays;

public class StreamApi {
    public static void main(String[] args) {
    int arr[]=new int[]{123,121,454,564};
    printPalindroms(arr);
}

public static void printPalindroms(int arr[])
{
    Arrays.stream(arr)
            .filter(Main::isPalindrom)
            .forEach(System.out::println);

}

public static boolean isPalindrom(int num)
{
    int num1 = num, reverse = 0, rem = 0;

    while (num > 0) {
        rem = num % 10;
        reverse = reverse * 10 + rem;
        num = num / 10;
    }
    return reverse==num1;
}
}

