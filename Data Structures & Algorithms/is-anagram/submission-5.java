class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
         return false;
      }
      int[] diff = new int[26];
      for(int i = 0; i < s.length(); i++){
         diff[s.charAt(i) - 'a']++;
         diff[t.charAt(i) - 'a']--;
      }
      for(int num : diff){
         if(num != 0){
            return false;
         }
      }
      return true;
    }
}