class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];

        // Assume all numbers are prime
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Remove multiples of each prime
        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Count remaining prime numbers
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;

    }
}

// int count = 0;

// for (int i = 2; i < n; i++) {
//     int innerCount = 0;

//     for (int j = 1; j <= i; j++) {
//         if (i % j == 0) {
//             innerCount++;
//         }
//     }

//     if (innerCount == 2) {
//         count++;
//     }

// }

// return count;
//     }
// }