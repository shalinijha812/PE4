package myexercise4;

public class TransposeString  {
    public String getTheTranspose(String str)
    {
        String strReplaced=null,revString="";
        String[] splitWords=null;
        String finalString="";
        strReplaced=str.replace(",|."," ");
        splitWords=strReplaced.split(" ");

        for(int i=0;i<splitWords.length;i++)
        {
            splitWords[i]=splitWords[i].trim();
            for(int j=splitWords[i].length()-1;j>=0;j--)
            {
                revString=revString+splitWords[i].charAt(j);
            }

            finalString=finalString+revString+" ";
            revString="";
        }
        finalString=finalString.trim();
    return finalString;
    }
}
