package org.teachingkidsprogramming.section06modelviewcontroller.Katas_and_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    //MessageBox.showMessage("The edVerb is " + edVerb);
    String bodyPart = askBodyPart();
    // MessageBox.showMessage("The body part is " + bodyPart);
    String currentStory = "Today I woke " + adverb + ". Then I " + edVerb + "my " + bodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Please enter a body part.");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part.");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*")) // that is a regular expression
    {
      MessageBox.showMessage("No body, no story, pay attention and start over!");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb?");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb.");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not adverbs! Try again!");
      adverb = askAdverb();
    }
    return adverb;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("Please enter a verb that ends in ed?");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb that ends in ed.");
      edVerb = askEdVerb();
    }
    return edVerb;
  }
}