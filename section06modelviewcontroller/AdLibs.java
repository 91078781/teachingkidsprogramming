package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("Please enter an Adverb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb = MessageBox.askForTextInput("Please enter an verb ending in '-ed'");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart= MessageBox.askForTextInput("Please enter a body part. ")
    String currentStory = "Today";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory = "I woke " + currentAdverb + ".";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    currentStory = "Then I " + currentEdVerb + "";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    MessageBox.showMessage(currentStory);
  }
}