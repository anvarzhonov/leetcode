import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagramms = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String current: strs){
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);

            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }

        groupAnagramms.addAll(map.values());
        return groupAnagramms;
    }
}