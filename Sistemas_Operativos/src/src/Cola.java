/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class Cola {
    private ArrayList<PCB> datos;
    
    public Cola(){
    this.datos = new ArrayList<>();
    }
    
    //method to add
    public int enqueue(PCB p){
        //pass the param of the index, just like in js
        this.getDatos().add(p);
        //in case it doesn't exit usual out of bounds
        return 1;
    
    }
    
    
    //method to remove
   public PCB dequeue(){
        //pass the param of the index, just like in js
        if(this.getDatos().size() >= 1){
            //we can do terniary condition like in js
            
             //we can give it an object or an adress that corresponds to that object
             this.getDatos().remove(0);
        }
        return null;
    }
    //method to retrieve all the elements
    @Override
    public String toString(){
      
    String s = "";
    for(PCB p:this.getDatos()){
    s = s + p;
    }
    return s;
    }

   
    public ArrayList<PCB> getDatos() {
        return datos;
    }
}
