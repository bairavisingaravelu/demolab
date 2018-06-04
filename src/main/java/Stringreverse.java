public class Stringreverse {
  public static void main (String [] args){
    Reverse rev=new Reverse();
    rev.wordreverse();
  }
  }
  class Reverse{
  public void wordreverse(){
  String reverse="";int space=0,lettercount=0,numbercount=0;
  String word="go 15 pi 13 bairu";
  char[] c=word.toCharArray();
  System.out.println("before reverse String");
  for (char s:c){
    System.out.print(s);
  }
  for(int i=word.length()-1;i>=0;i--){
    reverse=reverse+word.charAt(i);
    if(Character.isWhitespace(c[i]))
    space++;
    else if(Character.isLetter(c[i]))
    lettercount++;
    else if(Character.isDigit(c[i]))
    numbercount++;
  }
  
  System. out. println("");
  System.out.println("After reverse String");
  System.out.println(reverse);
  System.out.println("space count "+space);
  System.out.println("letter count "+lettercount);
  System.out.println("number count "+numbercount);
  
  }
}
