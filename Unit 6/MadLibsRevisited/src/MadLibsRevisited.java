import java.util.Scanner;
public class MadLibsRevisited {
   //instance variables
   private String[] nouns;
   private String[] pluralNouns;
   private String[] verbs;
   private String[] verbsEndingInING;
   private String[] adjectives;
   private String[] adverbs;
   private String[] interjections;
   private String[] places;
   private String[] bodyParts;
   Scanner in = new Scanner(System.in);
   //constructor
   public MadLibsRevisited()
   {
      //Initialize the arrays nouns, verbs, adjectives, adverbs, and interjections and fill them with user input.
      nouns = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter a noun: ");
         nouns[i] = in.next();
      }
      pluralNouns = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter a plural noun: ");
         pluralNouns[i] = in.next();
      }
      verbs = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter a verb: ");
         verbs[i] = in.next();
      }
      verbsEndingInING = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter a verb ending in -ing: ");
         verbsEndingInING[i] = in.next();
      }
      adjectives = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter an adjective: ");
         adjectives[i] = in.next();
      }
      adverbs = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter an adverb: ");
         adverbs[i] = in.next();
      }
      interjections = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter an interjection: ");
         interjections[i] = in.next();
      }
      places = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter a place: ");
         places[i] = in.next();
      }
      bodyParts = new String[/*ToDo*/];
      for(/*ToDo*/)
      {
         System.out.print("Please enter a body part: ");
         bodyParts[i] = in.next();
      }
   }

   //getter methods
   private void printNouns()
   {
      //Print the list of nouns in one line.
      System.out.print("Nouns: ");
      /*ToDo*/
   }

   private void printPluralNouns()
   {
      //Print the list of nouns in one line.
      System.out.print("Plural Nouns: ");
      /*ToDo*/
   }

   private void printVerbs()
   {
      //Print the list of verbs in one line.
      System.out.print("Verbs: ");
      /*ToDo*/
   }

   private void printVerbsEndingInING()
   {
      //Print the list of verbs in one line.
      System.out.print("Verbs ending in -ing: ");
      /*ToDo*/
   }

   private void printAdjectives()
   {
      //Print the list of adjectives in one line.
      System.out.print("Adjectives: ");
      /*ToDo*/
   }

   private void printAdverbs()
   {
      //Print the list of adverbs in one line.
      System.out.print("Adverbs: ");
      /*ToDo*/
   }

   private void printInterjections()
   {
      //Print the list of interjections in one line.
      System.out.print("Interjections: ");
      /*ToDo*/
   }

   private void printPlaces()
   {
      //Print the list of interjections in one line.
      System.out.print("Places: ");
      /*ToDo*/
   }

   private void printBodyParts()
   {
      //Print the list of verbs in one line.
      System.out.print("Body Parts: ");
      /*ToDo*/
   }

   public void printLists()
   {
      //Print all of the lists out in separate lines.
      /*ToDo*/
   }

   //mutator methods
   public String createStory()
   {
      //Type out your story with the parts of speech in the story where they should be filled in.
      String story = /*ToDo*/;
      //Find the index of the first time "noun" in appears story
      int nounIndex = story.indexOf("noun");
      //Set i = 0 to get the first noun in the list nouns
      /*ToDo*/
      /*Create a loop that will run until "noun" no longer appears in story or there are no more nouns
       *in the nouns list*/
      while(/*ToDo*/)
      {
         //Replace "noun" with one of the nouns in the nouns list
         story = /*ToDo*/
         //Find the next time "noun" appears in story
         nounIndex = /*ToDo*/
         //Increment i to get to the next noun in the list
         /*ToDo*/
      }
      //Find the index of the first time "pluralNoun" in appears story
      int pluralNounIndex = /*ToDo*/
      //Reset i = 0 to get the first plural nouns in the list pluralNouns
      /*ToDo*/
      /*Create a loop that will run until "pluralNouns" no longer appears in story or there are no more plural nouns
       *in the pluralNouns list*/
      while(/*ToDo*/)
      {
         //Replace "pluralNouns" with one of the plural nouns in the pluralNoun list
         story = /*ToDo*/
         //Find the next time "pluralNoun" appears in story
         pluralNounIndex = /*ToDo*/
         //Increment i to get to the next plural noun in the list
         /*ToDo*/
      }
      //Find the index of the first time "verb" appears in story
      int verbIndex = /*ToDo*/
      //Reset i = 0 to get the first verb in the list verbs
      /*ToDo*/
      /*Create a loop that will run until "verbs" no longer appears in story or there are no more verbs
       *in the verbs list*/
      while(/*ToDo*/)
      {
         //Replace "verb" with one of the verbs in the verbs list
         story = /*ToDo*/
         //Find the next time "verb" appears in story
         verbIndex = /*ToDo*/
         //Increment i to get to the next verb in the list
         /*ToDo*/
      }
      //Find the index of the first time "verbEndingInING" appears in story
      int verbEndingInINGIndex = /*ToDo*/
      //Reset i = 0 to get the first verb ending in -ing in the list verbsEndingInING
      /*ToDo*/
      /*Create a loop that will run until "verbEndingInING" no longer appears in story or there are no more verbs ending
       *in -ing in the verbsEndingInING list*/
      while(/*ToDo*/)
      {
         //Replace "verbEndingInING" with one of the verbs ending in -ing in the verbsEndingInING list
         story = /*ToDo*/
         //Find the next time "verbEndingInING" appears in story
         verbEndingInINGIndex = /*ToDo*/
         //Increment i to get to the next verb ending in -ing in the list
         /*ToDo*/
      }
      //Find the index of the first time "adjective" appears in story
      int adjectiveIndex = /*ToDo*/
      //Reset i = 0 to get the first adjective in the list adjectives
      /*ToDo*/
      /*Create a loop that will run until "adjectives" no longer appears in story or there are no more adjectives ending
       *in the adjectives list*/
      while(/*ToDo*/)
      {
         //Replace "adjective" with one of the adjectives in the adjectives list
         story = /*ToDo*/
         //Find the next time "adjective" appears in story
         adjectiveIndex = /*ToDo*/
         //Increment i to get to the next adjective in the list
         /*ToDo*/
      }
      //Find the index of the first time "adverb" appears in story
      int adverbIndex = /*ToDo*/
      //Reset i = 0 to get the first adverb in the list adverbs
      /*ToDo*/
      /*Create a loop that will run until "adverbs" no longer appears in story or there are no more adverbs
       *in the adverbs list*/
      while(/*ToDo*/)
      {
         //Replace "adverb" with one of the adverbs in the adverb list
         story = /*ToDo*/
         //Find the next time "adverb" appears in story
         adverbIndex = /*ToDo*/
         //Increment i to get to the next adverb in the list
         /*ToDo*/
      }
      //Find the index of the first time "interjection" appears in story
      int interjectionIndex = /*ToDo*/
      //Reset i = 0 to get the first interjection in the list interjections
      /*ToDo*/
      /*Create a loop that will run until "interjection" no longer appears in story or there are no more interjections
       *in the interjections list*/
      while(/*ToDo*/)
      {
         //Replace "interjection" with one of the interjections in the interjections list
         story = /*ToDo*/
         //Find the next time "interjections" appears in story
         interjectionIndex = /*ToDo*/
         //Increment i to get to the next interjection in the list
         /*ToDo*/
      }
      //Find the index of the first time "place" appears in story
      int placeIndex = /*ToDo*/
      //Reset i = 0 to get the first place in the list places
      /*ToDo*/
      /*Create a loop that will run until "place" no longer appears in story or there are no more places
       *in the places list*/
      while(/*ToDo*/)
      {
         //Replace "place" with one of the places in the places list
         story = /*ToDo*/
         //Find the next time "place" appears in story
         placeIndex = /*ToDo*/
         //Increment i to get to the next place in the list
         /*ToDo*/
      }
      //Find the index of the first time "bodyPart" appears in story
      int bodyPartIndex = /*ToDo*/
      //Reset i = 0 to get the first body part in the list bodyParts
      /*ToDo*/
      /*Create a loop that will run until "bodyPart" no longer appears in story or there are no more body parts
       *in the bodyParts list*/
      while(/*ToDo*/)
      {
         //Replace "bodyPart" with one of the body parts in the bodyParts list
         story = /*ToDo*/
         //Find the next time "bodyPart" appears in story
         bodyPartIndex = /*ToDo*/
         //Increment i to get to the next body part in the list
         /*ToDo*/
      }
      //return story
      r/*ToDo*/y;
   }
}