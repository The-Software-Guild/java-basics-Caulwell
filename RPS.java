package beginner.Assessment;

import java.util.Random;
import java.util.Scanner;

public class RPS {

    private int numRounds;
    private int currentRound;
    private int numTies;
    private int playerScore;
    private int compScore;

    private Scanner s;
    private Random r;

    public RPS(int numRounds)
    {
        this.numRounds = numRounds;
        this.currentRound = 1;
        this.s = new Scanner(System.in);
        this.r = new Random();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while(!quit){
            int numRounds = 0;
            // Ask until numRounds >=1 && <=10
            while(numRounds < 1 || numRounds > 10)
            {
                System.out.println("How many rounds would you like to play? (1-10)");
                numRounds = scanner.nextInt();
            }

            RPS game = new RPS(numRounds);
            game.playGame();

            System.out.println();
            System.out.printf("Game over! Player wins: %1$d, Computer Wins: %2$d, Ties: %3$d %n", game.playerScore, game.compScore, game.numTies);

            if(game.playerScore > game.compScore){
                System.out.println("You win this game!");
            } else if(game.playerScore < game.compScore){
                System.out.println("Computer wins this one!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();
            int playAgain = 99;
            while(playAgain != 0 && playAgain != 1){
                System.out.println("Do you want to play again? 0 = No, 1 = yes");
                playAgain = scanner.nextInt();
            }

            quit = playAgain == 1 ? false : true;

        }

        System.out.println("Thank you for playing!");


    }

    public void playRound()
    {
        int compChoice = r.nextInt(3) + 1;
        int playerChoice = 0;

        System.out.println();

        while(playerChoice < 1 || playerChoice > 3)
        {
            System.out.println("Round " + currentRound + ": Choose either 1: Rock, 2: Paper, or 3: Scissors");
            playerChoice = s.nextInt();
        }

        decideRound(compChoice, playerChoice);



    }

    public void playGame()
    {
        while(currentRound <= numRounds)
        {
            playRound();
            currentRound++;
        }
    }

    private void decideRound(int compChoice, int playerChoice)
    {
        // TIE
        if(compChoice == playerChoice){
            numTies++;
            System.out.println("It's a tie!");
            return;
        }
        //COMP WINS
        if(compChoice == 1 && playerChoice == 3) {
            compScore++;
            System.out.println("Computer wins, rock beats scissors!");
            return;
        }
        if(compChoice == 2 && playerChoice == 1){
            compScore++;
            System.out.println("Computer wins, paper beats rock!");
            return;
        }
        if(compChoice == 3 && playerChoice == 2){
            compScore++;
            System.out.println("Computer wins, scissors beats paper!");
            return;
        }
        //PLAYER WINS
        if(playerChoice == 1 && compChoice == 3) {
            playerScore++;
            System.out.println("You win, rock beats scissors!");
            return;
        }
        if(playerChoice == 2 && compChoice == 1){
            playerScore++;
            System.out.println("You win, paper beats rock!");
            return;
        }
        if(playerChoice == 3 && compChoice == 2){
            playerScore++;
            System.out.println("You win, scissors beats paper!");
            return;
        }
    }




}
