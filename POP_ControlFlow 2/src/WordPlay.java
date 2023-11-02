import java.util.Random;
/**
 * WordPlayStudentOuputTests class - part of Control Flow
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class WordPlay {
	
	//Task1
	public String  whatComesFirst(String word1, String word2) {
        String answer;

        if (word1.compareToIgnoreCase(word2)>0){
            answer = word2.toLowerCase()+" comes before "+word1.toLowerCase()+" in the alphabet";
        } else if (word1.equalsIgnoreCase(word2)){
            answer= word1.toLowerCase()+" is the same as "+word2.toLowerCase();
        } else
            answer = word1.toLowerCase()+" comes before "+ word2.toLowerCase()+" in the alphabet";
		return answer;
	}
	
	//Task 2
	public String  backwardsString(String word) {
        StringBuilder backwardsWord = new StringBuilder(word); //calls stringbuilder construct
        backwardsWord.reverse(); //reverses the word
		return backwardsWord.toString(); //returns it as a string
	}
	
	//Task 3
	public String[] addressBook(String[]names, String[]numbers) {
        int namesLength = names.length;
        int numbersLength = numbers.length;
        String [] addressbook = new String[numbersLength];
        for (int i=0; i<namesLength; i++){
            addressbook[i]=names[i]+" "+numbers[i];
        }

		return addressbook;
	}
	
	//Task 4
	public String rockPaperScissors(String userInput) {
        String[] rockPaperScissors = {"rock","paper","scissors"};
        Random number = new Random();
        int randomNumber = number.nextInt(3);
        String computerInput;
        if (randomNumber==0){
            computerInput=rockPaperScissors[0];
        } else if (randomNumber==1) {
            computerInput=rockPaperScissors[1];
        } else computerInput=rockPaperScissors[2];
        String winner;

        if (userInput.equalsIgnoreCase(computerInput)){
            winner = "it is a draw";
        } else if ((userInput=="rock")&&(computerInput=="paper")) {
            winner = "COMPUTER wins";
        } else if ((userInput=="rock")&&(computerInput=="scissors")) {
            winner= "user wins";
        } else if ((userInput=="paper")&&(computerInput=="rock")){
            winner = "user wins";
        } else if ((userInput=="paper")&&(computerInput=="scissors")) {
            winner = "COMPUTER wins";
        } else if ((userInput=="scissors")&&(computerInput=="rock")) {
            winner = "COMPUTER WINS";
        } else winner = "user wins";


        return "USER:"+userInput+" vs COMP:"+computerInput+" "+winner;
	}
}
