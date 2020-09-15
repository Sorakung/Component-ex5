/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundmo;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class BoundMo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        com.mycompany.boundgo.bo.BoundProperty bound1 = new com.mycompany.boundgo.bo.BoundProperty();
        Listener1 list1 = new Listener1();
        Listener2 list2 = new Listener2();
        bound1.addPropertyChangeListener(list1);
        bound1.addPropertyChangeListener(list2);
        Scanner sc = new Scanner(System.in);
        //bound1.setValue("123");
        //bound1.setValue("456");
        int i = 0;
        int t = 0;
        int u = 0;
        String a ;
        while( i < 1){
        System.out.println("Place Enter T Score for THAI  or U for UAE");
        a = sc.nextLine();
        switch(a){
            case "T":
                t++;
                bound1.setValue("Thai  "+t+"  "+u+" UAE");
                break;
            case "U":
                u++;
                bound1.setValue("Thai  "+t+"  "+u+" UAE");
                break;
            case "":
                i++;
                break;
        }
        }
        
    }
    
}
