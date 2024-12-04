class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        Map<Character, Character> cyclicMap = new HashMap<>();
        cyclicMap.put('a', 'z');
        for (char c = 'b'; c <= 'z'; c++) {
            cyclicMap.put(c, (char) (c - 1));
        }

        int ptr1 = str1.length() - 1;
        int ptr2 = str2.length() - 1;

        // Traverse the strings
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (str1.charAt(ptr1) == str2.charAt(ptr2)) {
                ptr1--;
                ptr2--;
            } else {
                char correspondingValue = cyclicMap.get(str2.charAt(ptr2));
                if (str1.charAt(ptr1) == correspondingValue) {
                    ptr1--;
                    ptr2--;
                } else {
                    ptr1--;
                }
            }
        }
        return ptr2 < 0;
    }
}