public class Number {
  public static void main(String[] args) {   
    Replacenum r=new Replacenum();
    r. repnum();
    }
}  
class Replacenum{
  public void repnum(){    
    for (int i=1;i<=20;i++){
      int val=0;
      for (int j=1;j<=20;j++){
         
         if(i==j*3)
         { 
           for(int k=1;k<=20;k++){
           if(j*3==k*5){
             val=1;
             System.out.println("fuzzbuzz");}
             
           }
           if(val==0){
             val=1;
           System.out.println("fuzz");
           
           }
         }     
         else if(i==j*5){
         val=1;
         System.out.println("buzz");}   
      }
      if (val==0)
      System.out.println(i);
    }
  }
}
