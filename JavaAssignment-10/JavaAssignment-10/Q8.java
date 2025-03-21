public class ConcatenateStrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        char[] result = new char[str1.length() + str2.length()];
        int index = 0;
        for (char c : str1.toCharArray()) {
            result[index++] = c;
        }
        for (char c : str2.toCharArray()) {
            result[index++] = c;
        }
        System.out.println(new String(result));
    }
}
