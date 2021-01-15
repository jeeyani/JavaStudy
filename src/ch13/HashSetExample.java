package ch13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("저장 수: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("저장 수: "+set.size());
		
		//iterator = set.iterator();
		for (String element : set) {
			System.out.println(element);
		}
		
		
		set.clear(); // 전체 삭제
		if(set.isEmpty()) {
			System.out.println("비어있음~");
		}

	}

}
