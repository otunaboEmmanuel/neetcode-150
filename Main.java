/*Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] ars = s.toCharArray();
        char[] art = t.toCharArray();
        java.util.Arrays.sort(ars);
        java.util.Arrays.sort(art);
        return java.util.Arrays.equals(ars, art);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isAnagram("listen", "silent"));  // true
        System.out.println(sol.isAnagram("hello", "world"));   // false
    }
    //comment
}