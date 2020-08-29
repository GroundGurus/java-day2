package com.groundgurus.day2;

public class ArrayExample {

  public static void main(String[] args) {
    // int = default 0 (int)
    // long = default 0L (long)
    // double = default 0.0
    // float = default 0.0F
    // String = default null

    int[] nums = {10, 20, 30, 40, 50}; // 5
    int[] nums2 = new int[10];
    nums2[1] = 22;

    for (int i = 0; i < nums2.length; i++) {
//      System.out.println(i + " = " + nums2[i]);
      System.out.printf("%d = %d%n", i, nums2[i]);
    }

    //int[] nums2 = new int[] {10, 20, 30, 40, 50};

//    System.out.println(nums2[1]);

    int[][] nums3 = new int[10][3]; // 1st = 10 elements, each element has array with 3 elements
    nums3[1][2] = 45;
    System.out.println(nums3[1][2]);

    int[][] nums4 = {{11, 22, 33, 44}, {55, 66}, {77, 88, 99}}; // 1st = 3 elements, has array
    // with 3 elements
    System.out.println(nums4[1][1]); // 66

    for (int[] number : nums4) {
      for (int innerNumber: number) {
        System.out.println(innerNumber);
      }
    }

    for (int i = 0; i < nums4.length; i++) {
      for (int j = 0; j < nums4[i].length; j++) {
        System.out.println(nums4[i][j]);
      }
    }
  }
}
