
// import java.io.*;
import java.util.*;

public class WeirdAlgorithm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    StringBuilder sb = new StringBuilder();
    while (t != 1) {
      sb.append(t).append(" ");
      if (t % 2 == 0)
        t /= 2;
      else
        t = t * 3 + 1;
    }
    sb.append(1);
    System.out.println(sb);
    sc.close();
  }
}