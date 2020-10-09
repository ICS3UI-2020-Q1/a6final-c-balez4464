import java.util.Scanner;

/**
 *This program takes the users 5 card values and calculates thier final count based on them
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //Creates constant for Scanner
    final int CARD_AMOUNT = 5;

    //creates array for thier numbers
    int cardValues[] = new int[CARD_AMOUNT];

    //asks user to print thier values
    System.out.println("Please enter the value of 5 cards:");

    //allows user to write down thier numbers
    for(int i = 0; i < CARD_AMOUNT; i++){
      cardValues[i] = input.nextInt();
    } 
    
    //creates a sum variable for final count
    int sumCount = 0;

    //for loop to run through number and calculates
    for(int i = 0; i < CARD_AMOUNT; i++){
      //if the card is a low card add 1 to
      if(cardValues[i] >=2 && cardValues[i] <= 6){
        sumCount = sumCount + 1;
      //if the card is a high card subtract 1
      }else if(cardValues[i] >= 11 && cardValues[i] <= 14){
        sumCount = sumCount - 1;
      //if its in the middle do nothing
      }else{
        sumCount = sumCount;
      }
    }
    //prints out sum
    System.out.println("The count would be " + sumCount);


  }
}
