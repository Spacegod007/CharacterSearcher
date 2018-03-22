package app;

import java.util.ArrayList;
import java.util.List;

public class Program
{
    private static List<Integer> integers;

    public static void main(String[] args)
    {
        String searchable = "";

        integers = new ArrayList<>();

        String text = "Besten,\n" +
                "\n" +
                "Vanuit mijn perspectief had ik mijn best gedaan om iedereen feedback te geven en de laatste les had ik lege queque (niemand dus stond te wachten om nog feedback te vragen).\n" +
                "\n" +
                "Dus procesmatig gezien heb ik voldoende momenten gegeven voor het vragen van feedback - en de herkansing is dan de laatste moment om je leerdoelen aan te tonen.\n" +
                "\n" +
                "Ik wil even lief doen (extra afteken moment) met als tegen prestatie van jullie dat jullie echt voorbereid komen:\n" +
                "\n" +
                "-dubbelcheck (opgave(n) aandachtig lezen!) dat je de gevraagde stukken ook in jouw oplossing hebt staan. Uitgewerkte oplossing dus.\n" +
                "\n" +
                "-vroeg naar per review van jouw collega en vraag actief wat voor feedback dat ze hadden gekregen , verwerk hun feedback in jouw oplossing en wees voorbereid. als bewijs breng mee de genoteerde feedback die je had gekregen.\n" +
                "\n" +
                "-geen echte unit en/of performance tests == kijk ik niet naar de rest van je code (je hoeft dus niet te komen en ik zie je bij de herkansing).\n" +
                "\n" +
                "-je moet kunnen uitleggen hoe hash map en tree werken en waarom ze de bepaalde Big(o) hebben per operatie bv. hoe efficiënt is een nieuwe element toevoegen en hoe gebeurt het (stappen uitleggen)\n" +
                "\n" +
                "-als bewijs van dit bericht aandachtig gelezen te hebben geef index van de chars in dit announcements die nodig zijn om jouw achternaam te spellen. Neem dit ook mee naar de feedback sessie.\n" +
                "\n" +
                " 3 april 12:30-16:30 ik zal in de open ruimte op 2de verdiep zitten (english stream). pas op er zijn twee klassen die aftekenen dus wacht niet te lang.\n" +
                "\n".toLowerCase();

        addCharacterPositionsToList(text, searchable);

        StringBuilder builder = new StringBuilder();

        integers.forEach(integer -> builder.append(integer).append(" "));

        System.out.println(builder.toString());
    }

    private static void addCharacterPositionsToList(String text, String searchableCharacters)
    {
        for (char character : searchableCharacters.toLowerCase().toCharArray())
        {
            integers.add(text.indexOf(character));
        }
    }
}
