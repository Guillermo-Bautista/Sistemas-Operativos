/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Collections;

/**
 *
 * @author cesar
 */
public class Main {

    public static void main( String[] args ){
        PCB process  = new PCB( 1, "test",  1, 0, 1024, 0, 5, 10 );
        PCB process1 = new PCB( 2, "test2", 1, 0, 1024, 0, 5, 1 );
        PCB process2 = new PCB( 3, "test3", 1, 0, 1024, 0, 5, 5 );

        System.out.println( "id: " + process.getPid() );
        Cola ready = new Cola();
        ready.enqueue( process );
        ready.enqueue( process1 );
        ready.enqueue( process2 );

        //System.out.println( "Cola ready = " + ready );

        Collections.sort( ready.getDatos() ); //* Para para ordenarlos

        System.out.println( "Cola ready = " + ready );
        ready.dequeue();
        System.out.println( "Cola ready = " + ready );
        
    }
    
}
