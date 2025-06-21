package car;

import java.util.ArrayList;
import java.util.Collections;

public class KthLargestElement {
    public static int findKthLargest(ArrayList<Integer> list, int k) {
        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Return the (k-1)th index
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(6);
        nums.add(4);

        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
    }
}

