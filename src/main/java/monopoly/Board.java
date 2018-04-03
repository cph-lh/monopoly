/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;

public class Board
{
    
    ArrayList<Piece> pieces;
    ArrayList<Player> players;
    public Board(ArrayList<Piece> pieces, ArrayList<Player> players){
        this.pieces = pieces;
        this.players = players;
    }
    
    public ArrayList<Piece> updatePiece(Piece piece,int playerNumber){
        pieces.set(playerNumber, piece);
        return pieces;
    }
}
