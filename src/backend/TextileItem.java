/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Mark
 */
public class TextileItem extends Item{
    
    TextileType textileType = new TextileType();
    String colourDescription;
    String brand;
    TextileSize textileSize = new TextileSize();
    
    TextileItem(String textileType, 
            String colourDescription, 
            String textileSize, 
            String brand, 
            String description, 
            Double estimatedValue, 
            Conditions condition, 
            RecordType recordtype){
        
    }
    
    public void itemMainDetails(){
            
        }
        
    public void recordKind(){
            
        }
    
    
    public void ToString(){
//        
    } 
}
