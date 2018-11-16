package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 1, 3, 1, 3};
        int[] arr2 = new int[] {3, 1, 3, 3};
        int[] arr3 = new int[] {3, 4, 3, 3, 4};
        System.out.println(haveThree(arr1));
        System.out.println(haveThree(arr2));
        System.out.println(haveThree(arr3));
    }

    public static boolean haveThree(int[] nums)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i != nums.length - 1 && nums[i] == 3 && nums[i+1] != 3)
            {
                count++;
            }
            else
            {
                if (i == nums.length - 1 && nums[i] == 3 && nums[i-1] != 3)
                {
                    count++;
                }
            }
        }
        if (count == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
