package L1;

import java.util.*;

public class Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gLen = sc.nextInt(); // size of greed array
        int[] g = new int[gLen];
        for (int i = 0; i < gLen; i++) {
            g[i] = sc.nextInt();
        }

        int sLen = sc.nextInt(); // size of cookie array
        int[] s = new int[sLen];
        for (int i = 0; i < sLen; i++) {
            s[i] = sc.nextInt();
        }

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
