package javatpoint;

/**
 * Created by Роман Лотоцький on 01.05.2017.
 */
public class ReverseWord {

    public String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(str.length() - i - 1));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        String str = "Word is fonderful!!! :) :) :) !!!";
        System.out.println(reverseWord.reverse(str));
        System.out.println(reverseWord.reverse("): namoR"));
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            f = f + g;
            System.out.println(f);
            g = f - g;
        }
    }
}
