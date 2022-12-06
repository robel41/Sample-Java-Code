import java.util.Scanner;
/* Robel D Negash
   java proj1
*/
public class sample01 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		final int FIRST_ENTRY_CHOICE = 1;
		final int SECOND_ENTRY_CHOICE = 2;
		int entryChoice;
		int playerNumber;
		String playerName;
		String guessPlayerName;
		String chosenPlayerName;

		System.out.print("Type 1 to enter a number or 2 to enter a name: ");	
		entryChoice = reader.nextInt();

		//Processing an Entry of 1

		if (entryChoice == FIRST_ENTRY_CHOICE){
			System.out.print("Enter player number: ");
			playerNumber = reader.nextInt();
			if(playerNumber == 17) {
				playerName = "Jackson";
				System.out.print("Which player wears number " +
						playerNumber + " on his jersey? ");
				guessPlayerName = reader.next();
				if(playerName.equals(guessPlayerName)) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}
			} else if(playerNumber == 25) {
				playerName = "Brooks";
				System.out.print("Which player wears number " + 
						playerNumber + " on his jersey? ");
				guessPlayerName = reader.next();
				if(playerName.equals(guessPlayerName)) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}	
			} else if(playerNumber == 5) {
				playerName = "McFarland";
				System.out.print("Which player wears number " + 
						playerNumber + " on his jersey? ");
				guessPlayerName = reader.next();
				if(playerName.equals(guessPlayerName)) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}	
			} else if(playerNumber == 7) {	
				playerName = "Ellis";
				System.out.print("Which player wears number " + 
						playerNumber + " on his jersey? ");
				guessPlayerName = reader.next();
				if(playerName.equals(guessPlayerName)) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}
			} else {	
				System.out.print("Invalid choice.");
			}

			//Processing an Entry of 2

		} else if(entryChoice == SECOND_ENTRY_CHOICE) {
			System.out.print("Choose a name: ");
			chosenPlayerName = reader.next();
			if(chosenPlayerName.equals("Jackson")) {
				System.out.print("What number does " + 
						chosenPlayerName + " wear? ");
				playerNumber = reader.nextInt();
				if(playerNumber == 17) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}
			} else if(chosenPlayerName.equals("Brooks")) {
				System.out.print("What number does " + 
						chosenPlayerName + " wear? ");
				playerNumber = reader.nextInt();
				if(playerNumber == 25) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}
			} else if(chosenPlayerName.equals("McFarland")) {
				System.out.print("What number does " + 
						chosenPlayerName + " wear? ");
				playerNumber = reader.nextInt();
				if(playerNumber == 5) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}
			} else if(chosenPlayerName.equals("Ellis")) {
				System.out.print("What number does " +
						chosenPlayerName + " wear?");
				playerNumber = reader.nextInt();
				if(playerNumber == 7) {
					System.out.print("Correct!");
				} else {
					System.out.print("Incorrect!");
				}
			} else {
				System.out.print("Invalid choice.");
			}

		}

		reader.close();

	}

}
