// TC: O(n)
// SC: O(n)

import java.util.HashMap;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int ans = 0;
        int i=0, j=0;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch)) {
                while(true){
                    char x = s.charAt(i);
                    map.remove(x);
                    i++;
                    if(ch == x) break;
                }
            }
            map.put(ch, j);
            ans = Math.max(j-i+1, ans);
            j++;
        }
        return ans;
    }
}
