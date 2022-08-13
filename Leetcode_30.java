// Leetcode 30
// Substring with concatenation of All Words


class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(words.length == 0 || words[0].length() == 0 || s.length() == 0) return res;
        int wordLen = words[0].length();
        int wordNum = words.length;
        int windowSize = wordLen * wordNum;
        Map<String,Integer> map = new HashMap<>();
        
        for(String eachWord : words) {
            map.put(eachWord,map.getOrDefault(eachWord,0) + 1);
        }
       
        for(int i = 0;i + windowSize - 1 < s.length();i++) {
            String lastWord = s.substring(i + windowSize - wordLen,i + windowSize);
            if(map.containsKey(lastWord)) {
                boolean bre = false;
                Map<String,Integer> currMap = new HashMap<>(map);
                for(int j = i;j < i + windowSize;j += wordLen) {
                    String currWord = s.substring(j,j + wordLen);
                    currMap.put(currWord,currMap.getOrDefault(currWord,0) - 1);
                    if(currMap.get(currWord) < 0) {
                        bre = true;
                        break;
                    }
                }
                if(!bre)res.add(i);
            }
        }
        return res;
    }
}