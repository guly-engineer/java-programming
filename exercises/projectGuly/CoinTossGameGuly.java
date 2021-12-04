package exercises.projectGuly;

import java.util.Scanner;

public class CoinTossGameGuly {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlayerGuly player1=new PlayerGuly();
        PlayerGuly player2=new PlayerGuly();
        player1.askName(scanner)
                .askGuess(scanner);

        if (player1.getGuess().equalsIgnoreCase(CoinGuly.HEADS)){
            player2.setGuess(CoinGuly.TAILS);
        }else player2.setGuess(CoinGuly.HEADS);
        player2.askName(scanner);

        System.out.println("Flipping the coin...");
        CoinGuly coin=new CoinGuly();
        coin.flip();

        System.out.println("The coin landed on " + coin.getSide());
        determineWinner(player1,player2,coin);
        scanner.close();

    }
    public static void determineWinner(PlayerGuly player1, PlayerGuly player2, CoinGuly coin){
        PlayerGuly winner = coin.getSide().equalsIgnoreCase(player1.getGuess()) ? player1 : player2;
        System.out.println("Winner is: " + winner.getName());
    }
}
