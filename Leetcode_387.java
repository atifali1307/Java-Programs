// Leetcode 387
// First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> occurences=new HashMap<>();
        for(char c:s.toCharArray()){
            Integer count=occurences.get(c);
            if(count==null){
                occurences.put(c,1);
            }
            else{
                occurences.put(c,++count);
            }
        }
        for(int i=0;i<s.length();i++){
            if(occurences.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}