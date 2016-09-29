package p03;

import java.util.HashMap;

/**
 * Created by BSIN on 9/27/2016.
 */
public class Program03{

    public void calulate(String value) {
        int i = 1,n=0;
        String k = "";
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

        }
        for(int x=0;x<array.length;x++)
            k=k+data.get(array[x]);
        System.out.println("result: "+k);
        char[] ch=k.toCharArray();
        for (char c:ch) {
            n=n+Integer.parseInt(String.valueOf(c));
        }
        System.out.println(n);
    }
}
