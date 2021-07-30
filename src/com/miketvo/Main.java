package com.miketvo;

public class Main {

  public static void main(String[] args) {
    int iterations = 1000;
    long startTime = System.nanoTime();
    for (int i = 0; i < iterations; i++) {
      System.out.printf("\nIteration %d\n", i);
      for (int n = 1; n < 542; n++) {
        System.out.printf("n=%d; found %d primes\n", n, PrimeSieve.sieve(n).length);
      }
    }
    long endTime = System.nanoTime();
    long totalTimeElapsed = endTime - startTime;
    long averageIterationDuration = totalTimeElapsed / iterations;

    System.out.printf("\nElapsed: %dns | Iteration Avg: %dns\n", totalTimeElapsed, averageIterationDuration);
    System.out.printf("Elapsed: %dms | Iteration Avg: %dms\n", totalTimeElapsed / 1000000, averageIterationDuration / 1000000);
  }
}
