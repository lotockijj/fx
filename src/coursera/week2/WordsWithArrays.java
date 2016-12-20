package coursera.week2;

/**
 * Created by Роман Лотоцький on 20.12.2016.
 */
public class WordsWithArrays {
    StoregeResource myWords;

    public WordsWithArrays(){
        myWords = new StoregeResource();
    }
    public void readWords(){
        myWords.clear();
        FileResource resource = new FileResource();
        for(String word : resource.words("D:\\fx\\romeo.txt")){
            myWords.add(word.toLowerCase());
        }
    }
    public boolean contains(String[] list, String word, int number){
        for (int i = 0; i < number ; i++) {
            if(list[i].equals(word)){
                return true;
            }
        }
        return false;
    }
    public int numberOfUniqueWords(){
        int numStored = 0;
        String[] words = new String[myWords.size()];
        for (String  s: myWords.data()) {
            if(!contains(words, s, numStored)){
                words[numStored]  = s;
                numStored++;
            }
        }
        return numStored;
    }

    public void tester(){
        readWords();
        System.out.println("number of words read: " + myWords.size());
        int unique = numberOfUniqueWords();
        System.out.println("array count unique: " + unique);
    }

    public static void main(String[] args) {
        WordsWithArrays w = new WordsWithArrays();
        w.tester();
    }
}
