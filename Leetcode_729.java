// Leetcode 729
// My Calender I

class MyCalendar {
    TreeMap<Integer,Integer> calender=new TreeMap<>();
    
    public MyCalendar() {
        calender.put(Integer.MAX_VALUE,Integer.MAX_VALUE);
    }
    
    public boolean book(int start, int end) {
        Map.Entry<Integer,Integer> pair=calender.higherEntry(start);
        boolean result=end<=pair.getValue();
        if(result) calender.put(end,start);
        return result;
    }
}