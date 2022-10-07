// Leetcode 732
// My Calendar III

class MyCalendarThree {
    TreeMap<Integer,Integer> calender;
    public MyCalendarThree() {
        calender=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        calender.put(start,calender.getOrDefault(start,0)+1);
        calender.put(end,calender.getOrDefault(end,0)-1);
        int num=0,result=0;
        for(int val:calender.values()) {
            num+=val;
            result=Math.max(result,num);
        }
        return result;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */