Leetcode 1074

Number of Submatrices that sum to target


class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int xlen=matrix[0].length, ylen=matrix.length, res=0;
        Map<Integer,Integer> result=new HashMap<>();
        for(int[] x:matrix)
            for(int j=1;j<xlen;j++)
                x[j]+=x[j-1];
        for(int j=0;j<xlen;j++)
            for(int k=j;k<xlen;k++){
                result.clear();
                result.put(0,1);
                int csum=0;
                for(int i=0;i<ylen;i++){
                    csum+=matrix[i][k]-(j>0?matrix[i][j-1]:0);
                    res+=result.getOrDefault(csum-target,0);
                    result.put(csum,result.getOrDefault(csum,0)+1);
                }
            }
        return res;
    }
}