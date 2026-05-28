import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDict {
    class Solution {
	public String findOrder(String[] words) {
		// code here
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i<26; i++) {
			adj.add(new ArrayList<>());
		}
		HashSet<Character> set = new HashSet<>();
		for (String word : words) {
			for (char ch : word.toCharArray()) {
				set.add(ch);
			}
		}
		for (int i = 0; i<words.length - 1; i++) {
			String s1 = words[i];
			String s2 = words[i + 1];
			int j = 0;
			int len = Math.min(s1.length(), s2.length());
			while (j<len) {
				if (s1.charAt(j) != s2.charAt(j)) {
					adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
					break;
				}
				j++;
			}
			if (j == len && s1.length()>s2.length())
				return "";
		}
		int[] indegree = new int[26];
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i<26; i++) {
			for (int nei : adj.get(i)) {
				indegree[nei]++;
			}
		}
		for(char ch : set) {
		    if(indegree[ch-'a'] == 0) q.add(ch-'a');
		}
		String s = "";
		while (!q.isEmpty()) {
			int curr = q.poll();
			s += (char) ((int)curr + 'a');
			for (int nei : adj.get(curr)) {
				indegree[nei] -- ;
				if (indegree[nei] == 0)
					q.add(nei);
			}
		}
			if (s.length() != set.size())
				return "";
			return s;
		}
	}
Dij
}
