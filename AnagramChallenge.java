import java.util.*;
public class AnagramChallenge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
System.out.println("***");
		String str1=scan.next();
System.out.println("***");
	    String str2=scan.next();
	    int number=makeAnagram(str1,str2);
        System.out.println(number);
	}
	public static int makeAnagram(String str1, String str2) {
		char ch='a';
		int a,b;
		int number=0;
		do {
			a=0;
			b=0;
		for(int i=0;i<str1.length();i++)
			if(str1.charAt(i)==ch) a++;
		for(int i=0;i<str2.length();i++)
			if(str2.charAt(i)==ch) b++;
		if(a>b) number=number+(a-b);
		else if(b>a) number=number+(b-a);
		ch++;
			}while(ch<='z');
		return number;
	}

}
