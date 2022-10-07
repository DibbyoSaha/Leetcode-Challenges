class Solution {
    public int lengthOfLastWord(String s) {
        List<String> lst = List.of(s.split(" "));
        return (lst.get(lst.size()-1)).length();
    }
}
