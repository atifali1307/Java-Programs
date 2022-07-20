// Leetcode 729

// Number of Matching Subsequences

class Solution {
    private List<List<Integer>> pos;

  private boolean isMatch(String word) {

    int l = -1;

    for (char c : word.toCharArray()) {

      List<Integer> p = pos.get(c);

      int index = Collections.binarySearch(p, l + 1);

      if (index < 0) index = -index - 1;

      if (index >= p.size()) return false;

      l = p.get(index);

    }

    return true;

  }
    public int numMatchingSubseq(String s, String[] words) {
         pos = new ArrayList<>();

    for (int i = 0; i < 128; ++i) 

      pos.add(new ArrayList<Integer>());

    char[] a = s.toCharArray();

    for (int i = 0; i < a.length; ++i)

      pos.get(a[i]).add(i);

    int ans = 0;

    for (String word : words)

      if (isMatch(word)) ++ans;

    return ans;

  }
}