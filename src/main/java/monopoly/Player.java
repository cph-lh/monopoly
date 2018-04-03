/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

public class Player
{
    private int number;
    private Piece piece;
    private Die dice;
    public Player(int number, Piece piece,Die dice){
        this.number = number;
        this.piece = piece;
        this.dice = dice;
    }
    
    public int getNumber(){
        return number;
    }
    
    public int takeTurn(){
        piece.Move(dice.roll());
        return piece.getLoc();
    }
    
    public Piece getPiece(){
        return piece;
    }
}
