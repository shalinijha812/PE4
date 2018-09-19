package myexercise4;

import java.util.ArrayList;
import java.util.List;

public class SortWords {
    public String[] getTheSortedWords(String str)
    {
        String[] sortedWords=null;String strReplaced;
        String[] splittedLine=null;String[] splittedWords=null;
        String temp;
        str=str.toLowerCase();
        strReplaced=str.replace(","," ");
        strReplaced=strReplaced.replace("."," ");
        splittedWords=strReplaced.split(" ");
        for(int i=0;i<splittedWords.length;i++)
        {
            for(int j=i+1;j<splittedWords.length;j++)
            {
                if((splittedWords[i].compareTo(splittedWords[j])>0))
                {
                    temp = splittedWords[i];
                    splittedWords[i] = splittedWords[j];
                    splittedWords[j] = temp;
                }
            }
        }
        return splittedWords;

//        for(int i=0;i<splittedWords.length;i++)
//        {
//            if (splittedWords[i].contains(",")||splittedWords.contains[("."))
//        }
//            splitted
    }
}
