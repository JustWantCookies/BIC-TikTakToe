package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PlayerTest
{
    @Test
    public void isMarkerCorrectTrue()
    {
        Player player=new Player('X');
        boolean res = player.getMarker()=='X';
        assertTrue(res);
    }

    @Test
    public void isMarkerCorrectFalse() {
        Player player=new Player('0');
        boolean res = player.getMarker()=='X';
        assertFalse(res);
    }
}
