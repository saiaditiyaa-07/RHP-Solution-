import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> a = new ArrayList<>();

        for (int i = 0; i < (1 << nums.length); i++) {

            List<Integer> b = new ArrayList<>();

            for (int k = 0; k < nums.length; k++) {

                if ((i & (1 << k)) != 0) {
                    b.add(nums[k]);
                }
            }

            a.add(b);
        }

        return a;
    }
}