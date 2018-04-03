/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

public class Piece
{
    private int loc;
    public Piece(){
        this.loc = 0;
    }
    
    public Piece Move(int moves){
        loc = moves+loc;
        return this;
    }
    
    public int getLoc(){
        return loc;
    }
}
