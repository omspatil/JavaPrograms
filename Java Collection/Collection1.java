/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1828;

class test <t,v>{
    t k;
    v j;
    test (t x , v y){
        k=x;
        j=y;
    }
    void show(){
        System.out.println(k);
        System.out.println(k.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
}
}

/**
 *
 * @author Tectonic
 */
 public class Collection1
{
    public static void main(String[] args) {
        test<Integer,String> t1=new test(100,"abc");
        t1.show();
    }
  
}
