package kyu_8;

/**
 * Complete the bool_to_word (PHP: boolToWord ) method.

 Given: a boolean value

 Return: a 'Yes' string for true and a 'No' string for false
 */
class YesOrNo
{
    public static String boolToWord(boolean b){

        String word = (b) ? "Yes" : "No";
        return word;
    }
}