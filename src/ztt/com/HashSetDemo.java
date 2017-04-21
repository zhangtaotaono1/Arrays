package ztt.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("abc1");
		hs.add("abc2");
		hs.add("abc3");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
