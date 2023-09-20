class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        ArrayList<Integer> list=new ArrayList<>();
        int m=D%16;
        int l=(N<<m|N>>(16-m))&65535;
        int r=(N>>m|N<<(16-m))&65535;
        list.add(l);
        list.add(r);
        return list;
    }
}