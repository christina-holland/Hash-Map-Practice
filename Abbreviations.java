import java.util.HashMap;

public class Abbreviations {
    //Creating a new HashMap object to store abbreviations and their explanations
    private HashMap<String, String> abbreviations;

    //Creating a constructor to initialize the HashMap
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }

    //Adding a new abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation.toLowerCase(), explanation);
    }

    //Checking if an abbreviation has been added
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation.toLowerCase());
    }

    //Finding the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation.toLowerCase());
    }

    public static void main(String[] args) {
        //Creating some instance of Abbreviations
        Abbreviations abbreviations = new Abbreviations();

        //Adding some abbreviations
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        //Defining a text with some abbreviations
        String text = "e.g. i.e. etc. lol";

        //Splitting the text by spaces and processing each part
        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                //Replacing each abbreviation with its explanation
                part = abbreviations.findExplanationFor(part);
            }

            //Printing the part, followed by a space
            System.out.print(part);
            System.out.print(" ");
        }

        //Printing a newline at the end
        System.out.println();
    }
}
