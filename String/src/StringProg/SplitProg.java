package StringProg;

public class SplitProg {

	
	public static void main(String[] args) {
		// edited with gitbash
		String sentence = "I am an automation engineer who loves to work on Selenium with java";
		String sentenceArray[] = sentence.split(" ");
		
		System.out.println("Orirional Sentence : " + sentence);
		System.out.println("After split :");
		for(int i=0;i<sentenceArray.length;i++)
		System.out.print(sentenceArray[i] + " ");
		System.out.println("\n---------------------------------");
		
		for(String a : sentenceArray)
		System.out.println(a);
		//Assignment :- 15-Aug-1947
		//Assignment :- 15.Aug.1947
		//The string is made final to not allow others to extend it
		//and destroy its immutability.
		}
		
}
