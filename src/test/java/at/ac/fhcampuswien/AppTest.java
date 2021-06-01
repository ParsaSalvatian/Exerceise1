package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testLength1(){
        //schaut nur ob der wert der übergeben wird true oder false ist und wenn der true ist ist der test sucessful
        App pw1 = new App();
        assertTrue(pw1.checkPassword("#Passwo13rd"));

    }

    @Test
    public void testLength2(){
        App pw2 = new App();
        assertFalse(pw2.checkPassword("(Pass1"));
    }



    @Test
    public void testUpperLower1(){
        App pw3 = new App();
        assertTrue(pw3.checkPassword("JavaIsTheBest1!?"));
    }

    @Test
    public void testUpperLower2(){
        App pw4 = new App();
        assertFalse(pw4.checkPassword("javaisthebest1!?"));
    }

    @Test
    public void testisDigit1(){
        App pw5 = new App();
        assertTrue(pw5.checkPassword("!Lov3MyPiano?12"));
    }

    @Test
    public void testisDigit2(){
        App pw6 = new App();
        assertFalse(pw6.checkPassword("new/Yorker"));
    }

    @Test
    public void testSpecialLetter1(){
        App pw7 = new App();
        assertTrue(pw7.checkPassword("@(tellMeWhy83)"));
    }

    @Test
    public void testSpecialLetter2(){
        App pw8 = new App();
        assertFalse(pw8.checkPassword("Aint19Nothing"));
    }

    @Test
    public void testadditional1(){
        App pw9 = new App();
        assertTrue(pw9.checkPassword("#67adfleLsSi"));
    }
    @Test
    public void testadditional2(){
        App pw10 = new App();
        assertFalse(pw10.checkPassword("Pa111ie123#iew"));
    }

    @Test
    public void testadditional3(){
        App pw10 = new App();
        assertFalse(pw10.checkPassword("UenlE4444!?JEY"));
    }

}
