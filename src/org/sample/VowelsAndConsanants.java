package org.sample;

public class VowelsAndConsanants {
public static void main(String[] args) {
	String name ="Greens123@gmail.com";
	String vowels="",cons="";
	int VowelsCount =0, ConsCount=0;
	char[] ch = name.toCharArray();
	for (char c : ch) {
		if (c>65&&c<=122) {
			
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				
				vowels=vowels+c;
				VowelsCount++;
				
			}
			else {
				cons =cons+c;
				ConsCount++;
			}
		}
	}
	System.out.println("vowels:"+vowels+"count"+VowelsCount);
	System.out.println("Consanants :"+cons+"count"+ConsCount );
}
}
