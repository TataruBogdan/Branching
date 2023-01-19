package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {


        // boolean hasSubscription = false;

        /*if (hasSubscription == true) {
            System.out.println("Show article");
        } else {
            System.out.println("Show subscribe banner");
        }*/

        String name= "Quinten";
        String language = "NL";

        if (language.equals("NL")) {
            System.out.println("Goedendag " + name);
        } else if (language == "DE") {
            System.out.println("Guten tag " + name);
        } else if (language == "FR"){
            System.out.println("Bonjour" + name);
        } else {
            System.out.println("Hello " + name);
        }

        System.out.println("*************************************");

        //Oefening 1:
        int number1 = 5;
        int number2 = 6;
        int a = 10;
        int b = 12;

        if (number1 == number2) {
            System.out.println("Getallen zijn gelijke");
        } else {
            System.out.println("Getallen zijn niet gelijk");
        }


        // school
        if (a == b ) {
            System.out.println("Getallen zijn gelijke");
        } else if (a != b) {
            System.out.println("Getallen zijn niet gelijk");
        }

        //of
        if (a == b) {
            System.out.println("Getallen zijn gelijke");
        }

        // Oefening 2
        int number = 11;
        if (number % 2 == 0) {
            System.out.println("Getal is even");
        } else {
            System.out.println("Getal is oneven");
        }

        // switch
        System.out.println("-------------SWITCH--------------");

        language = "EN";

        switch (language) {

            case "NL" :
                System.out.println("Goedemorgen " + name);
                break;
            case "FR" :
                System.out.println("Bonjour" + name);
                break;
            case "DE" :
                System.out.println("Guten tag" + name);
                break;
            default:
                System.out.println("Hello " + name);
        }

        int day = 1;
        switch(day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.print("Invalid");
        }

        System.out.println("-------complex statements----------");

        name = "Quinten";
        language = "NL";
        int time = 9;

        if (language.equals("NL") && time < 12) {
            System.out.println("Goedemorgen, " + name);
        } else if (language.equals("NL") && time >= 12 && time <18) {
            System.out.println("Goedemiddag, " + name);
        } else if (language.equals("NL") && time >= 18 && time <= 24) {
            System.out.println("Goede avond, " + name);
        } else {

        }

        //nested if
        if (language.equals("NL")) {
            if (time < 12) {
                System.out.println("Goedemorgen " + name);
            } else if (time >= 12 && time  < 18) {
                System.out.println("Goedenamiddag " + name);
            } else if (time <= 18 && time <= 24) {
                System.out.println("Goede avond " + name);
            }
        } else if (language.equals("FR")) {
            if (time < 12) {
                System.out.println("Bonjour, " + name );
            } else if (time >= 12 && time < 18) {
                System.out.println("Bon apres midi, " + name);
            } else if (time >= 18 && time <= 24) {
                System. out.println("Bonsoir, " + name);
            }
        }

        // ternary operator

        // normall if
        int age = 17;
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }

        // ternary operator
        System.out.println((age > 18) ? "Adult" : "Child" );

        // Oefening Branching

        // Oefening 1
        number = 10;

        if (number % 2 == 0) {
            System.out.println("Nummer is even");
        } else {
            System.out.println("Nummer is oneven");
        }

        // Oefening 2
        int year = 2024;
        if ((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) {
                System.out.println("Jaar is schrikkeljaar " + year);
        } else {
            System.out.println("Yaar is geen schrikkeljaar");
        }

        // Oefening 3

        System.out.println(((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0) ? "Jaar is schrikkeljaar " : "Jaar is geen schrikkeljaar");

        System.out.println("*************************************");
        // Oefening 1

        number1 = 7;
        number2 = 16;

        if (number1 > number2) {
            System.out.println("Grotste getal is " + number1);
        } else {
            System.out.println("Grotste getal is " + number2);
        }

        System.out.println((number1 > number2) ? "Grotste getal is nummer 1" : "Grotste getal is nummer 2");

        // Oefening 2

        if (number <= 0) {
            System.out.println("Nummer is negatief of 0");
        } else {
            System.out.println("Nummer is positief");
        }

        System.out.println((number <= 0) ? "Nummer is negatief of 0" : "Nummer is positief");

        // Oefening 3
        String month = "March";
        int dayCount = 0;

        switch (month) {
            case "January", "March",  "May", "July", "Augustus", "October", "December" :
                dayCount = 31;
                break;
            case "February"  :
                dayCount = 29;
                break;
            case "April", "june", "September", "November":
                dayCount = 30;
                break;
            default:
                System.out.println("Maand is niet goed");
        }
        System.out.println("Zijn " + dayCount + " dagen in jaar");

        // Oefening 4

        if (number > 0) {
            System.out.println("Nummer is positive" );
        } else {
            System.out.println("Nummer is niet positive");
        }

        /*int i = 1;
        for (int j = i; j < 500000; j++) {
            i = i + j;
            System.out.println(i);
        }*/

        int i = 0;
        int j = 1;
        while (j < 500000) {
            j = i + j;
            i = j;

            System.out.print(j + " ");
        }






    }
}
