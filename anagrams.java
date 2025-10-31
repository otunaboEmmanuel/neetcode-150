import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class anagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
	for(String word :strs)
	{
		char[] wordarr = word.toCharArray();
		Arrays.sort(wordarr);
		String key = new String(wordarr);
		map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
	} 
	return new ArrayList<>(map.values());
	  
    }
    public static void main(String[] args) {
        anagrams anagramGrouper = new anagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = anagramGrouper.groupAnagrams(input);
        System.out.println(groupedAnagrams);
    }
}
