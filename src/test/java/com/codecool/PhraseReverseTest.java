package com.codecool;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PhraseReverseTest {

    @Test
    public void testReverse(){
        assertEquals("ae dcba", PhraseReverse.reverse("abcd ea"));
    }

    @Test
    public void testReverseWords(){
        assertEquals("dcba ea", PhraseReverse.reverseWords("abcd ae"));
    }

    @Test
    public void testReverseArray(){
        String[] currentStringArray = new String[]{"ea", "abcd"};
        String[] reverseArray = new String[]{"abcd", "ea"};
        assertEquals(Arrays.toString(currentStringArray), Arrays.toString(PhraseReverse.reverseArray(reverseArray)));
    }

    @Test
    public void testReverseWordOrder(){
        assertEquals("ea abcd", PhraseReverse.reverseWordOrder("abcd ea"));
    }

    @Test
    public void testReverseN(){
        assertEquals(" 343214 223 11", PhraseReverse.reverseN("12343 4 223 11", 6));
    }

    @Test
    public void testJoin(){
        assertEquals("awesomeStringbook", PhraseReverse.join(new String[]{"awesome", "book"}, "String"));
    }

}