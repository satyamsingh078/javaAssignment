
class MaxFinder {
    int max(int a, int b) {
        return Math.max(a, b);
    }
    double max(double a, double b) {
        return Math.max(a, b);
    }
    String max(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
