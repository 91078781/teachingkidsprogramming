package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      tellMoreStory("You wake up and have a boring day. The end.");
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      tellMoreStory(
          "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
      String input = askAQuestion("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
      if ("toilet".equalsIgnoreCase(input))
      {
        pourIntoToilet();
      }
      else if ("backyard".equalsIgnoreCase(input))
        ;
      {
        pourIntoBackyard();
      }
      System.exit(0);
    }
    else
    {
      tellMoreStory("You don't know how to read directions. You can't play this game. The end.");
    }
  }
  private static void pourIntoBackyard()
  {
    tellMoreStory(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String ask = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("faint".equalsIgnoreCase(ask))
    {
      tellMoreStory("You made a delicious soup! Yum! The end.");
    }
    else if ("scream".equalsIgnoreCase(ask))
    {
      startStory();
    }
    else
    {
      System.exit(0);
    }
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    String action = askAQuestion("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
    if ("yes".equalsIgnoreCase(action))
    {
      tellMoreStory("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("heck yes".equalsIgnoreCase(action))
    {
      tellMoreStory("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      System.exit(0);
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
