// Leetcode 2007
// Find Original Array From Doubled Array

class Solution {
    public int[] findOriginalArray(int[] changed) {
        List<Integer> result=new ArrayList<>();
        Queue<Integer> q=new ArrayDeque<>();
        Arrays.sort(changed);
        for(final int num: changed){
            if(!q.isEmpty() && num==q.peek()){
                q.poll();
                
            }else{
                q.offer(num*2);
                result.add(num);
            }
        }
        return q.isEmpty()?result.stream().mapToInt(i->i).toArray():new int[] {};
    }
}