package com.xworkz.information.external;

import com.xworkz.information.internal.Bag;

public class HandBag {

   private Bag bag;

   public HandBag(Bag bag){
       this.bag=bag;
       System.out.println("arg const of hand bag");
   }

   public void carryItems(){
       System.out.println("carry items");
       if(this.bag!=null){
           this.bag.carry();
       }

       else{
           System.out.println("bag is null");
       }
   }


}
