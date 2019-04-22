import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Initialization of
        Object of class Story storyBlock: used to store the story (story), it's choices (choices[]), and the results of those choices (choicesNum[]).
        int x: used to output all choices[] and calling storyLine() with the input of the player and choiceNum[].
        Object of class Entity player: used to hold information about the player.
         */
        Story storyBlock = new Story();
        int x;
        Entity player = new Entity("shouldprobablywriteamethodtogettheplayer'sname",10,1,0,10,1,1,0,10,1);

        //Setting storyBlock to storyLine(1) to start off the game. storyLine(1) is instructions on how to play, with one choice that leads to playing the game.
        storyBlock.storyLine(1);
        //If choice[0] is equal to null, then it is assumed that the storyBlock is at it's end, then it will print out the story then credits.
        while(storyBlock.choice[0]!=null) {
            x = 0;
            System.out.println(storyBlock.story);
            //Printing out all of choice[], and not allowing it to print the blank Strings of choice[]
            while (x + 1 <= storyBlock.choice.length && storyBlock.choice[x] != null) {
                System.out.printf("[%d] %s%n", x + 1, storyBlock.choice[x]);
                x++;
            }
            x = userStoryInput(x);
            storyBlock.storyLine(storyBlock.choiceNum[x-1]);
        }
        System.out.println(storyBlock.story);

        //Credits
        System.out.println("\n\n\nThank you for playing!\nCreated by: Lindon Kelley");
    }
    //method to ensure proper input during story gameplay
    private static int userStoryInput(int maxArray){
        int input;
        Scanner kb = new Scanner(System.in);
        while(true) {
            try {
                input = kb.nextInt();
                if (0 < input && input < maxArray + 1) {
                    break;
                } else {
                    System.out.println("Input must be one of the options, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number, please try again.");
                kb.next();
            }
        }
        return input;
    }

    //move these to their own class (Battle.class?)
    private static void userBattleInput(){

    }
    //enters a battle sequence with player vs enemy
    public static boolean battle(Entity player,Entity enemy){
        while(enemy.getHealth()>0&&player.getHealth()>0){

        }
        return player.getHealth()>0;
    }
}