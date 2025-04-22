package com.xworkz.information.external;

import com.xworkz.information.internal.Laptop;

public class OperatingSystem {

   private Laptop laptop;

   public OperatingSystem(Laptop laptop){
       this.laptop=laptop;
       System.out.println("arg const of Operating system");
   }

   public void work(){
       if(this.laptop!=null){
           this.laptop.process();
       }

       else{
           System.out.println("Laptop is null");
       }
   }
}
