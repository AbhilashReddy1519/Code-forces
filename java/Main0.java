import java.io.*;
import java.util.*;

public class Main0 {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = 1;
        // If input contains number of testcases at top uncomment below
        // t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }
        out.flush();    // flush output at end
    }

    static void solve() {
        // your logic here

        // Example:
        // int n = fs.nextInt();
        // out.println(n * 2);
    }

    // FastScanner for competitive programming
    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() {
            if (ptr >= len) {
                ptr = 0;
                try {
                    len = in.read(buffer);
                } catch (IOException e) {
                    return -1;
                }
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() {
            int c;
            while ((c = read()) <= ' ') ;
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = c - '0';
            while ((c = read()) > ' ') {
                val = val * 10 + (c - '0');
            }
            return val * sign;
        }

        long nextLong() {
            int c;
            while ((c = read()) <= ' ') ;
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long val = c - '0';
            while ((c = read()) > ' ') {
                val = val * 10 + (c - '0');
            }
            return val * sign;
        }

        String next() {
            int c;
            while ((c = read()) <= ' ') ;
            StringBuilder sb = new StringBuilder();
            sb.append((char) c);
            while ((c = read()) > ' ') {
                sb.append((char) c);
            }
            return sb.toString();
        }
    }
}
