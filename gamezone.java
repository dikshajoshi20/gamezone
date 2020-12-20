import java.util.Scanner;
import java.util.Random;
public class gamezone {
    static class RockPaperScissor {
        void rsp() {

            String personPlay; //User's play -- "R", "P", or "S"
            String computerPlay = ""; //Computer's play -- "R", "P", or "S"
            int computerInt; //Randomly generated number used to determine
            //computer's play


            Scanner scan = new Scanner(System.in);
            Random generator = new Random();

            System.out.println("Hey, let's play Rock, Paper, Scissors!\n" +
                    "Please enter a move.\n" + "Rock = R, Paper" +
                    "= P, and Scissors = S.");

            System.out.println();

            //Generate computer's play (0,1,2)
            computerInt = generator.nextInt(3) + 1;

            //Translate computer's randomly generated play to
            //string using if //statements

            if (computerInt == 1)
                computerPlay = "R";
            else if (computerInt == 2)
                computerPlay = "P";
            else if (computerInt == 3)
                computerPlay = "S";

            //Get player's play from input-- note that this is
            // stored as a string
            System.out.println("Enter your play: ");
            personPlay = scan.next();

            //Make player's play uppercase for ease of comparison
            personPlay = personPlay.toUpperCase();

            //Print computer's play
            System.out.println("Computer play is: " + computerPlay);

            //See who won. Use nested ifs

            if (personPlay.equals(computerPlay))
                System.out.println("It's a tie!");
            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors. You win!!");
                else if (computerPlay.equals("P"))
                    System.out.println("Paper eats rock. You lose!!");
                else if (personPlay.equals("P"))
                    if (computerPlay.equals("S"))
                        System.out.println("Scissor cuts paper. You lose!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Paper eats rock. You win!!");
                    else if (personPlay.equals("S"))
                        if (computerPlay.equals("P"))
                            System.out.println("Scissor cuts paper. You win!!");
                        else if (computerPlay.equals("R"))
                            System.out.println("Rock breaks scissors. You lose!!");
                        else {
                            System.out.println("Invalid user input.");
                        }


        }
    }
    static class numberGame{
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        void easy(){

            //Generate computer's number
            int randomNum = generator.nextInt(5) + 1;
            System.out.println("enter a number between 1 to 5");
            int num = sc.nextInt();

            if (num == randomNum) {
                System.out.println(" Hurrey.... Number matched. You win \n");
            } else {
                System.out.println("Oops, numbers do not matched. You lost \n");
                System.out.println("The number was " + randomNum);
            }

        }
        void medium(){
            //Generate computer's number
            int randomNum = generator.nextInt(10) + 1;
            System.out.println("enter a number between 1 to 10");
            int num = sc.nextInt();

            if (num == randomNum) {
                System.out.println(" Hurrey.... Number matched. You win \n");
            } else {
                System.out.println("Oops, numbers do not matched. You lost \n");
                System.out.println("The number was " + randomNum);
            }
        }
        void hard(){
            //Generate computer's number
            int randomNum = generator.nextInt(15) + 1;
            System.out.println("enter a number between 1 to 15");
            int num = sc.nextInt();

            if (num == randomNum) {
                System.out.println(" Hurrey.... Number matched. You win \n");
            } else {
                System.out.println("Oops, numbers do not matched. You lost \n");
                System.out.println("The number was " + randomNum);
            }
        }

    }

    static class RollDie{
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        void dieroll(){
            //Generate random die number (0,1,2,3,4,5)
            int dienum = generator.nextInt(6) + 1;

            System.out.println("The number on Die is " + dienum);
        }
        void diceroll(){
            //Generate random die number (0 - 11)
            int dicenum = generator.nextInt(12) + 1;
            if (dicenum ==1)
                dicenum = dicenum + 1;
            System.out.println("The sum of numbers on Dice is " + dicenum);
        }
    }
    static class hangman
    {
        static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water"};
        static String word = words[(int) (Math.random() * words.length)];
        static String asterisk = new String(new char[word.length()]).replace("\0", "*");
        static int count = 0;

        public static void game(){
            Scanner sc = new Scanner(System.in);

            while (count < 7 && asterisk.contains("*")) {
                System.out.println("Guess any letter in the word");
                System.out.println(asterisk);
                String guess = sc.next();
                hang(guess);
            }
            sc.close();
        }

        public static void hang(String guess) {
            String newasterisk = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newasterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') {
                    newasterisk += word.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (asterisk.equals(newasterisk)) {
                count++;
                System.out.println("you have "+ (7-count)+" try remaining");
            } else {
                asterisk = newasterisk;
            }
            if (asterisk.equals(word)) {
                System.out.println("Correct! You win! The word was " + word);
            }
            if (count==7)
            {
                System.out.println("GAME OVER! The word was " + word);
            }
        }
    }
    static class quizgame
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String answer;
        void computer()
        {
            System.out.println("********** Enter your Responce by pressing A/B/C/D **********\n\n ");
            System.out.println("Q1. \"Connecting people\" is the tagline of ....\n" +
                    "A. Nokia\n" +
                    "B. Samsung\n" +
                    "C. Apple\n" +
                    "D. Xiaomi\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("A"))
                count++;
            System.out.println("Q2. What is the shortcut key combination to open File Explorer in windows ?\n" +
                    "A. Ctrl + A\n" +
                    "B. Ctrl + E\n" +
                    "C. Ctrl + F\n" +
                    "D. Ctrl + Shift + E\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("B"))
                count++;
            System.out.println("Q3.  What does ASCII stand for?\n" +
                    "A. American Standard Code for Information Interchange\n" +
                    "B. American Scientific Code for Information Interchange\n" +
                    "C. American Scientific Code for Interchanging Information\n" +
                    "D. American Standard Code for Interchanging Information\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("A"))
                count++;
            System.out.println("Q4. Which of the following is the another name for a PEN Drive?\n" +
                    "A. USB Flash Drive\n" +
                    "B. Gig stick\n" +
                    "C. Thumb Drive\n" +
                    "D. All of the Above\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("D"))
                count++;
            System.out.println("Q5. Who invented Java?\n" +
                    "A. Guido Vann Rossam\n" +
                    "B. James Gosling\n" +
                    "C. Mark Zukerburg\n" +
                    "D. Tim Cook\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("B"))
                count++;
            System.out.println("Your Result total is : "+count+"\n");
        }
        void generalKnowledge()
        {
            System.out.println("********** Enter your Responce by pressing A/B/C/D **********\n\n ");
            System.out.println("Q1. How many union territories are there in India ?\n" +
                    "A. six\n" +
                    "B. Seven\n" +
                    "C. Nine\n" +
                    "D. Eight");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("C"))
                count++;
            System.out.println("Q2. Which of the following is the capital of Arunachal Pradesh?\n" +
                    "A. Itanagar\n" +
                    "B. Dispur\n" +
                    "C. Imphal\n" +
                    "D. Panaji\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("A"))
                count++;
            System.out.println("Q3. What is the state flower of Haryana\n" +
                    "A. Lotus\n" +
                    "B. Rhodedendron\n" +
                    "C. Golden Shower\n" +
                    "D. Not Declared\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("A"))
                count++;
            System.out.println("Q4. Which is the largest coffee producing state in india ?\n" +
                    "A. Kerela\n" +
                    "B. Karnataka\n" +
                    "C. Tamil Nadu\n" +
                    "D. Arunachal Pradesh\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("B"))
                count++;
            System.out.println("Q5. Which indian state has largest area ? \n" +
                    "A. Maharashta\n" +
                    "B. Madhya Pradesh\n" +
                    "C. Uttar Pradesh\n" +
                    "D. Rajasthan\n");
            answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("D"))
                count++;
            System.out.println("Your Result total is : "+count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissor rps = new RockPaperScissor();
        numberGame ng = new numberGame();
        RollDie rd = new RollDie();
        hangman hang = new hangman();
        quizgame q= new quizgame();
        System.out.println("**********Game Lists**********\n" +
                "Press 1 to play Rock Paper Scissor \n" +
                "Press 2 to play Number guessing game\n" +
                "Press 3 to roll Die/Dice\n" +
                "Press 4 to play Hangman\n" +
                "Press 5 to play General Knowledge quiz\n");
        int gameChoice = sc.nextInt();
        switch (gameChoice){
            case 1 : rps.rsp();
            break;
            case 2 :
                System.out.println("Press 1 for easy level (1 - 5)\n" +
                        "Press 2 for medium level (1 - 10)\n" +
                        "Press 3 for hard level (1 - 15)");
                int numchoice = sc.nextInt();
                if (numchoice ==1)
                    ng.easy();
                else if(numchoice == 2)
                    ng.medium();
                else if (numchoice ==3)
                    ng.hard();
                else
                    System.out.println("you have entered wrong choice");
                break;
            case 3 :
                System.out.println("Press 1 for single Die ( 1 - 6)\n" +
                        "Press 2 for dice (1 -12 )");
                int dc = sc.nextInt();
                if (dc ==1)
                    rd.dieroll();
                else if(dc == 2)
                    rd.diceroll();
                else
                    System.out.println("you have entered wrong choice");
                break;
            case 4:
                hangman.game();
                break;
            case 5:
                System.out.println("Press 1 for Computer quiz\n" +
                        "Press 2 for India General Knowledge quiz\n");
                int choice = sc.nextInt();
                if (choice==1)
                    q.computer();
                else if (choice==2)
                    q.generalKnowledge();
                else System.out.println("invalid choice");
            break;
            default:
                System.out.println("you have entered wrong choice");
        }
    }
}
