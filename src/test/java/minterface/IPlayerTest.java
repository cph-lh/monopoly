/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minterface;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class IPlayerTest
{

    public IPlayerTest()
    {
    }

    /**
     * Test of takeTurn method, of class IPlayer.
     */
    @Test
    public void testTakeTurn()
    {
        IPlayer player = mock(IPlayer.class);
        IDice dice = mock(IDice.class);
        IPiece piece = mock(IPiece.class);
        when(dice.roll()).thenReturn(7);
        int moves = dice.roll();
        piece.Move(moves);
        when(piece.getLoc()).thenReturn(moves);
        assertEquals(7, piece.getLoc());
    }

    public class IPlayerImpl implements IPlayer
    {

        public int takeTurn()
        {
            return 0;
        }
    }

}
