package myexercise4;

import java.util.regex.*;

public class SearchWord {
    public boolean getTheIndexOfWord(String str)
    {
        String patternString=" se";
        int count=0;
        Pattern pattern=Pattern.compile(patternString);
        Matcher matcher=pattern.matcher(str);
        boolean b=matcher.matches();
        while (matcher.find())
        {
            System.out.println("Found at:-" + matcher.start()+"-" + matcher.end());
            System.out.println();
        }
        return b;
    }
}
