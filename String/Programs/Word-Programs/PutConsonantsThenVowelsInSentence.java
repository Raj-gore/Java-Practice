import java.util.Arrays;
class PutConsonantsThenVowelsInSentence 
{	
	public static void main(String[] args){
	String s1 = "hello i am java developer";
	String cons = s1.replaceAll("[AEIOUaeiou ]", "");
	String vow = s1.replaceAll("[^AEIOUaeiou]", "");
	StringBuilder sb = new StringBuilder(cons);
	sb.append(vow);
	for (int i = 0; i < s1.length(); i++)
		if (s1.charAt(i) == ' ')
			sb.insert(i, " ");        
        System.out.println(sb);
    }
}