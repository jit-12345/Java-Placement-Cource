public class string_q2 {
    public static int calDist(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'W') {
                --x;
            }
            if (ch == 'E') {
                x++;
            }
            if (ch == 'N') {
                ++y;
            }
            if (ch == 'S') {
                y--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (int) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(calDist(str));
    }
}
