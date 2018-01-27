public class Task1 {

    public static void main(String[] args) {

        String string = "qwertyytrewq";
        System.out.println(isReverse(string));
    }

    private static boolean isReverse(String string) {
        boolean b = false;
        StringBuilder reverseStringBuilder = new StringBuilder(string).reverse();

        return string.contentEquals(reverseStringBuilder);
    }
}
