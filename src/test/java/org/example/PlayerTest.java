package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {

    @Test
    public void getMarkerTest(){
        Player player = new Player('X');
        assertEquals(player.getMarker(), 'X');
    }

    @Test
    public void getMarkerNegativeTest(){
        Player player = new Player('O');
        assertNotEquals(player.getMarker(), 'X');
    }
}
