public class Vowelsconstant{
  public static void main (String[]args){
    Vowelcount vowel=new Vowelcount();
    vowel.checkvowel();
  }
}
class Vowelcount {
  void checkvowel(){
    String word ="Apeqious";int vowel=0;
    word=word.toLowerCase();
    char[] c=word.toCharArray();
    for (int i=0;i<word.length();i++)
    {
      switch(word.charAt(i)){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        vowel++;
      }
    }System.out.println("vowel count "+vowel);
  }
}
