import java.util.Scanner;

public class Recommendation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        say("I am the smartest machine alive!");
        say("Watch, I'll prove it!");
        say("What is your name?");
        String name = scanner.nextLine();
        say("Now enter your age:");
        int age = scanner.nextInt();
        say("Excellent, now " + name
                + ", I will use my extreme intellegence to figure out exactly what movie you will like!");
        say("But first, a short quiz to find out what you will like (yes or no):");
        say("You should have around " + (100 - age) + " years to complete, so don't waste time.");
        question("Do you like animated movies?", 1);
        String waste = scanner.nextLine();

        String Animation = scanner.nextLine();
        if (Animation.equals("yes")) {
            say("Brilliant!");
            question("Do you like Disney/ Pixar movies?", 2);
            String disney = scanner.nextLine();
            if (disney.equals("yes")) {
                say("That narrows it down!");
                question("Do you prefer 2d Animation?", 3);
                String d2 = scanner.nextLine();
                if (d2.equals("yes")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer = scanner.nextLine();
                    if (finalAnswer.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is Alladin.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
                if (d2.equals("no")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer = scanner.nextLine();
                    if (finalAnswer.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is The Incredibles.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
            }
            if (disney.equals("no")) {
                say("You wouldn't get along with my 8th Grade history teacher.");
                question("Do you prefer 2d Animation?", 3);
                String d2 = scanner.nextLine();
                if (d2.equals("yes")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer = scanner.nextLine();
                    if (finalAnswer.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is Spider-Man Into the Spider-Verse.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
                if (d2.equals("no")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer = scanner.nextLine();
                    if (finalAnswer.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is Kung Fu Panda.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
            }

        }

        if (Animation.equals("no")) {
            say("So you prefer the real world?");
            question("Do you like Disney+ movies?", 2);
            String disney2 = scanner.nextLine();
            if (disney2.equals("yes")) {
                say("I think I know what you're hinting at!");
                question("Do you like Superhero movies?", 3);
                String superhero = scanner.nextLine();
                if (superhero.equals("yes")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer = scanner.nextLine();
                    if (finalAnswer.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is Iron Man.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
                if (superhero.equals("no")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer2 = scanner.nextLine();
                    if (finalAnswer2.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is Mrs. Doubtfire.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
            }
            if (disney2.equals("no")) {
                say("That leaves half of all movies!");
                question("Do you like Superhero movies?", 3);
                String superhero2 = scanner.nextLine();
                if (superhero2.equals("yes")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer = scanner.nextLine();
                    if (finalAnswer.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is The Dark Knight.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");
                    }
                }
                if (superhero2.equals("no")) {
                    say("One last Final Question: ");
                    question("Is this the smartest machine alive?", 4);
                    String finalAnswer3 = scanner.nextLine();
                    if (finalAnswer3.equals("yes")) {
                        say("You unlocked the answer! The perfect movie for you is Night at the Museum.");
                    } else {
                        say("Either your reading far too deep into the word alive, or you are don't have beleif in my powers. Either way no recomendation for you.");

                    }
                } else {
                    say("Since didn't enter a correct answer you are now sentenced1 to read a book!!");
                }
            } else {
                say("Since didn't enter a correct answer you are now sentenced to read a book!!");
            }
        } else {
            say("Since didn't enter a correct answer you are now sentenced to read a book!!");
        }
    }

    static void question(String ask, int c) {

        say("Now for question " + c + ": " + ask);

    }

    static void say(String message) {
        System.out.println(message);
    }
}