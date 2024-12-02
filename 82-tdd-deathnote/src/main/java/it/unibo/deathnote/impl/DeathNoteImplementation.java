package it.unibo.deathnote.impl;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import it.unibo.deathnote.api.DeathNote;

public class DeathNoteImplementation implements DeathNote {

    Set<String> setName = new HashSet<>();

    @Override
    public String getRule(int ruleNumber) {

        if( 0 < ruleNumber && ruleNumber <= RULES.size()){
            return RULES.get(ruleNumber);
        }
        else{
            throw new IllegalArgumentException();
        }
        
}

    @Override
    public void writeName(String name) {
        setName.add(name);
      
    }

    @Override
    public boolean writeDeathCause(String cause) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDeathCause'");
    }

    @Override
    public boolean writeDetails(String details) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDetails'");
    }

    @Override
    public String getDeathCause(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeathCause'");
    }

    @Override
    public String getDeathDetails(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeathDetails'");
    }

    @Override
    public boolean isNameWritten(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNameWritten'");
    }

    
}