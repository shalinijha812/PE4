package myexercise4;

public class CountChar {

    public int getTheCount(String str,char chr )
    {
        int count=0;
	    str=str.replace(" ","");
	    str=str.toLowerCase();
	    count=str.length()-str.replaceAll(String.valueOf(chr),"").length();
	    return count;
    }
}
