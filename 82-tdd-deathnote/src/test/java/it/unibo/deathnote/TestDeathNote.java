package it.unibo.deathnote;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import it.unibo.deathnote.api.DeathNote;
import it.unibo.deathnote.impl.DeathNoteImplementation;

class TestDeathNote {
    DeathNote test = new DeathNoteImplementation();

    @Test
    void testGetDeathCause() {


    }

    @Test
    void testGetDeathDetails() {

    }

    @Test
    void testGetRule() {
        String testRules = new String();
        try{
            testRules = test.getRule(0);
            fail("Non passato un argomento non valido");
            
        }catch (IllegalArgumentException e ){};

        try{
            testRules = test.getRule(1);
            
        }catch (IllegalArgumentException e ){
           
            fail("Argomento non può essere 0");
        };

        try{
            testRules = test.getRule(test.RULES.size() + 1);
            fail("Argomento non può essere Maggiore delle Regole");
            
        }catch (IllegalArgumentException e ){
           
            
        };




     

    }

    @Test
    void testIsNameWritten() {

    }

    @Test
    void testWriteDeathCause() {

    }

    @Test
    void testWriteDetails() {

    }

    @Test
    void testWriteName() {

    }

}