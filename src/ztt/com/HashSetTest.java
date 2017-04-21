package ztt.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person("ab", 21));
		hs.add(new Person("ab ", 21));
		hs.add(new Person("ac", 13));
		hs.add(new Person("ad", 14));
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getAge()+"=========="+p.getName());
		}
	}

}
