public class RemoveChar {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
