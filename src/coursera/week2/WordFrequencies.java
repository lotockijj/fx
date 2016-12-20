package coursera.week2;

import java.util.ArrayList;

/**
 * Created by Роман Лотоцький on 20.12.2016.
 */
public class WordFrequencies {

    private ArrayList<String> myWords;
    private ArrayList<Integer> myFregs;

    public WordFrequencies() {
        myWords = new ArrayList<>();
        myFregs = new ArrayList<>();
    }

    public void findUnique() {
        FileResource resourse = new FileResource();
        for (String s : resourse.words("D:\\fx\\romeo.txt")) {
            s = s.toLowerCase();
            int myIndex = myWords.indexOf(s);
            if (myIndex == -1) {
                myWords.add(s);
                myFregs.add(1);
            } else {
                int value = myFregs.get(myIndex);
                myFregs.set(myIndex, value + 1);
            }
        }
    }

    public void tester() {
        findUnique();
        System.out.println("#unique words : " + myWords);
        for (int i = 0; i < myWords.size(); i++) {
            System.out.println(myFregs.get(i) + "\t" + myWords.get(i));
        }
    }

    public static void main(String[] args) {
        WordFrequencies wF = new WordFrequencies();
        wF.tester();
    }
}

