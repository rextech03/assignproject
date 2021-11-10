/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Mark
 */
abstract class Item{
    String description;
    Double estimatedValue;
    Conditions condition = new Conditions();
    RecordType recordtype = new RecordType();
//    Condition condition;
//    RecordType recordtype;
    
    Item(String newdescription, Double newestimatedValue, Conditions newcondition, RecordType newrecordtype) {
        description = newdescription;
        estimatedValue = newestimatedValue;
        condition = newcondition;
        recordtype = newrecordtype;
    }
    
    
    
    public void getItemDescription(String description){
        
    }
    
    public static void getPrice (String[] args){
        
    }
    
    public static void toString (String[] args){
        
    }
    
    abstract void itemMainDetails();
//    
    abstract void recordKind();
    
    class Items extends Item{

        @Override
        void itemMainDetails() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void recordKind() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
}

    