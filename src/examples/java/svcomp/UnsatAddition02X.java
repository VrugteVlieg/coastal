/*
 * Origin of the benchmark:
 *     license: MIT (see /java/jayhorn-recursive/LICENSE)
 *     repo: https://github.com/jayhorn/cav_experiments.git
 *     branch: master
 *     root directory: benchmarks/recursive
 * The benchmark was taken from the repo: 24 January 2018
 */
package svcomp;

import org.sosy_lab.sv_benchmarks.Verifier;

public class UnsatAddition02X {
  static int addition(int m, int n) {
    if (n == 0) {
      return m;
    } else if (n > 0) {
      return addition(m + 1, n - 1);
    } else {
      return addition(m - 1, n + 1);
    }
  }

  public static void main(String[] args) {
    int m = Verifier.nondetInt();
    int n = Verifier.nondetInt();
    int result = addition(m, n);
    if (m < 100 || n < 100 || result >= 200) {
      return;
    } else {
      assert false;
    }
  }
}
