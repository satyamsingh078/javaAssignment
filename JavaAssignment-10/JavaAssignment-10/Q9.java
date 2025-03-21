public class CountWords {
    public static void main(String[] args) {
        String str = "hello world";
        int count = 0;
        boolean word = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!word) {
                    count++;
                    word = true;
                }
            } else {
                word = false;
            }
        }
        System.out.println(count);
    }
}
