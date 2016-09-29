package p03;

import java.util.HashMap;

/**
 * Created by BSIN on 9/27/2016.
 */
public class Program03 extends RuntimeException{
    public static void main(String [] args){
      Program03 p3=new Program03();
        p3.calulate("hello");
    }
    public void calulate(String value) {
        int i = 1;
        String k = null;
        String text = value.toUpperCase();
        int length = text.length();
        System.out.println(text + length);
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            data.put(alphabet, i);
            System.out.println("key " + alphabet + " value " + i);
            i++;
        }


        Character[] array = new Character[length];
        for (int j = 0; j < length; j++) {
            array[j] = new Character(text.charAt(j));
            System.out.println(j);
            // k = k + data.get(i);
        }
        for(int x=0;x<array.length;x++)
        {
//System.out.print(array[x]);
            System.out.print(data.get(array[x]));
            k=k+data.get(array[x]);

        }
        System.out.println(k);
        int n=0;
        char[] ch=k.toCharArray();
        for (char c:ch) {
            n=n+Integer.parseInt(String.valueOf(c));
        }
        System.out.println(n);
    }
}
