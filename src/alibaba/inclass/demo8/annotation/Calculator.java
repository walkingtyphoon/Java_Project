package alibaba.inclass.demo8.annotation;
 
 /**
 
 - С??????????????
   */
   public class Calculator {
 
   //???
   @Check
   public void add(){
       String str = null;
       str.toString();
       System.out.println("1 + 0 =" + (1 + 0));
   }
   //????
   @Check
   public void sub(){
       System.out.println("1 - 0 =" + (1 - 0));
   }
   //???
   @Check
   public void mul(){
       System.out.println("1 * 0 =" + (1 * 0));
   }
   //????
   @Check
   public void div(){
       System.out.println("1 / 0 =" + (1 / 0));
   }

 public void show(){
     System.out.println("????bug...");
 }
 
 }