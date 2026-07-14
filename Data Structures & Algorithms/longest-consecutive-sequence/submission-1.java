class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int count = 0;

        for (int s : set) {
            if (!set.contains(s - 1)) {
                int len = 1;

                while (set.contains(s + len)) {
                    len++;
                }

                count = Math.max(count, len);
            }
        }

        return count;
    }
}
