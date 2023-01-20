package be.intecbrussel;

public class MainApp {

    private static double myDouble;

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



        // Deel 1

        int i = 0;
        int j = 1;
        int sum = 0;
        int sumEvenNumbers = 0;

        while (j < 500000){

            sum = i + j;
            i = j;
            j = sum;

            System.out.print(sum + " ");

            if (sum % 2 == 0) {
                sumEvenNumbers += sum;
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers : " + sumEvenNumbers);

        // Deel 2

        int sumOfMultipelsOf3And17 = 0;
        for (int k = 1; k < 10000; k++) {
            if (k % 3 == 0 && k % 17 == 0) {
                sumOfMultipelsOf3And17 += k;
                System.out.print(k + " ");
            }
        }
        System.out.println();
        System.out.println("Sum van alle veelvouden van 3 en 17 is : " + sumOfMultipelsOf3And17);

        System.out.println("************************************");

        day = 4;

        switch (day) {
            // Meerdere cases zonder een break statements.
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid");
        }

        int myInt = 9;

        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        myDouble = 9.78D;
        myInt = (int) myDouble;

        System.out.println(myInt);
        System.out.println(myDouble);

        System.out.println("**********************************");

        // Casting conversion (5.4) of a float literal to
        // type int. Without the cast operator, this would
        // be a compile-time error, because this is a
        // narrowing conversion (5.1.3):
        i = (int)12.5f;
        // String conversion (5.4) of i's int value:
        System.out.println("(int)12.5f==" + i);
        // Assignment conversion (5.2) of i's value to type
        // float. This is a widening conversion (5.1.2):
        float f = i;
        // String conversion of f's float value:
        System.out.println("after float widening: " + f);
        // Numeric promotion (5.6) of i's value to type
        // float. This is a binary numeric promotion.
        // After promotion, the operation is float*float:
        System.out.print(f);
        f = f * i;
        // Two string conversions of i and f:
        System.out.println(" * " + i + "==" + f);
        // Method invocation conversion (5.3) of f's value
        // to type double, needed because the method Math.sin
        // accepts only a double argument:
        double d = Math.sin(f);
        // Two string conversions of f and d:
        System.out.println("Math.sin(" + f + ")==" + d);

    }
}
