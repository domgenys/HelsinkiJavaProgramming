/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genys.D
 */
public class Archive {
    
    private String name;
    private String identifier;
    
    public Archive(String name, String identifier){
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    public boolean equals(Object comparison){// if the variables share the same address, they are equal
        if (this == comparison){
            return true;
        } 
          // if the compared object is not of type Archive, the objects are not equal
        if(!(comparison instanceof Archive)){
            return false;
        }
            Archive comparisonArchive = (Archive) comparison;
            return this.identifier.equals(comparisonArchive.identifier);
    }
    @Override
    public String toString() {
        return  this.identifier + ": " + this.name;
    }
    
    
}
