/*
 * Origin of the benchmark:
 *     repo: https://github.com/jayhorn/cav_experiments.git
 *     branch: master
 *     root directory: benchmarks/recursive
 * The benchmark was taken from the repo: 24 January 2018
 */
import java.util.Random;

public class Main {

	static int fibonacci(int n) {
		if (n < 1) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	static void main(String[] args) {
		Random rand = new Random(42);

		int x = rand.nextInt();
		if (x > 46) {
			return;
		}
		int result = fibonacci(x);
		if (x < 9 || result >= 34) {
			return;
		} else {
			assert false;
		}
	}
}
