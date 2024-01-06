import java.util.Scanner;
public class MadLibs {
    //instance variables
    private String noun;
    private String adjective;
    private String verbEndingInING;
    private String verb;
    private String bodyPart;
    private String bodyPartPlural;
    private String color;
    private String animalPlural;
    private String beverage;
    Scanner in = new Scanner(System.in);
    //constructor
    public MadLibs()
    {
        /*Please prompt the user for the instance variables above and assign the user's responses to the
         * instance variables.*/
        System.out.print("Please enter a noun: ");
        /*ToDo*/
    }

    public MadLibs(String noun, String adjective, String verbEndingInING, String verb, String bodyPart,
                   String bodyPartPlural, String color, String animalPlural, String beverage)
    {
        this.noun = noun;
        this.adjective = adjective;
        this.verbEndingInING = verbEndingInING;
        this.verb = verb;
        this.bodyPart = bodyPart;
        this.bodyPartPlural = bodyPartPlural;
        this.color = color;
        this.animalPlural = animalPlural;
        this.beverage = beverage;

    }

    //mutator methods
    public String createStory()
    {
        String story = "Did you know there's going to be a noun at the adjective School for Zombies?";
        story += "\nThere will be a DJ verbEndingInING adjective songs to verb to. Popular zombie dances include ";
        story += "The bodyPart verb and The verb. \nThe school gym is decorated with adjective pluralBodyPart and color pluralAnimal heads.";
        story += "\nIn between songs, there are treats like color beverage and adjective pluralBodyPart.";
        //Find the index of "noun" in story
        int nounIndex = /*ToDo*/
        //Replace "noun" with the instance variable noun
        story = story.substring(0, nounIndex) + noun + story.substring(nounIndex+4);
        //Find the index of the first time "adjective" appears in story
        int adjectiveIndex = /*ToDo*/
        //Create a loop that will run until there "adjective" no longer appears in story
        while(/*ToDo*/)
        {
            //Replace "adjective" with the instance variable adjective
            story = /*ToDo*/
            //Find the next time "adjective" appears in story
            adjectiveIndex = /*ToDo*/
        }
        //Find the index of "verbEndingInING" in story
        int verbEndingInINGIndex = /*ToDo*/
        //Replace "verbEndingInING" with the instance variable verbEndingInING
        story = /*ToDo*/
        //Find the index of the first time "verb" appears in story
        int verbIndex = /*ToDo*/
        //Create a loop that will run until there "verb" no longer appears in story
        while(/*ToDo*/)
        {
            //Replace "verb" with the instance variable verb
            story = /*ToDo*/
            //Find the next time "verb" appears in story
            verbIndex = /*ToDo*/
        }
        //Find the index of "bodyPart" in story
        int bodyPartIndex = /*ToDo*/
        //Replace "bodyPart" with the instance variable bodyPart
        story = /*ToDo*/
        //Find the index of the first time "pluralBodyPart" appears in story
        int bodyPartPluralIndex = /*ToDo*/
        //Create a loop that will run until there "pluralBodyPart" no longer appears in story
        while(/*ToDo*/)
        {
            //Replace "pluralBodyPart" with the instance variable bodyPartPlural
            story = /*ToDo*/
            //Find the next time "pluralBodyPart" appears in story
            bodyPartPluralIndex = /*ToDo*/
        }
        //Find the index of the first time "color" appears in story
        int colorIndex = /*ToDo*/
        //Create a loop that will run until there "color" no longer appears in story
        while(/*ToDo*/)
        {
            //Replace "color" with the instance variable color
            story = /*ToDo*/
            //Find the next time ""color" appears in story
            colorIndex = /*ToDo*/
        }
        //Find the index of "pluralAnimal" in story
        int animalPluralIndex = /*ToDo*/
        //Replace "pluralAnimal" with the instance variable animalPlural
        story = /*ToDo*/
        //Find the index of "beverage" in story
        int beverageIndex = /*ToDo*/
        //Replace "beverage" with the instance variable beverage
        story = /*ToDo*/
        //return story
        return /*ToDo*/;
    }
}