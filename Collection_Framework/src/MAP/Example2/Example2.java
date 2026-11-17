package MAP.Example2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Map<String,Set<String>> m = new HashMap();
		
		String q1 = "What is String";
		Set<String> aq1 = new HashSet();
		aq1.add("java is a Operating System");
		aq1.add("Java is a Programming Langauge");
		aq1.add("Java is a Virtual machine");
		aq1.add("java is a class");
		m.put(q1,aq1);
		
		String q2 = "Interface can be used.....";
		Set<String> aq2 = new LinkedHashSet();
		aq2.add("to acheive multiple inheritance");
		aq2.add("to remove tightly code");
		aq2.add("as a skleton of application");
		aq2.add("all of above");
		m.put(q2,aq2);
		
		String q3 = "Encapsulation can be used to .....";
		Set<String> aq3 = new LinkedHashSet();
		aq3.add("to create capsule");
		aq3.add("to create method");
		aq3.add("to execute method");
		aq3.add("none of these");
		m.put(q3,aq3);
		
		String q4 = "Abstraction can be used to....";
		Set<String> aq4 = new LinkedHashSet();
		aq4.add("to hide implementtion");
		aq4.add("to hide data ");
		aq4.add("both A & B");
		aq4.add("none of these");
		m.put(q4,aq4);
		
		int q = 0;
		Set<String>question = m.keySet();
		for(String que : question)
		{
			char a = 'A';
			System.out.println("Q - " +(++q) + ")" +que);
			Set<String>answer = m.get(que);
			for(String ans : answer)
				System.out.println(a+++")"+ ans);
			System.out.println("______________________________________");
		}
	}

}
