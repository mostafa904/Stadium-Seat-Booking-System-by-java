package com.mycompany;

import java.util.*;
public class Main {
    private static final int MATCHESOFSUNDAY = 1;
    private static final int MATCHESOFMONDAY = 2;
    private static final int MATCHESOFTHURASDAY = 3;

    public static void main(String[] args) {
        System.out.println("\t\t\tWelcome to Tazkarty");
        Scanner input = new Scanner(System.in);
        Matches matches = new Matches();
        Ticket ticket = new Ticket(50);

        boolean v = true;
        while (v) {
            System.out.println("Display order :\n 1- matches sunday \n 2- matches monday\n 3- matches thusday \n Enter your choice : ");
            int choice = input.nextInt();

            switch (choice) {
                case MATCHESOFSUNDAY:
                    System.out.println(matches.matchesOfSunday);
                    System.out.println("choose your match");
                    int n = input.nextInt();
                    if (n == 1) {
                        matches.setMatchName("El-Ahly VS EL-ZAMALEK");
                        matches.setMatchDate("sunday 1/1/2023");
                        matches.setMatchTime(" at 4pm");
                    } else {
                        matches.setMatchName("liverpool VS manchester city");
                        matches.setMatchDate("sunday 1/1/2023");
                        matches.setMatchTime("At 10 pm");
                    }
                    break;

                case MATCHESOFMONDAY:
                    System.out.println(matches.matchesOfMonday);
                    System.out.println("choose your match");
                    int x = input.nextInt();
                    if (x == 1) {
                        matches.setMatchName("real madrid VS Barcelona");
                        matches.setMatchDate("monday 2/1/2023");
                        matches.setMatchTime(" at 5pm");
                    } else {
                        matches.setMatchName("Arsenal VS Chelsea");
                        matches.setMatchDate("monday 2/1/2023");
                        matches.setMatchTime("At 9 pm");
                    }
                    break;
                case MATCHESOFTHURASDAY:
                    System.out.println(matches.matchesOfThursday);
                    System.out.println("choose your match");
                    int z = input.nextInt();
                    if (z == 1) {
                        matches.setMatchName("manchester united Vs tottenham");
                        matches.setMatchDate("thusday 3/1/2023");
                        matches.setMatchTime(" at 2pm");
                    } else {
                        matches.setMatchName("paris saint german VS monaco");
                        matches.setMatchDate("thusday 3/1/2023");
                        matches.setMatchTime("At 7 pm");
                    }
                    break;
            }
            System.out.println("ok , please enter your name : ");
            String userName = input.next();

            System.out.println("Enter your phone number : ");
            int userPhoneNumber = input.nextInt();
            System.out.println("Please choice ticket category   ");
            ticket.CategoryA();
            ticket.CategoryB();
            ticket.CategoryC();

            String category = input.next();
            if ("1".equals(category)) {
                category = "A";
            } else if ("2".equals(category)) {
                category = "B";
            } else if ("3".equals(category)) {
                category = "C";
            }
            ticket.setCategory(category);


            System.out.println("-> Reservation is successful <-");
            System.out.println("Do you want to see the reservation please click ok:");
            String st = input.next();


            Stadium stadium = new Stadium(500);
            User user = new User(userName, userPhoneNumber, ticket);

            if ("ok".equals(st)) {
                System.out.println("*************************************");
                System.out.println("The match you have booked is : " + matches.getMatchName());
                System.out.println("Match date :" + matches.getMatchDate());
                System.out.println("Match Time :" + matches.getMatchtime());
                System.out.println("User Name is " + user.getUserName());
                System.out.println("User phone number is " + user.getUserPhone());
                System.out.println("chair category " + user.reservedCategory());
                System.out.println("USER ID " + User.user_id);
                System.out.println("**************************************");

            }
            System.out.println("to make a new reservation enter yes");
            String y = input.next();
            if ("yes".equals(y)) {
                v = true;
            } else {
                System.out.println("thanks for your Time");
                v = false;
            }

        }


    }

}