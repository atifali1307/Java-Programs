// Leetcode 916
// Word Subsets

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bFreq=new int[26],check=new int[26];
        int cmax=0;
        List<String> result=new ArrayList<>();
        for(int i=0;i<words2.length;i++,Arrays.fill(check,0)){
            for(char c:words2[i].toCharArray())
                check[c-'a']++;
            for(int j=0;j<26;j++){
                int diff=check[j]-bFreq[j];
                if(diff>0){
                    cmax+=diff;
                    bFreq[j]+=diff;
                }
            }
            if(cmax>10) return result;
            
        }
        for(int i=0;i<words1.length;i++,Arrays.fill(check,0)){
            int j;
            for(char c:words1[i].toCharArray())
                check[c-'a']++;
            for(j=0;j<26;j++)
                if(check[j]<bFreq[j]) break;
            if(j==26) result.add(words1[i]);
        }
        return result;
    }
}