package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter an Adverb");
    String currentEdVerb = MessageBox.askForTextInput("Please enter an verb ending in '-ed'");
    String currentBodyPart = MessageBox.askForTextInput("Please enter a body part.");
    String currentStory = "Today";
    currentStory = currentStory + "I woke " + currentAdverb + ".";
    currentStory = currentStory + "Then I " + currentEdVerb + "";
    currentStory = currentStory + " my " + currentBodyPart + ". ";
    MessageBox.showMessage(currentStory); // view
  }
}