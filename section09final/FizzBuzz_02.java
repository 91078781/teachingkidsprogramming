package org.teachingkidsprogramming.section09final;

public class FizzBuzz_02
{
  public static void main(String[] args)
  {
    for (int i = 1; i < 101; i++)
    {
      if (i % 15 == 0)
      {
        System.out.println(" FizzBuzz ");
      }
      else if (i % 3 == 0)
      {
        System.out.println(" Fizz ");
      }
      else if (i % 5 == 0)
      {
        System.out.print("Buzz");
      }
      else
      {
        System.out.println(i);
      }
    }
  }
}
