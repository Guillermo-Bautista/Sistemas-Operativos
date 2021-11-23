/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author cesar
 */
public class PCB implements Comparable<PCB>{
   private int pid;
   private String name;
   private  int estado;
   private int memBase;
   private int memLimit;
   private int counter; //memory address (in the process) of instructions to be executed;
   private int priority;
   private Integer time;
    
    public PCB(int pid,String name,int estado,int memBase,int memLimit, int counter, int priority, Integer time ){
        this.pid = pid;
        this.name = name;
        this.estado = estado;
        this.memBase = memBase;
        this.memLimit = memLimit;
        this.counter = counter;
        this.priority = priority;
        this.time = time;
    }
    public int getPid(){
        return pid;
    }
    public void setPid(int pid){
    this.pid = pid;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    //int pid,String name,int estado,int memBase,int memLimit, int counter, int priority
    
    
    public int getEstado(){
        return estado;
    }
    public void setEstado(int estado){
        this.estado = estado;
    }
    public int getMembase(){
        return memBase;
    }
    public void setMemLimit(int memLimit){
        this.memLimit = memLimit;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int counter){
        this.counter = counter;
    }
    public int getPriority(){
        return priority;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getTime() { return time; };
    public void setTime( int time ) { this.time = time; };
    
    @Override
    public String toString()
    {
        return " PCB:{" +
                " pid = " + pid +
                ", nombre = '" + name + '\'' +
                ", tiempo = " + time + '\'' +
                " },";
    }
    
    @Override
    public int compareTo( PCB o ){
        return this.time.compareTo( o.getTime() );
    }
}
