import java.util.Arrays;

public class Chars
{
    public static boolean isAllUnique(String str)
    {
    char[] cArray = str.toCharArray();
    Arrays.sort(cArray);
    for(int i = 0; i < cArray.length - 1; i++)
    {
        if(cArray[i] != cArray[i + 1])
        {
            continue;
        }
        else
        {
            return false;
        }
    }
    return true;
    }
}