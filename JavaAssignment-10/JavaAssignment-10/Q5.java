public class ReplaceChars {
    public static void main(String[] args) {
        String str = "hello world";
        String oldStr = "world";
        String newStr = "java";
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + oldStr.length() <= str.length() && str.substring(i, i + oldStr.length()).equals(oldStr)) {
                result.append(newStr);
                i += oldStr.length();
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        System.out.println(result.toString());
    }
}
