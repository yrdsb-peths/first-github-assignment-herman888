public String replaceLetter(String word, char letterToReplace, char replacingLetter)
{
    String newString = "";
    for(int i = 0; i < word.length(); i++)
    {
        char current = word.charAt(i);
        if(current == letterToReplace)
        {
            newString += replacingLetter;
        }
        if(current != letterToReplace)
        {
            newString += current;
        }
    }
    return newString;
}

String w = "hello";
String x = "hello     ";
String y = x;
String z = "hello hello";
