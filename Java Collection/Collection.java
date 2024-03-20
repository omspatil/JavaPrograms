/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1828;
class Collection_1<t>{
    t i;
    Collection_1(t x){
        i=x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
/**
 *
 * @author Tectonic
 */
public class Collection 
{
    public static void main(String[] args) 
    {
        Collection_1<String> ob1 = new Collection_1("abc");
        Collection_1<Integer> ob2= new Collection_1(100);
        ob1.show();
        ob2.show();
        
        
    }
}
