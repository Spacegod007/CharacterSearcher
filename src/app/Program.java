package app;

public class Program
{
    public static void main(String[] args)
    {
        boolean caseSensitive;

        try
        {
            caseSensitive = Boolean.getBoolean(args[2]);
        }
        catch (Exception ignored)
        {
            caseSensitive = true;
        }

        int[] positionOfCharactersInString = new Searcher().getPositionOfCharactersInString(args[0], args[1], caseSensitive);

        StringBuilder builder = new StringBuilder();

        for (int aPositionOfCharactersInString : positionOfCharactersInString)
        {
            builder.append(aPositionOfCharactersInString).append(" ");
        }

        System.out.println(builder.toString());
    }
}
