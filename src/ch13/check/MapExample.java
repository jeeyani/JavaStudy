package ch13.check;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore =0;
		
		Set<Entry<String, Integer>> entrySet =  map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			totalScore += value;
			
			if(maxScore<value) {
				maxScore = value;
				name = key;
			}
			
			
		}
		
		
		
		System.out.println("평균점수: "+ totalScore/map.size());
		System.out.println("최고점수: "+ maxScore);
		System.out.println("최고점수를 받은 아이디: "+ name);

	}

}
