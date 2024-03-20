/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1828;
import java.util.*;
import java.io.*;
/**
 *
 * @author Tectonic
 */
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        
        System.out.println(ar.size());
        
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        
        System.out.println(ar.size());
        System.out.println("By Using For Loop: ");
        for(int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
        System.out.println("By Using For Each Loop: ");
        for(Integer X: ar)
        {
            System.out.println(X);
        }
        System.out.println("By Using Iterator: ");
        Iterator<Integer> it = ar.iterator();
        while(it.hasNext())
        {
            Integer x=it.next();
            System.out.println(x);
        }
        
        ListIterator <Integer> it2=ar.listIterator();
        System.out.println("Forward...");
        while(it2.hasNext())
        {
            Integer x=it2.next();
            System.out.println(x);
        }
        System.out.println("Backward.....");
        while(it2.hasPrevious())
        {
            Integer x=it2.previous();
            System.out.println(x);
        }
        
        
        
    }
}
