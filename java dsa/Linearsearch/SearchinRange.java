package com.jiya;

import java.util.Arrays;

public class SearchinRange {
    public static void main(String[] args) {
        int arr[] = {1,45,23,-12,-14};
        int target = -14;
        System.out.println(linearsearch(arr,target,1,4));
    }
    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start ; index <= end; index++) {
            //   check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
        }

            }
        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
                    }

