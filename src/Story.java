public class Story {
    String story;
    String[] choice = new String[4];
    int[] choiceNum = new int[4];//The number of these not null should be equal to the number of not null in choice[]

    //Sets all variables for Story class objects using int x
    public void storyLine(int x){
        //clears out all of array choice and array choiceNum, to prevent issues with printing from previous storyBlock runs
        int y = 0;
        story = null;
        while (choice.length>y){
            choice[y] = null;
            choiceNum[y] = 0;
            y++;
        }

        //using the integer storyLine() was called with, determines what to set storyBlock to
        switch(x) {
            case 1:
                story = "Welcome to my text based adventure game, in order to play simply type in the number between" +
                        " the brackets [ ] of the choice you want.";
                choice[0] = "Play";
                choiceNum[0] = 2;
                break;

            case 2:
                story = "This is the first part of your story";
                choice[0] = "This is your first choice";
                choice[1] = "This is your second choice";
                choiceNum[0] = 3;
                choiceNum[1] = 4;
                break;

            case 3:
                story = "This is the first ending";
                break;

            case 4:
                story = "This is the second ending";
                break;
        }
    }
}