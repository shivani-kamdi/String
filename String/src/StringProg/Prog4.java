package StringProg;

public class Prog4 {
	
	public static void main(String[] args) {
		String sentence = "Harmayini is also a good actress in HP";
		 
//		System.out.println(sentence.indexOf("H")); //0
//		System.out.println(sentence.indexOf("i"));
//		 System.out.println(sentence.length()); //38
//		 System.out.println(sentence.lastIndexOf("H")); //36
//		 System.out.println(sentence.lastIndexOf("i")); //33
//		 System.out.println(sentence.startsWith("H")); //true
//		 System.out.println(sentence.startsWith("Har")); //true
//		 System.out.println(sentence.startsWith("Harmayini")); //true
//		 System.out.println(sentence.startsWith("Harr")); //false
		System.out.println(sentence.endsWith("HP")); //true
		System.out.println(sentence.endsWith(" HP")); //true
		System.out.println(sentence.endsWith("n HP")); //true
		System.out.println(sentence.endsWith("n HP.")); //false
		}
	

}
