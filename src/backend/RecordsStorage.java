/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.List;
import java.util.Map;

/**
 *
 * @author Mark
 */
public abstract class RecordsStorage {
    
    public abstract void Add(Item item);
    
    public abstract void retrieveRecordsToDisplay(RecordType recordType);
    
    Map recordsStorage;
    List sortedRecords;
    Item aRecord;
    Double totalValue;
    Item[] items;
    
    
    public RecordsStorage (){}
    public RecordsStorage(Item[] data){
        items = data;
    }
    public Item find(String description){
        return null;
    }
    
    public boolean add(String description){
        return false;
    }

    public boolean delete(String args){
        return false;
    }
    public static void retreiveRecordsToDisplay(String[] args){
    
    }
    public static void getsortedItems(List[] args){
        
    }
}
