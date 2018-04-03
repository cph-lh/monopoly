/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class PlayerTest
{
    
    public PlayerTest()
    {
    }
    
    /**
     * Test of getNumber method, of class Player.
     */
    @Test
    public void testGetNumber()
    {
        System.out.println("getNumber");
        Player instance = null;
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeTurn method, of class Player.
     */
    @Test
    public void testTakeTurn()
    {
        Player player = mock(Player.class);
        when(player.takeTurn()).thenReturn(7).thenReturn(9);
        int result = player.takeTurn() + player.takeTurn();
        assertEquals(16,result);
    }
}
