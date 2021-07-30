package com.miketvo;

import java.util.Arrays;

public class PrimeSieve {

  public static int[] sieve(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, Boolean.TRUE);
    isPrime[0] = false;

    int p = 2;
    while (p - 1 < isPrime.length) {
      int multiplier = 2;
      int notPrime = p * multiplier;
      while (notPrime <= n) {
        isPrime[notPrime - 1] = false;
        multiplier++;
        notPrime = p * multiplier;
      }

      p++;
      while (p - 1 < isPrime.length && !isPrime[p - 1]) {
        p++;
      }
    }

    int primeCount = 0;
    for (boolean isPrimeBool: isPrime) {
      if (isPrimeBool) {
        primeCount++;
      }
    }

    int[] primes = new int[primeCount];
    int j = 0;
    for (int i = 1; i < isPrime.length; i++) {
      if (isPrime[i]) {
        primes[j++] = i + 1;
      }
    }

    return primes;
  }
}
