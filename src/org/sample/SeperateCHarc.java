package org.sample;

public class SeperateCHarc {

	public static void main(String[] args) {
		
		String name="Greens123@gmail.com";
		
		String Upper= "",lower="" ,digits=" ",special=" ";
		
		int upperCount=0,lowerCount=0,digitalCount=0,specialCount=0;
		
		
		char[] ch = name.toCharArray();
		for (char c : ch) {
			if (c>=65&&c<=90) {
				upperCount++;
			Upper=Upper+c;
			}
			else if (c>=97&&c<=122) {
				lowerCount++;
				lower=lower+c;
			}
			else if (c>=97&&c<=122) {
				digitalCount++;
				digits=digits+c;
			}
			else if (c>=97&&c<=122) {
				specialCount++;
				special=special+c;
		}
		}
	System.out.println("uppercase:"+Upper+"count"+upperCount);
	System.out.println("lowercase:"+lower+"count"+lowerCount );
	System.out.println("digits:"+digits+"count"+digitalCount);
	System.out.println("splcharcters:"+special+"count"+specialCount);
}
}