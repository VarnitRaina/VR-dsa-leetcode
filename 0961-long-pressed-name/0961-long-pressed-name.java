class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int ptr1 = 0, ptr2 = 0;
        while (ptr2 < typed.length()) {
            if (ptr1 < name.length() && name.charAt(ptr1) == typed.charAt(ptr2)) {
                ptr1++;
            }
            else if (ptr2 == 0 || typed.charAt(ptr2) != typed.charAt(ptr2 - 1)) {
                return false;
            }
            ptr2++;
        }
        return ptr1 == name.length();
    }
}