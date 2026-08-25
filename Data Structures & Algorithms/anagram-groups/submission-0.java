class Solution {
    public String sortString(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sMap = new HashMap<>();
        for(String s : strs){
            String sSort = sortString(s);
            sMap.computeIfAbsent(sSort, k -> new ArrayList<String>()).add(s);
        }
        return new ArrayList(sMap.values());
    }
}
