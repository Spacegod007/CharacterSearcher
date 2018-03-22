package app;

public class Program
{
    public static void main(String[] args)
    {
        int[] positionOfCharactersInString = new Searcher().getPositionOfCharactersInString(args[0], args[1]);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < positionOfCharactersInString.length; i++)
        {
            builder.append(positionOfCharactersInString[i]).append(" ");
        }

        System.out.println(builder.toString());
    }
}
