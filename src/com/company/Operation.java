package com.company;

import java.util.*;

public class Operation {

    public static void main(String args[]) {

    }

    public static void userInput() {

        Scanner input = new Scanner(System.in);

        //takes input from user
        String str = "";
        String convertedStr = "";// output the input by changing the words

        ArrayList<String> addedHedges = new ArrayList<String>(); // arraylist for hedges

        addedHedges.add("Please tell me more");

        addedHedges.add("Many of my patients tell me the same thing");

        addedHedges.add("It is getting late, maybe we had better quit");


        ArrayList<String> addedQualifiers = new ArrayList<String>(); //arraylist for qualifiers

        addedQualifiers.add("Why do you say that");

        addedQualifiers.add("You seem to think that");

        addedQualifiers.add("So, you are concerned that");

        HashMap<String, String> wordReplace = new HashMap<String, String>();

        wordReplace.put("i", "you");
        wordReplace.put("me", "you");
        wordReplace.put("my", "your");
        wordReplace.put("am", "are");

        while (true) {

            System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
            str = input.nextLine();
            convertedStr = "";

            if ((str.equalsIgnoreCase("q")) | (str.equalsIgnoreCase("i am feeling great"))) {

                break;

            }

            else {

                for (String retval : str.split(" ")) {

                String[] retVal = str.split(" ");

                if (wordReplace.containsKey(retval)) {

                    convertedStr += wordReplace.get(retval) + " ";
                } else {

                    convertedStr += retval + " ";
                }
            }

                Collections.shuffle(addedHedges); }// shuffle hedges
                Collections.shuffle(addedQualifiers);

                  Random rnd = new Random();

            if (rnd.nextBoolean()){
                System.out.println(addedHedges.get(0)); //output qualifiers from arraylist + the converted string
            }
            else {
                System.out.println(addedQualifiers.get(0) + " " + convertedStr);
            }

            }
        }
    }




