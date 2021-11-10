/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Mark
 */
abstract class IRecordStorage {
    public abstract Item Add(String args);
    
    public abstract RecordType retrieveRecordsToDisplay(String args);
}
public class RecordStorage extends IRecordStorage{

    @Override
    public Item Add(String args) {
       return null;
    }

    @Override
    public RecordType retrieveRecordsToDisplay(String args) {
        return null;
    }
    
    
    
}
