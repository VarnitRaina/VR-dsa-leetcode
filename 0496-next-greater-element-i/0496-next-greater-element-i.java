class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            boolean greaterFound = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
                if (found && nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    greaterFound = true;
                    break;
                }
            }
            if (!greaterFound) {
                result[i] = -1;
            }
        }
        
        return result;
    }
}
