package com.menstrualproj;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleTracker {
    private Scanner input;
    private String actualDate;
    private LocalDate date;
    List<String> symptoms;


    public void addEntry() {
        input = new Scanner(System.in);
//******************* ASK DATE INFORMATION *******************
        System.out.println("Today is " + (date = LocalDate.now()) );
        System.out.println("Is this entry for today or a different day? (Type today or diff)");
        String answer = input.next();
        answer.toLowerCase();
        if (answer.equals("diff")) {
            System.out.println("What is your date?\nPlease type in YYYY-MM-DD format:");
            actualDate = input.next();
        }
        else if (answer.equals("today")) {
            actualDate = String.valueOf(LocalDate.now());
        }
        input.nextLine();
//******************* ASK SYMPTOMS QUESTIONS *******************
        boolean userWantsToContinue = false;
        symptoms = new ArrayList<>();
        do  {
            String str = """
               Great! Lets start with your physical symptoms:
               Any Cramps?
               Bloating?
               Breast Tenderness?
               Fatigue?
               Headaches/Migraines?
               Please type the symptom exactly as its said:
                """;
            System.out.println(str);
            String symptomsAnswer = input.nextLine();
            symptomsAnswer.toLowerCase();
            if (symptomsAnswer.equals("cramps")) {
                String str1 = """
                        Are your cramps:
                        Mild (can do day to day activities with a little discomfort)
                        Moderate (might need to take medication or take it easy this day)
                        Severe (unable to function, must take meds)
                        """;
                System.out.println(str1);
                String crampsAnswer = input.nextLine();
                System.out.println("Okay so Cramps - " + crampsAnswer.toUpperCase() +
                                    "\nWould you like to continue adding physical symptoms? (Y/N)");
                char yesNoCramps = input.next().charAt(0);
                symptoms.add("Cramps - " + crampsAnswer);
                Character.toLowerCase(yesNoCramps);
                userWantsToContinue = yesNoCramps == 'y' || yesNoCramps == 'n';
            }

        } while (userWantsToContinue);
//yeah

    }
}
