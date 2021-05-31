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

}
