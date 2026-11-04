package MAP.Example1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
public class Example1 {

	public static void main(String[] args) {
		Map<Character,String> m = new HashMap();
		m.put('a',"aeroplane");
		m.put('s',"Sky");
		m.put('K',"King");
		m.put('c',"champion");
		m.put('g',"gold");
		m.put('b',"basket");
		m.put('d',"diamond");
		m.put('y',"yacht");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.get('c'));
		System.out.println(m.containsKey('d'));
		System.out.println(m.containsValue("basket"));
		
		Set<Character> Key = m.keySet();
		for(char c : Key)
			System.out.println(c);
		Collection <String> col = m.values();
		for(String s:col)
			System.out.println(s);
		for(char c : Key)
			System.out.println(c + "\t\t"+m.get(c));
		Set<Entry<Character,String>> set = m.entrySet();
		for(Entry<Character,String> e : set)
			System.out.println(e.getKey() + "\t\t"+e.getValue());
	}

}
