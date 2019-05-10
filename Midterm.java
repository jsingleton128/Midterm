package practiceIt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Midterm {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		
		System.out.println(maxOccurences(list)); // returns 4
		System.out.println(maxOccurences(list2)); // returns 0
		
	}

	private static int maxOccurences(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		if (list.isEmpty()) {
			return 0;
		}
		
		for (Integer add : list) {
			map.put(add, 0);
		}
		
		for (Integer key : list) {
			if (map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}	
		}
		
		return Collections.max(map.values());
		
		}
		
		
	}
