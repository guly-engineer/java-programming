package exercises.projectGuly;

import exercises.project.Coin;

import java.util.Scanner;

public class PlayerGuly {
    private String name;
    private String guess;


    public PlayerGuly(){}

    public String getName() {return name;}

    public void setGuess(String guess) {this.guess = guess;}

    public String getGuess() {return guess;}

    public void askGuess(Scanner scanner){
        System.out.println("Please enter your guess!Heads or Tails?");
        guess=scanner.nextLine();
        while(!guess.equalsIgnoreCase(Coin.HEADS)
                && !guess.equalsIgnoreCase(Coin.TAILS)){
            System.out.println("Invalid guess. Try again. Please enter your guess! Heads or Tails?");
            guess = scanner.nextLine();
        }
    }

    public PlayerGuly askName(Scanner scanner){
        System.out.println("Please enter your name!");
        name=scanner.nextLine();
        return this;
    }
}
