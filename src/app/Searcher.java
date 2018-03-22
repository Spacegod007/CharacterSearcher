package app;

class Searcher
{
    int[] getPositionOfCharactersInString(String text, String searchableCharacters, boolean caseSensitive)
    {
        if (!caseSensitive)
        {
            text = text.toLowerCase();
            searchableCharacters = searchableCharacters.toLowerCase();
        }

        int[] ints = new int[searchableCharacters.length()];
        char[] chars = searchableCharacters.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            ints[i] = text.indexOf(chars[i]);
        }

        return ints;
    }
}
