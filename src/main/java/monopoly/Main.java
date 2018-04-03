package monopoly;


import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Die die = new Die();
        Piece piece1 = new Piece();
        Piece piece2 = new Piece();
        Player player1 = new Player(1, piece1,die);
        Player player2 = new Player(2, piece2,die);

        ArrayList<Piece> pieces = new ArrayList<Piece>();
        pieces.add(piece1);
        pieces.add(piece2);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        Board board = new Board(pieces,players);

        do
        {
            for (Player player : players)
            {
                System.out.println("It is player " +player.getNumber()+ "'s turn");
                System.out.println("Press enter to roll the dice");
                System.in.read();
                int currentPlacement = player.takeTurn();
                System.out.println("Your placement is now: " + currentPlacement );
                board.updatePiece(player.getPiece(),currentPlacement);
            }

        } while (true);
    }
}
