// TC: O(n + m)
// SC: O(n)

import java.util.HashMap;
public class LC791 {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int m = order.length();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<m;i++){
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
                int c = map.get(ch);
                while(c>0){
                    ans.append(ch);
                    c--;
                }
            }
            map.remove(ch);
        }
        for(char e : map.keySet()){
            int c = map.get(e);
            while(c>0){
                ans.append(e);
                c--;
            }
        }
        return ans.toString();
    }
}