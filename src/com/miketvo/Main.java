package com.miketvo;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number larger or equal to 2: ");
    int n = Integer.parseInt(sc.nextLine());
    int[] primes = PrimeSieve.sieve(n);
    while (n > 1) {
      System.out.printf("Found %d primes: ", primes.length);
      for (int prime : primes) {
        System.out.printf("%d ", prime);
      }
      System.out.print("\n\n\nEnter a number larger or equal to 2: ");
      n = Integer.parseInt(sc.nextLine());
      primes = PrimeSieve.sieve(n);
    }
  }
}
