package griffith;
import java.util.Random;
import java.util.Scanner;

public class FruitMachine {
    public static void main(String[] args) {
        clearConsole();
        Scanner input = new Scanner(System.in);

        String[][][] item_list = {new String[4][11], new String[4][11], new String[4][11], new String[4][11], new String[4][11], new String[4][11], new String[4][11], new String[4][11], new String[4][11]};

        String[][] bell = new String[4][11];
        bell[0][0] = "\u001b[37;40m\u001b[1m\u001b[34m "; bell[0][1] = " "; bell[0][2] = " "; bell[0][3] = " "; bell[0][4] = "_"; bell[0][5] = "o"; bell[0][6] = "_"; bell[0][7] = " "; bell[0][8] = " "; bell[0][9] = " "; bell[0][10] = " \u001b[0m";
        bell[1][0] = "\u001b[37;40m\u001b[1m\u001b[34m "; bell[1][1] = " "; bell[1][2] = " "; bell[1][3] = "("; bell[1][4] = " "; bell[1][5] = " "; bell[1][6] = " "; bell[1][7] = ")"; bell[1][8] = " "; bell[1][9] = " "; bell[1][10] = " \u001b[0m";
        bell[2][0] = "\u001b[37;40m\u001b[1m\u001b[34m "; bell[2][1] = " "; bell[2][2] = " "; bell[2][3] = ")"; bell[2][4] = " "; bell[2][5] = " "; bell[2][6] = " "; bell[2][7] = "("; bell[2][8] = " "; bell[2][9] = " "; bell[2][10] = " \u001b[0m";
        bell[3][0] = "\u001b[37;40m\u001b[1m\u001b[34m "; bell[3][1] = " "; bell[3][2] = "'"; bell[3][3] = "-"; bell[3][4] = "'"; bell[3][5] = "o"; bell[3][6] = "'"; bell[3][7] = "-"; bell[3][8] = "'"; bell[3][9] = " "; bell[3][10] = " \u001b[0m";

        String[][] seven = new String[4][11];
        seven[0][0] = "\u001b[37;40m\u001b[1m\u001b[33m "; seven[0][1] = "="; seven[0][2] = "="; seven[0][3] = "="; seven[0][4] = "="; seven[0][5] = "="; seven[0][6] = "="; seven[0][7] = "="; seven[0][8] = "="; seven[0][9] = " "; seven[0][10] = " \u001b[0m";
        seven[1][0] = "\u001b[37;40m\u001b[1m\u001b[33m "; seven[1][1] = " "; seven[1][2] = " "; seven[1][3] = " "; seven[1][4] = " "; seven[1][5] = "/"; seven[1][6] = " "; seven[1][7] = "/"; seven[1][8] = " "; seven[1][9] = " "; seven[1][10] = " \u001b[0m";
        seven[2][0] = "\u001b[37;40m\u001b[1m\u001b[33m "; seven[2][1] = " "; seven[2][2] = " "; seven[2][3] = " "; seven[2][4] = "/"; seven[2][5] = " "; seven[2][6] = "/"; seven[2][7] = " "; seven[2][8] = " "; seven[2][9] = " "; seven[2][10] = " \u001b[0m";
        seven[3][0] = "\u001b[37;40m\u001b[1m\u001b[33m "; seven[3][1] = " "; seven[3][2] = " "; seven[3][3] = "/"; seven[3][4] = " "; seven[3][5] = "/"; seven[3][6] = " "; seven[3][7] = " "; seven[3][8] = " "; seven[3][9] = " "; seven[3][10] = " \u001b[0m";

        String[][] star = new String[4][11];
        star[0][0] = "\u001b[37;40m\u001b[1m\u001b[35m "; star[0][1] = " "; star[0][2] = "_"; star[0][3] = "_"; star[0][4] = "/"; star[0][5] = "^"; star[0][6] = "\\"; star[0][7] = "_"; star[0][8] = "_"; star[0][9] = " "; star[0][10] = " \u001b[0m";
        star[1][0] = "\u001b[37;40m\u001b[1m\u001b[35m "; star[1][1] = " "; star[1][2] = "\\"; star[1][3] = " "; star[1][4] = " "; star[1][5] = "*"; star[1][6] = " "; star[1][7] = " "; star[1][8] = "/"; star[1][9] = " "; star[1][10] = " \u001b[0m";
        star[2][0] = "\u001b[37;40m\u001b[1m\u001b[35m "; star[2][1] = " "; star[2][2] = " "; star[2][3] = ">"; star[2][4] = " "; star[2][5] = " "; star[2][6] = " "; star[2][7] = "<"; star[2][8] = " "; star[2][9] = " "; star[2][10] = " \u001b[0m";
        star[3][0] = "\u001b[37;40m\u001b[1m\u001b[35m "; star[3][1] = " "; star[3][2] = "/"; star[3][3] = "."; star[3][4] = "-"; star[3][5] = "^"; star[3][6] = "-"; star[3][7] = "."; star[3][8] = "\\"; star[3][9] = " "; star[3][10] = " \u001b[0m";

        String[][] apple = new String[4][11];
        apple[0][0] = "\u001b[37;40m\u001b[1m\u001b[32m "; apple[0][1] = " "; apple[0][2] = " "; apple[0][3] = " "; apple[0][4] = " "; apple[0][5] = ")"; apple[0][6] = " "; apple[0][7] = " "; apple[0][8] = " "; apple[0][9] = " "; apple[0][10] = " \u001b[0m";
        apple[1][0] = "\u001b[37;40m\u001b[1m\u001b[32m "; apple[1][1] = " "; apple[1][2] = " "; apple[1][3] = "."; apple[1][4] = "-"; apple[1][5] = "'"; apple[1][6] = "-"; apple[1][7] = "."; apple[1][8] = " "; apple[1][9] = " "; apple[1][10] = " \u001b[0m";
        apple[2][0] = "\u001b[37;40m\u001b[1m\u001b[32m "; apple[2][1] = " "; apple[2][2] = "("; apple[2][3] = "/"; apple[2][4] = "/"; apple[2][5] = "/"; apple[2][6] = "/"; apple[2][7] = "/"; apple[2][8] = ")"; apple[2][9] = " "; apple[2][10] = " \u001b[0m";
        apple[3][0] = "\u001b[37;40m\u001b[1m\u001b[32m "; apple[3][1] = " "; apple[3][2] = " "; apple[3][3] = "`"; apple[3][4] = "-"; apple[3][5] = "="; apple[3][6] = "-"; apple[3][7] = "`"; apple[3][8] = " "; apple[3][9] = " "; apple[3][10] = " \u001b[0m";

        String[][] cherry = new String[4][11];
        cherry[0][0] = "\u001b[37;40m\u001b[1m\u001b[31m "; cherry[0][1] = " "; cherry[0][2] = " "; cherry[0][3] = "|"; cherry[0][4] = "\\"; cherry[0][5] = " "; cherry[0][6] = " "; cherry[0][7] = " "; cherry[0][8] = " "; cherry[0][9] = " "; cherry[0][10] = " \u001b[0m";
        cherry[1][0] = "\u001b[37;40m\u001b[1m\u001b[31m "; cherry[1][1] = " "; cherry[1][2] = " "; cherry[1][3] = "\\"; cherry[1][4] = "|"; cherry[1][5] = "_"; cherry[1][6] = "\\"; cherry[1][7] = "_"; cherry[1][8] = " "; cherry[1][9] = " "; cherry[1][10] = " \u001b[0m";
        cherry[2][0] = "\u001b[37;40m\u001b[1m\u001b[31m "; cherry[2][1] = " "; cherry[2][2] = " "; cherry[2][3] = " "; cherry[2][4] = "("; cherry[2][5] = "_"; cherry[2][6] = ")"; cherry[2][7] = "_"; cherry[2][8] = ")"; cherry[2][9] = " "; cherry[2][10] = " \u001b[0m";
        cherry[3][0] = "\u001b[37;40m\u001b[1m\u001b[31m "; cherry[3][1] = " "; cherry[3][2] = " "; cherry[3][3] = " "; cherry[3][4] = " "; cherry[3][5] = " "; cherry[3][6] = "("; cherry[3][7] = "_"; cherry[3][8] = ")"; cherry[3][9] = " "; cherry[3][10] = " \u001b[0m";

        String[][] block = new String[4][11];
        block[0][0] = "\u001b[37;40m "; block[0][1] = " "; block[0][2] = " "; block[0][3] = " "; block[0][4] = " "; block[0][5] = " "; block[0][6] = " "; block[0][7] = " "; block[0][8] = " "; block[0][9] = " "; block[0][10] = " \u001b[0m";
        block[1][0] = "\u001b[37;40m "; block[1][1] = " "; block[1][2] = " "; block[1][3] = " "; block[1][4] = " "; block[1][5] = " "; block[1][6] = " "; block[1][7] = " "; block[1][8] = " "; block[1][9] = " "; block[1][10] = " \u001b[0m";
        block[2][0] = "\u001b[37;40m "; block[2][1] = " "; block[2][2] = " "; block[2][3] = " "; block[2][4] = " "; block[2][5] = " "; block[2][6] = " "; block[2][7] = " "; block[2][8] = " "; block[2][9] = " "; block[2][10] = " \u001b[0m";
        block[3][0] = "\u001b[37;40m "; block[3][1] = " "; block[3][2] = " "; block[3][3] = " "; block[3][4] = " "; block[3][5] = " "; block[3][6] = " "; block[3][7] = " "; block[3][8] = " "; block[3][9] = " "; block[3][10] = " \u001b[0m";

        String login;
        double credits = 25.0;
        double bet = 3.5;

        boolean isAdminMenu = false;

        while (true) {
            System.out.print("\u001b[1mEnter your login: \u001b[32m");
            login = input.nextLine();
            System.out.print("\u001b[0m");
            if (login.equals("N")) {
                System.out.println("\u001b[1m────────────────────────────────────────Admin Menu───\u001b[0m");
                do {
                    System.out.print("\u001b[1mEnter desired balance: \u001b[32m");
                    try {
                        double inputCredits = input.nextDouble();
                        System.out.print("\u001b[0m");
                        if (inputCredits <= 999999999)  {
                            isAdminMenu = true; // This was added to prevent going throw the main loop again after quiting secondary loop.
                            credits = inputCredits;
                            break;
                        } else {
                            System.out.println("\u001b[1m\u001b[31mAchtung! | Should be no more then 999999999\u001b[0m");
                        }
                    } catch (Exception e) {
                        System.out.println("\u001b[1m\u001b[31mAchtung! | Input error\u001b[0m");
                        input.nextLine();
                    }
                } while(true);
            } else if (login.length() <= 10) {
                break;
            } else {
                System.out.println("\u001b[1m\u001b[31mAchtung! | Should no more then 10 charachters\u001b[0m");
            }
            // This was added to prevent going throw the main loop again after quiting secondary loop.
            if (isAdminMenu) {
                break;
            }
        }

        // Switch type of loop; 3 different options, uses other methods for displaying and outputting parts of the game.
        while (true) {
            displayMainMenu(block, login);
            System.out.print("\u001b[1mChoose menu option: \u001b[32m");
            String menuChoice = input.next();
            System.out.print("\u001b[0m");
            switch (menuChoice) {
                default:
                    System.out.println("\u001b[1m\u001b[31mNothing was chosen!\u001b[0m");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                    break;
                case "p":
                    machineGame(item_list, bell, seven, star, apple, cherry, block, credits, bet);
                    break;
                case "r":
                    ruleset();
                    break;
                case "e":
                    System.out.println("\u001b[1m\u001b[32mSee you next time!\u001b[0m");
                    break;
            }
            if (menuChoice.equals("e")) {
                break;
            }
        }
    }

    public static void clearConsole() {
        System.out.println("\033c");
    }

    public static void waitConsole(int value_ms) {
        try {
            Thread.sleep(value_ms);
        } catch (Exception e) {}
    }

    public static void machineGame (String[][][] item_list, String[][] bell, String[][] seven, String[][] star, String[][] apple, String[][] cherry, String[][] block, double credits, double bet) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (true) {
            if (counter == 0) {
                displayGame(block, credits, bet);
            } else {
                displayGame2(item_list, credits, bet);
            }
            System.out.print("\u001b[1mChoose menu option: \u001b[32m");
            Scanner pressEnter = new Scanner(System.in);
            String menuChoice = pressEnter.nextLine();
            System.out.print("\u001b[0m");

            if (menuChoice.isEmpty()) {
                if (credits >= bet) {
                    counter++;
                    credits = credits - bet;
                    machineCore(item_list, bell, seven, star, apple, cherry, block);
                    if (combos(item_list, bell, seven, star, apple, cherry) > 0) {
                        displayWin(item_list, bell, seven, star, apple, cherry);
                        credits = (double) Math.round((credits + bet * combos(item_list, bell, seven, star, apple, cherry))*10)/10 ;
                    } else {
                        displayLose(item_list);
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {}
                } else {
                    System.out.println("\u001b[1m\u001b[31mAchtung! | Balance is too low\u001b[0m");
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {}
                }
            } else if (menuChoice.equals("d")) {
                while (true) {
                    clearConsole();
                    do {
                        displayGame(block, credits, bet);
                        System.out.print("\u001b[1mEnter your deposit: \u001b[32m");
                        try {
                            double depositChoice = input.nextDouble();
                            System.out.print("\u001b[0m");
                            if (depositChoice >= 0 && depositChoice <= 999999999)  {
                                credits += depositChoice;
                                break;
                            } else {
                                System.out.println("\u001b[1m\u001b[31mAchtung! | Should be no more then 999999999 or less then 0\u001b[0m");
                                waitConsole(1000);
                                clearConsole();
                            }
                        } catch (Exception e) {
                            System.out.println("\u001b[1m\u001b[31mAchtung! | Input error\u001b[0m");
                            waitConsole(1000);
                            clearConsole();
                            input.nextLine();
                        }
                    } while(true);
                    break;
                }
            } else if (menuChoice.equals("b")) {
                while (true) {
                    clearConsole();
                    do {
                        displayGame(block, credits, bet);
                        System.out.print("\u001b[1mWhat is your bet: \u001b[32m");
                        try {
                            double betChoice = input.nextDouble();
                            System.out.print("\u001b[0m");
                            if (betChoice >= 0 && betChoice <= 999999999)  {
                                bet = betChoice;
                                break;
                            } else {
                                System.out.println("\u001b[1m\u001b[31mAchtung! | Should be no more then 999999999 or less then 0\u001b[0m");
                                waitConsole(1000);
                                clearConsole();
                            }
                        } catch (Exception e) {
                            System.out.println("\u001b[1m\u001b[31mAchtung! | Input error\u001b[0m");
                            waitConsole(1000);
                            clearConsole();
                            input.nextLine();
                        }
                    } while(true);
                    break;
                }
            } else if (menuChoice.equals("m")) {
                break;
            } else {
                System.out.println("\u001b[1m\u001b[31mNothing was chosen!\u001b[0m");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
            }
        }
    }

    public static void machineCore(String[][][] item_list, String[][] bell, String[][] seven, String[][] star, String[][] apple, String[][] cherry, String[][] block) {
        Random random = new Random();
        //first iteration of animation
        for (int times = 0; times < 3; times++) {
            int randomValue0 = random.nextInt(100) + 1;
            if (randomValue0 <= 10) {
                item_list[0] = bell;
            } else if (randomValue0 <= 25) {
                item_list[0] = seven;
            } else if (randomValue0 <= 45) {
                item_list[0] = star;
            } else if (randomValue0 <= 70) {
                item_list[0] = apple;
            } else {
                item_list[0] = cherry;
            }

            int randomValue3 = random.nextInt(100) + 1;
            if (randomValue3 <= 10) {
                item_list[3] = bell;
            } else if (randomValue3 <= 25) {
                item_list[3] = seven;
            } else if (randomValue3 <= 45) {
                item_list[3] = star;
            } else if (randomValue3 <= 70) {
                item_list[3] = apple;
            } else {
                item_list[3] = cherry;
            }

            int randomValue6 = random.nextInt(100) + 1;
            if (randomValue6 <= 10) {
                item_list[6] = bell;
            } else if (randomValue6 <= 25) {
                item_list[6] = seven;
            } else if (randomValue6 <= 45) {
                item_list[6] = star;
            } else if (randomValue6 <= 70) {
                item_list[6] = apple;
            } else {
                item_list[6] = cherry;
            }

            try {
                Thread.sleep(400);
            } catch (Exception e) {}

            System.out.println("\033c");

            display1(item_list, block);
        }

        //second iteration of animation
        for (int times = 0; times < 3; times++) {
            int randomValue1 = random.nextInt(100) + 1;
            if (randomValue1 <= 10) {
                item_list[1] = bell;
            } else if (randomValue1 <= 25) {
                item_list[1] = seven;
            } else if (randomValue1 <= 45) {
                item_list[1] = star;
            } else if (randomValue1 <= 70) {
                item_list[1] = apple;
            } else {
                item_list[1] = cherry;
            }

            int randomValue4 = random.nextInt(100) + 1;
            if (randomValue4 <= 10) {
                item_list[4] = bell;
            } else if (randomValue4 <= 25) {
                item_list[4] = seven;
            } else if (randomValue4 <= 45) {
                item_list[4] = star;
            } else if (randomValue4 <= 70) {
                item_list[4] = apple;
            } else {
                item_list[4] = cherry;
            }

            int randomValue7 = random.nextInt(100) + 1;
            if (randomValue7 <= 10) {
                item_list[7] = bell;
            } else if (randomValue7 <= 25) {
                item_list[7] = seven;
            } else if (randomValue7 <= 45) {
                item_list[7] = star;
            } else if (randomValue7 <= 70) {
                item_list[7] = apple;
            } else {
                item_list[7] = cherry;
            }
            try {
                Thread.sleep(400);
            } catch (Exception e) {}

            System.out.println("\033c");

            display2(item_list, block);
        }

        //third iteration of animation
        for (int times = 0; times < 3; times++) {
            int randomValue2 = random.nextInt(100) + 1;
            if (randomValue2 <= 10) {
                item_list[2] = bell;
            } else if (randomValue2 <= 25) {
                item_list[2] = seven;
            } else if (randomValue2 <= 45) {
                item_list[2] = star;
            } else if (randomValue2 <= 70) {
                item_list[2] = apple;
            } else {
                item_list[2] = cherry;
            }

            int randomValue5 = random.nextInt(100) + 1;
            if (randomValue5 <= 10) {
                item_list[5] = bell;
            } else if (randomValue5 <= 25) {
                item_list[5] = seven;
            } else if (randomValue5 <= 45) {
                item_list[5] = star;
            } else if (randomValue5 <= 70) {
                item_list[5] = apple;
            } else {
                item_list[5] = cherry;
            }

            int randomValue8 = random.nextInt(100) + 1;
            if (randomValue8 <= 10) {
                item_list[8] = bell;
            } else if (randomValue8 <= 25) {
                item_list[8] = seven;
            } else if (randomValue8 <= 45) {
                item_list[8] = star;
            } else if (randomValue8 <= 70) {
                item_list[8] = apple;
            } else {
                item_list[8] = cherry;
            }
            try {
                Thread.sleep(400);
            } catch (Exception e) {}

            System.out.println("\033c");

            display3(item_list);
        }
    }

    public static double combos(String[][][] item_list, String[][] bell, String[][] seven, String[][] star, String[][] apple, String[][] cherry) {
        double value = 0;
        //row
        if (item_list[0].equals(item_list[1]) && item_list[1].equals(item_list[2])) {
            value += multipliers(item_list, 0, 1, 2, bell, seven, star, apple, cherry);
        }
        if (item_list[3].equals(item_list[4]) && item_list[4].equals(item_list[5])) {
            value += multipliers(item_list, 3, 4, 5, bell, seven, star, apple, cherry);
        }
        if (item_list[6].equals(item_list[7]) && item_list[7].equals(item_list[8])) {
            value += multipliers(item_list, 6, 7, 8, bell, seven, star, apple, cherry);
        }
        //column
        if (item_list[0].equals(item_list[3]) && item_list[3].equals(item_list[6])) {
            value += multipliers(item_list, 0, 3, 6, bell, seven, star, apple, cherry);
        }
        if (item_list[1].equals(item_list[4]) && item_list[4].equals(item_list[7])) {
            value += multipliers(item_list, 1, 4, 7, bell, seven, star, apple, cherry);
        }
        if (item_list[2].equals(item_list[5]) && item_list[5].equals(item_list[8])) {
            value += multipliers(item_list, 2, 5, 8, bell, seven, star, apple, cherry);
        }
        //diagonal
        if (item_list[6].equals(item_list[4]) && item_list[4].equals(item_list[2])) {
            value += multipliers(item_list, 6, 4, 2, bell, seven, star, apple, cherry);
        }
        if (item_list[0].equals(item_list[4]) && item_list[4].equals(item_list[8])) {
            value += multipliers(item_list, 0, 4, 8, bell, seven, star, apple, cherry);
        }
        return value;
    }

    public static double multipliers(String[][][] item_list, int a, int b, int c, String[][] bell, String[][] seven, String[][] star, String[][] apple, String[][] cherry) {
        double value = 0;
        if(item_list[a].equals(cherry) && item_list[b].equals(cherry) && item_list[c].equals(cherry)) {
            value = 1.8;
        } else if (item_list[a].equals(apple) && item_list[b].equals(apple) && item_list[c].equals(apple)) {
            value = 2.6;
        } else if (item_list[a].equals(star) && item_list[b].equals(star) && item_list[c].equals(star)) {
            value = 3.9;
        } else if (item_list[a].equals(seven) && item_list[b].equals(seven) && item_list[c].equals(seven)) {
            value = 4.7;
        } else if (item_list[a].equals(bell) && item_list[b].equals(bell) && item_list[c].equals(bell)) {
            value = 5.5;
        }
        return value;
    }

    public static void ruleset() {
        Scanner input = new Scanner(System.in);
        clearConsole();
        while (true) {
            comboIcons();
            System.out.print("\u001b[1mChoose menu option: \u001b[32m");
            String menuChoice = input.nextLine();
            System.out.print("\u001b[0m");
            if (menuChoice.equals("c")) {
                combinations();
                waitConsole(5000);
                clearConsole();
            } else if(menuChoice.equals("m")) {
                break;
            } else {
                System.out.println("\u001b[1m\u001b[31mNothing was chosen!\u001b[0m");
                waitConsole(1000);
                clearConsole();
            }
        }
    }

    public static void comboIcons() {
        System.out.println("┌──────┬──────┬────────┐               \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│ \u001b[1mItem\u001b[0m │ \u001b[1mMult\u001b[0m │ \u001b[1mChance\u001b[0m │            ┌──────────────────┐");
        System.out.println("├──────┼──────┼────────┤            │  \u001b[1m\u001b[32mc\u001b[0m -- combos     │");
        System.out.println("│  \uD83D\uDD14  │ 5.5x │   10%  │            │  \u001b[1m\u001b[32mm\u001b[0m -- main menu  │");
        System.out.println("│  \uD83C\uDFB0  │ 4.7x │   15%  │            └─┬─────┬──────────┘");
        System.out.println("│  \ud83c\udf1f  │ 3.9x │   20%  │            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────┐");
        System.out.println("│  \uD83C\uDF4F  │ 2.6x │   25%  │            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Ruleset │");
        System.out.println("│  \uD83C\uDF52  │ 1.8x │   30%  │            └──────────────────────────────┘");
        System.out.println("└──────┴──────┴────────┘");
    }

    public static void combinations() {
        System.out.println("┌─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
        System.out.println("│  \u001b[36m▣ ▣ ▣\u001b[0m  │  ― ― ―  │  ― ― ―  │  \u001b[36m▣\u001b[0m ― ―  │  ― \u001b[36m▣\u001b[0m ―  │  ― ― \u001b[36m▣\u001b[0m  │  \u001b[36m▣\u001b[0m ― ―  │  ― ― \u001b[36m▣\u001b[0m  │");
        System.out.println("│  ― ― ―  │  \u001b[36m▣ ▣ ▣\u001b[0m  │  ― ― ―  │  \u001b[36m▣\u001b[0m ― ―  │  ― \u001b[36m▣\u001b[0m ―  │  ― ― \u001b[36m▣\u001b[0m  │  ― \u001b[36m▣\u001b[0m ―  │  ― \u001b[36m▣\u001b[0m ―  │");
        System.out.println("│  ― ― ―  │  ― ― ―  │  \u001b[36m▣ ▣ ▣\u001b[0m  │  \u001b[36m▣\u001b[0m ― ―  │  ― \u001b[36m▣\u001b[0m ―  │  ― ― \u001b[36m▣\u001b[0m  │  ― ― \u001b[36m▣\u001b[0m  │  \u001b[36m▣\u001b[0m ― ―  │");
        System.out.println("└─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
    }

    public static void displayMainMenu(String[][] block, String login) {
        StringBuilder space = new StringBuilder();
        for (int i = login.length(); i < 16; i++) {
            space.append(" ");
        }
        System.out.println("\033c");
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "              ┌──────────────────────────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "              │     \u001b[1mlogin:\u001b[0m   \u001b[1m\u001b[33m" + login + "\u001b[0m" + space + "│");
        System.out.println("├───────────┼───────────┼───────────┤" + "              └──────────────────────────────┘");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌──────────────────────────────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │      \u001b[1m\u001b[32mp\u001b[0m   --  play the game       │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │      \u001b[1m\u001b[32mr\u001b[0m   --  ruleset             │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │      \u001b[1m\u001b[32me\u001b[0m   --  exit                │");
        System.out.println("├───────────┼───────────┼───────────┤" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴────────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu  │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └────────────────────┘");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void displayGame(String[][] block, double credits, double bet) {
        StringBuilder space = new StringBuilder();
        for (int i = String.valueOf(credits).length() ; i < 14; i++) {
            space.append(" ");
        }
        StringBuilder space2 = new StringBuilder();
        for (int i = String.valueOf(bet).length() ; i < 14; i++) {
            space2.append(" ");
        }
        System.out.println("\033c");
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "              ┌──────────────────────────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "              │     \u001B[1mBalance:\u001b[0m   \u001b[1m\u001b[33m" + credits + "\u001b[0m" + space + "│");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "              │       \u001B[1mBet:\u001b[0m     \u001b[1m\u001b[33m" + bet + "\u001b[0m" + space2 + "│");
        System.out.println("├───────────┼───────────┼───────────┤" + "              └──────────────────────────────┘");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌──────────────────────────────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │   \u001b[1m\u001b[32m'enter'\u001b[0m -- play the game       │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │      \u001b[1m\u001b[32mm\u001b[0m    -- main menu           │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │      \u001b[1m\u001b[32md\u001b[0m    -- deposit             │");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │      \u001B[1m\u001B[32mb\u001B[0m    -- bet                 │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void displayGame2(String[][][] item_list, double credits, double bet) {
        StringBuilder space = new StringBuilder();
        for (int i = String.valueOf(credits).length() ; i < 14; i++) {
            space.append(" ");
        }
        StringBuilder space2 = new StringBuilder();
        for (int i = String.valueOf(bet).length() ; i < 14; i++) {
            space2.append(" ");
        }
        System.out.println("\033c");
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ item_list[0][0][0] + item_list[0][0][1] + item_list[0][0][2] + item_list[0][0][3] + item_list[0][0][4] + item_list[0][0][5] + item_list[0][0][6] + item_list[0][0][7] + item_list[0][0][8] + item_list[0][0][9] + item_list[0][0][10] + "│" + item_list[1][0][0] + item_list[1][0][1] + item_list[1][0][2] + item_list[1][0][3] + item_list[1][0][4] + item_list[1][0][5] + item_list[1][0][6] + item_list[1][0][7] + item_list[1][0][8] + item_list[1][0][9] + item_list[1][0][10] + "│"  + item_list[2][0][0] + item_list[2][0][1] + item_list[2][0][2] + item_list[2][0][3] + item_list[2][0][4] + item_list[2][0][5] + item_list[2][0][6] + item_list[2][0][7] + item_list[2][0][8] + item_list[2][0][9] + item_list[2][0][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ item_list[0][1][0] + item_list[0][1][1] + item_list[0][1][2] + item_list[0][1][3] + item_list[0][1][4] + item_list[0][1][5] + item_list[0][1][6] + item_list[0][1][7] + item_list[0][1][8] + item_list[0][1][9] + item_list[0][1][10] + "│" + item_list[1][1][0] + item_list[1][1][1] + item_list[1][1][2] + item_list[1][1][3] + item_list[1][1][4] + item_list[1][1][5] + item_list[1][1][6] + item_list[1][1][7] + item_list[1][1][8] + item_list[1][1][9] + item_list[1][1][10] + "│"  + item_list[2][1][0] + item_list[2][1][1] + item_list[2][1][2] + item_list[2][1][3] + item_list[2][1][4] + item_list[2][1][5] + item_list[2][1][6] + item_list[2][1][7] + item_list[2][1][8] + item_list[2][1][9] + item_list[2][1][10] + "│" + "              ┌──────────────────────────────┐");
        System.out.println("│"+ item_list[0][2][0] + item_list[0][2][1] + item_list[0][2][2] + item_list[0][2][3] + item_list[0][2][4] + item_list[0][2][5] + item_list[0][2][6] + item_list[0][2][7] + item_list[0][2][8] + item_list[0][2][9] + item_list[0][2][10] + "│" + item_list[1][2][0] + item_list[1][2][1] + item_list[1][2][2] + item_list[1][2][3] + item_list[1][2][4] + item_list[1][2][5] + item_list[1][2][6] + item_list[1][2][7] + item_list[1][2][8] + item_list[1][2][9] + item_list[1][2][10] + "│"  + item_list[2][2][0] + item_list[2][2][1] + item_list[2][2][2] + item_list[2][2][3] + item_list[2][2][4] + item_list[2][2][5] + item_list[2][2][6] + item_list[2][2][7] + item_list[2][2][8] + item_list[2][2][9] + item_list[2][2][10] + "│" + "              │     \u001B[1mBalance:\u001b[0m   \u001b[1m\u001b[33m" + credits + "\u001b[0m" + space + "│");
        System.out.println("│"+ item_list[0][3][0] + item_list[0][3][1] + item_list[0][3][2] + item_list[0][3][3] + item_list[0][3][4] + item_list[0][3][5] + item_list[0][3][6] + item_list[0][3][7] + item_list[0][3][8] + item_list[0][3][9] + item_list[0][3][10] + "│" + item_list[1][3][0] + item_list[1][3][1] + item_list[1][3][2] + item_list[1][3][3] + item_list[1][3][4] + item_list[1][3][5] + item_list[1][3][6] + item_list[1][3][7] + item_list[1][3][8] + item_list[1][3][9] + item_list[1][3][10] + "│"  + item_list[2][3][0] + item_list[2][3][1] + item_list[2][3][2] + item_list[2][3][3] + item_list[2][3][4] + item_list[2][3][5] + item_list[2][3][6] + item_list[2][3][7] + item_list[2][3][8] + item_list[2][3][9] + item_list[2][3][10] + "│" + "              │       \u001B[1mBet:\u001b[0m     \u001b[1m\u001b[33m" + bet + "\u001b[0m" + space2 + "│");
        System.out.println("├───────────┼───────────┼───────────┤" + "              └──────────────────────────────┘");
        System.out.println("│"+ item_list[3][0][0] + item_list[3][0][1] + item_list[3][0][2] + item_list[3][0][3] + item_list[3][0][4] + item_list[3][0][5] + item_list[3][0][6] + item_list[3][0][7] + item_list[3][0][8] + item_list[3][0][9] + item_list[3][0][10] + "│" + item_list[4][0][0] + item_list[4][0][1] + item_list[4][0][2] + item_list[4][0][3] + item_list[4][0][4] + item_list[4][0][5] + item_list[4][0][6] + item_list[4][0][7] + item_list[4][0][8] + item_list[4][0][9] + item_list[4][0][10] + "│"  + item_list[5][0][0] + item_list[5][0][1] + item_list[5][0][2] + item_list[5][0][3] + item_list[5][0][4] + item_list[5][0][5] + item_list[5][0][6] + item_list[5][0][7] + item_list[5][0][8] + item_list[5][0][9] + item_list[5][0][10] + "│" + "            ┌──────────────────────────────────┐");
        System.out.println("│"+ item_list[3][1][0] + item_list[3][1][1] + item_list[3][1][2] + item_list[3][1][3] + item_list[3][1][4] + item_list[3][1][5] + item_list[3][1][6] + item_list[3][1][7] + item_list[3][1][8] + item_list[3][1][9] + item_list[3][1][10] + "│" + item_list[4][1][0] + item_list[4][1][1] + item_list[4][1][2] + item_list[4][1][3] + item_list[4][1][4] + item_list[4][1][5] + item_list[4][1][6] + item_list[4][1][7] + item_list[4][1][8] + item_list[4][1][9] + item_list[4][1][10] + "│"  + item_list[5][1][0] + item_list[5][1][1] + item_list[5][1][2] + item_list[5][1][3] + item_list[5][1][4] + item_list[5][1][5] + item_list[5][1][6] + item_list[5][1][7] + item_list[5][1][8] + item_list[5][1][9] + item_list[5][1][10] + "│" + "            │   \u001b[1m\u001b[32m'enter'\u001b[0m -- play the game       │");
        System.out.println("│"+ item_list[3][2][0] + item_list[3][2][1] + item_list[3][2][2] + item_list[3][2][3] + item_list[3][2][4] + item_list[3][2][5] + item_list[3][2][6] + item_list[3][2][7] + item_list[3][2][8] + item_list[3][2][9] + item_list[3][2][10] + "│" + item_list[4][2][0] + item_list[4][2][1] + item_list[4][2][2] + item_list[4][2][3] + item_list[4][2][4] + item_list[4][2][5] + item_list[4][2][6] + item_list[4][2][7] + item_list[4][2][8] + item_list[4][2][9] + item_list[4][2][10] + "│"  + item_list[5][2][0] + item_list[5][2][1] + item_list[5][2][2] + item_list[5][2][3] + item_list[5][2][4] + item_list[5][2][5] + item_list[5][2][6] + item_list[5][2][7] + item_list[5][2][8] + item_list[5][2][9] + item_list[5][2][10] + "│" + "            │      \u001b[1m\u001b[32mm\u001b[0m    -- main menu           │");
        System.out.println("│"+ item_list[3][3][0] + item_list[3][3][1] + item_list[3][3][2] + item_list[3][3][3] + item_list[3][3][4] + item_list[3][3][5] + item_list[3][3][6] + item_list[3][3][7] + item_list[3][3][8] + item_list[3][3][9] + item_list[3][3][10] + "│" + item_list[4][3][0] + item_list[4][3][1] + item_list[4][3][2] + item_list[4][3][3] + item_list[4][3][4] + item_list[4][3][5] + item_list[4][3][6] + item_list[4][3][7] + item_list[4][3][8] + item_list[4][3][9] + item_list[4][3][10] + "│"  + item_list[5][3][0] + item_list[5][3][1] + item_list[5][3][2] + item_list[5][3][3] + item_list[5][3][4] + item_list[5][3][5] + item_list[5][3][6] + item_list[5][3][7] + item_list[5][3][8] + item_list[5][3][9] + item_list[5][3][10] + "│" + "            │      \u001b[1m\u001b[32md\u001b[0m    -- deposit             │");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │      \u001B[1m\u001B[32mb\u001B[0m    -- bet                 │");
        System.out.println("│"+ item_list[6][0][0] + item_list[6][0][1] + item_list[6][0][2] + item_list[6][0][3] + item_list[6][0][4] + item_list[6][0][5] + item_list[6][0][6] + item_list[6][0][7] + item_list[6][0][8] + item_list[6][0][9] + item_list[6][0][10] + "│" + item_list[7][0][0] + item_list[7][0][1] + item_list[7][0][2] + item_list[7][0][3] + item_list[7][0][4] + item_list[7][0][5] + item_list[7][0][6] + item_list[7][0][7] + item_list[7][0][8] + item_list[7][0][9] + item_list[7][0][10] + "│"  + item_list[8][0][0] + item_list[8][0][1] + item_list[8][0][2] + item_list[8][0][3] + item_list[8][0][4] + item_list[8][0][5] + item_list[8][0][6] + item_list[8][0][7] + item_list[8][0][8] + item_list[8][0][9] + item_list[8][0][10] + "│" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ item_list[6][1][0] + item_list[6][1][1] + item_list[6][1][2] + item_list[6][1][3] + item_list[6][1][4] + item_list[6][1][5] + item_list[6][1][6] + item_list[6][1][7] + item_list[6][1][8] + item_list[6][1][9] + item_list[6][1][10] + "│" + item_list[7][1][0] + item_list[7][1][1] + item_list[7][1][2] + item_list[7][1][3] + item_list[7][1][4] + item_list[7][1][5] + item_list[7][1][6] + item_list[7][1][7] + item_list[7][1][8] + item_list[7][1][9] + item_list[7][1][10] + "│"  + item_list[8][1][0] + item_list[8][1][1] + item_list[8][1][2] + item_list[8][1][3] + item_list[8][1][4] + item_list[8][1][5] + item_list[8][1][6] + item_list[8][1][7] + item_list[8][1][8] + item_list[8][1][9] + item_list[8][1][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("│"+ item_list[6][2][0] + item_list[6][2][1] + item_list[6][2][2] + item_list[6][2][3] + item_list[6][2][4] + item_list[6][2][5] + item_list[6][2][6] + item_list[6][2][7] + item_list[6][2][8] + item_list[6][2][9] + item_list[6][2][10] + "│" + item_list[7][2][0] + item_list[7][2][1] + item_list[7][2][2] + item_list[7][2][3] + item_list[7][2][4] + item_list[7][2][5] + item_list[7][2][6] + item_list[7][2][7] + item_list[7][2][8] + item_list[7][2][9] + item_list[7][2][10] + "│"  + item_list[8][2][0] + item_list[8][2][1] + item_list[8][2][2] + item_list[8][2][3] + item_list[8][2][4] + item_list[8][2][5] + item_list[8][2][6] + item_list[8][2][7] + item_list[8][2][8] + item_list[8][2][9] + item_list[8][2][10] + "│" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ item_list[6][3][0] + item_list[6][3][1] + item_list[6][3][2] + item_list[6][3][3] + item_list[6][3][4] + item_list[6][3][5] + item_list[6][3][6] + item_list[6][3][7] + item_list[6][3][8] + item_list[6][3][9] + item_list[6][3][10] + "│" + item_list[7][3][0] + item_list[7][3][1] + item_list[7][3][2] + item_list[7][3][3] + item_list[7][3][4] + item_list[7][3][5] + item_list[7][3][6] + item_list[7][3][7] + item_list[7][3][8] + item_list[7][3][9] + item_list[7][3][10] + "│"  + item_list[8][3][0] + item_list[8][3][1] + item_list[8][3][2] + item_list[8][3][3] + item_list[8][3][4] + item_list[8][3][5] + item_list[8][3][6] + item_list[8][3][7] + item_list[8][3][8] + item_list[8][3][9] + item_list[8][3][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void display1(String[][][] item_list, String[][] block) {
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ item_list[0][0][0] + item_list[0][0][1] + item_list[0][0][2] + item_list[0][0][3] + item_list[0][0][4] + item_list[0][0][5] + item_list[0][0][6] + item_list[0][0][7] + item_list[0][0][8] + item_list[0][0][9] + item_list[0][0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[0][1][0] + item_list[0][1][1] + item_list[0][1][2] + item_list[0][1][3] + item_list[0][1][4] + item_list[0][1][5] + item_list[0][1][6] + item_list[0][1][7] + item_list[0][1][8] + item_list[0][1][9] + item_list[0][1][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[0][2][0] + item_list[0][2][1] + item_list[0][2][2] + item_list[0][2][3] + item_list[0][2][4] + item_list[0][2][5] + item_list[0][2][6] + item_list[0][2][7] + item_list[0][2][8] + item_list[0][2][9] + item_list[0][2][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ item_list[0][3][0] + item_list[0][3][1] + item_list[0][3][2] + item_list[0][3][3] + item_list[0][3][4] + item_list[0][3][5] + item_list[0][3][6] + item_list[0][3][7] + item_list[0][3][8] + item_list[0][3][9] + item_list[0][3][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌──────────────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │                                  │");
        System.out.println("│"+ item_list[3][0][0] + item_list[3][0][1] + item_list[3][0][2] + item_list[3][0][3] + item_list[3][0][4] + item_list[3][0][5] + item_list[3][0][6] + item_list[3][0][7] + item_list[3][0][8] + item_list[3][0][9] + item_list[3][0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │   \u001b[1m\u001b[36mGame is running! Be patient.\u001b[0m   │");
        System.out.println("│"+ item_list[3][1][0] + item_list[3][1][1] + item_list[3][1][2] + item_list[3][1][3] + item_list[3][1][4] + item_list[3][1][5] + item_list[3][1][6] + item_list[3][1][7] + item_list[3][1][8] + item_list[3][1][9] + item_list[3][1][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │                                  │");
        System.out.println("│"+ item_list[3][2][0] + item_list[3][2][1] + item_list[3][2][2] + item_list[3][2][3] + item_list[3][2][4] + item_list[3][2][5] + item_list[3][2][6] + item_list[3][2][7] + item_list[3][2][8] + item_list[3][2][9] + item_list[3][2][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ item_list[3][3][0] + item_list[3][3][1] + item_list[3][3][2] + item_list[3][3][3] + item_list[3][3][4] + item_list[3][3][5] + item_list[3][3][6] + item_list[3][3][7] + item_list[3][3][8] + item_list[3][3][9] + item_list[3][3][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ item_list[6][0][0] + item_list[6][0][1] + item_list[6][0][2] + item_list[6][0][3] + item_list[6][0][4] + item_list[6][0][5] + item_list[6][0][6] + item_list[6][0][7] + item_list[6][0][8] + item_list[6][0][9] + item_list[6][0][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("│"+ item_list[6][1][0] + item_list[6][1][1] + item_list[6][1][2] + item_list[6][1][3] + item_list[6][1][4] + item_list[6][1][5] + item_list[6][1][6] + item_list[6][1][7] + item_list[6][1][8] + item_list[6][1][9] + item_list[6][1][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[6][2][0] + item_list[6][2][1] + item_list[6][2][2] + item_list[6][2][3] + item_list[6][2][4] + item_list[6][2][5] + item_list[6][2][6] + item_list[6][2][7] + item_list[6][2][8] + item_list[6][2][9] + item_list[6][2][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[6][3][0] + item_list[6][3][1] + item_list[6][3][2] + item_list[6][3][3] + item_list[6][3][4] + item_list[6][3][5] + item_list[6][3][6] + item_list[6][3][7] + item_list[6][3][8] + item_list[6][3][9] + item_list[6][3][10] + "│" + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void display2(String[][][] item_list, String[][] block) {
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ item_list[0][0][0] + item_list[0][0][1] + item_list[0][0][2] + item_list[0][0][3] + item_list[0][0][4] + item_list[0][0][5] + item_list[0][0][6] + item_list[0][0][7] + item_list[0][0][8] + item_list[0][0][9] + item_list[0][0][10] + "│" + item_list[1][0][0] + item_list[1][0][1] + item_list[1][0][2] + item_list[1][0][3] + item_list[1][0][4] + item_list[1][0][5] + item_list[1][0][6] + item_list[1][0][7] + item_list[1][0][8] + item_list[1][0][9] + item_list[1][0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[0][1][0] + item_list[0][1][1] + item_list[0][1][2] + item_list[0][1][3] + item_list[0][1][4] + item_list[0][1][5] + item_list[0][1][6] + item_list[0][1][7] + item_list[0][1][8] + item_list[0][1][9] + item_list[0][1][10] + "│" + item_list[1][1][0] + item_list[1][1][1] + item_list[1][1][2] + item_list[1][1][3] + item_list[1][1][4] + item_list[1][1][5] + item_list[1][1][6] + item_list[1][1][7] + item_list[1][1][8] + item_list[1][1][9] + item_list[1][1][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[0][2][0] + item_list[0][2][1] + item_list[0][2][2] + item_list[0][2][3] + item_list[0][2][4] + item_list[0][2][5] + item_list[0][2][6] + item_list[0][2][7] + item_list[0][2][8] + item_list[0][2][9] + item_list[0][2][10] + "│" + item_list[1][2][0] + item_list[1][2][1] + item_list[1][2][2] + item_list[1][2][3] + item_list[1][2][4] + item_list[1][2][5] + item_list[1][2][6] + item_list[1][2][7] + item_list[1][2][8] + item_list[1][2][9] + item_list[1][2][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ item_list[0][3][0] + item_list[0][3][1] + item_list[0][3][2] + item_list[0][3][3] + item_list[0][3][4] + item_list[0][3][5] + item_list[0][3][6] + item_list[0][3][7] + item_list[0][3][8] + item_list[0][3][9] + item_list[0][3][10] + "│" + item_list[1][3][0] + item_list[1][3][1] + item_list[1][3][2] + item_list[1][3][3] + item_list[1][3][4] + item_list[1][3][5] + item_list[1][3][6] + item_list[1][3][7] + item_list[1][3][8] + item_list[1][3][9] + item_list[1][3][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌──────────────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │                                  │");
        System.out.println("│"+ item_list[3][0][0] + item_list[3][0][1] + item_list[3][0][2] + item_list[3][0][3] + item_list[3][0][4] + item_list[3][0][5] + item_list[3][0][6] + item_list[3][0][7] + item_list[3][0][8] + item_list[3][0][9] + item_list[3][0][10] + "│" + item_list[4][0][0] + item_list[4][0][1] + item_list[4][0][2] + item_list[4][0][3] + item_list[4][0][4] + item_list[4][0][5] + item_list[4][0][6] + item_list[4][0][7] + item_list[4][0][8] + item_list[4][0][9] + item_list[4][0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │   \u001b[1m\u001b[36mGame is running! Be patient.\u001b[0m   │");
        System.out.println("│"+ item_list[3][1][0] + item_list[3][1][1] + item_list[3][1][2] + item_list[3][1][3] + item_list[3][1][4] + item_list[3][1][5] + item_list[3][1][6] + item_list[3][1][7] + item_list[3][1][8] + item_list[3][1][9] + item_list[3][1][10] + "│" + item_list[4][1][0] + item_list[4][1][1] + item_list[4][1][2] + item_list[4][1][3] + item_list[4][1][4] + item_list[4][1][5] + item_list[4][1][6] + item_list[4][1][7] + item_list[4][1][8] + item_list[4][1][9] + item_list[4][1][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            │                                  │");
        System.out.println("│"+ item_list[3][2][0] + item_list[3][2][1] + item_list[3][2][2] + item_list[3][2][3] + item_list[3][2][4] + item_list[3][2][5] + item_list[3][2][6] + item_list[3][2][7] + item_list[3][2][8] + item_list[3][2][9] + item_list[3][2][10] + "│" + item_list[4][2][0] + item_list[4][2][1] + item_list[4][2][2] + item_list[4][2][3] + item_list[4][2][4] + item_list[4][2][5] + item_list[4][2][6] + item_list[4][2][7] + item_list[4][2][8] + item_list[4][2][9] + item_list[4][2][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ item_list[3][3][0] + item_list[3][3][1] + item_list[3][3][2] + item_list[3][3][3] + item_list[3][3][4] + item_list[3][3][5] + item_list[3][3][6] + item_list[3][3][7] + item_list[3][3][8] + item_list[3][3][9] + item_list[3][3][10] + "│" + item_list[4][3][0] + item_list[4][3][1] + item_list[4][3][2] + item_list[4][3][3] + item_list[4][3][4] + item_list[4][3][5] + item_list[4][3][6] + item_list[4][3][7] + item_list[4][3][8] + item_list[4][3][9] + item_list[4][3][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ item_list[6][0][0] + item_list[6][0][1] + item_list[6][0][2] + item_list[6][0][3] + item_list[6][0][4] + item_list[6][0][5] + item_list[6][0][6] + item_list[6][0][7] + item_list[6][0][8] + item_list[6][0][9] + item_list[6][0][10] + "│" + item_list[7][0][0] + item_list[7][0][1] + item_list[7][0][2] + item_list[7][0][3] + item_list[7][0][4] + item_list[7][0][5] + item_list[7][0][6] + item_list[7][0][7] + item_list[7][0][8] + item_list[7][0][9] + item_list[7][0][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("│"+ item_list[6][1][0] + item_list[6][1][1] + item_list[6][1][2] + item_list[6][1][3] + item_list[6][1][4] + item_list[6][1][5] + item_list[6][1][6] + item_list[6][1][7] + item_list[6][1][8] + item_list[6][1][9] + item_list[6][1][10] + "│" + item_list[7][1][0] + item_list[7][1][1] + item_list[7][1][2] + item_list[7][1][3] + item_list[7][1][4] + item_list[7][1][5] + item_list[7][1][6] + item_list[7][1][7] + item_list[7][1][8] + item_list[7][1][9] + item_list[7][1][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[6][2][0] + item_list[6][2][1] + item_list[6][2][2] + item_list[6][2][3] + item_list[6][2][4] + item_list[6][2][5] + item_list[6][2][6] + item_list[6][2][7] + item_list[6][2][8] + item_list[6][2][9] + item_list[6][2][10] + "│" + item_list[7][2][0] + item_list[7][2][1] + item_list[7][2][2] + item_list[7][2][3] + item_list[7][2][4] + item_list[7][2][5] + item_list[7][2][6] + item_list[7][2][7] + item_list[7][2][8] + item_list[7][2][9] + item_list[7][2][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("│"+ item_list[6][3][0] + item_list[6][3][1] + item_list[6][3][2] + item_list[6][3][3] + item_list[6][3][4] + item_list[6][3][5] + item_list[6][3][6] + item_list[6][3][7] + item_list[6][3][8] + item_list[6][3][9] + item_list[6][3][10] + "│" + item_list[7][3][0] + item_list[7][3][1] + item_list[7][3][2] + item_list[7][3][3] + item_list[7][3][4] + item_list[7][3][5] + item_list[7][3][6] + item_list[7][3][7] + item_list[7][3][8] + item_list[7][3][9] + item_list[7][3][10] + "│"  + block[0][0] + block[0][1] + block[0][2] + block[0][3] + block[0][4] + block[0][5] + block[0][6] + block[0][7] + block[0][8] + block[0][9] + block[0][10] + "│");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void display3(String[][][] item_list) {
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ item_list[0][0][0] + item_list[0][0][1] + item_list[0][0][2] + item_list[0][0][3] + item_list[0][0][4] + item_list[0][0][5] + item_list[0][0][6] + item_list[0][0][7] + item_list[0][0][8] + item_list[0][0][9] + item_list[0][0][10] + "│" + item_list[1][0][0] + item_list[1][0][1] + item_list[1][0][2] + item_list[1][0][3] + item_list[1][0][4] + item_list[1][0][5] + item_list[1][0][6] + item_list[1][0][7] + item_list[1][0][8] + item_list[1][0][9] + item_list[1][0][10] + "│"  + item_list[2][0][0] + item_list[2][0][1] + item_list[2][0][2] + item_list[2][0][3] + item_list[2][0][4] + item_list[2][0][5] + item_list[2][0][6] + item_list[2][0][7] + item_list[2][0][8] + item_list[2][0][9] + item_list[2][0][10] + "│");
        System.out.println("│"+ item_list[0][1][0] + item_list[0][1][1] + item_list[0][1][2] + item_list[0][1][3] + item_list[0][1][4] + item_list[0][1][5] + item_list[0][1][6] + item_list[0][1][7] + item_list[0][1][8] + item_list[0][1][9] + item_list[0][1][10] + "│" + item_list[1][1][0] + item_list[1][1][1] + item_list[1][1][2] + item_list[1][1][3] + item_list[1][1][4] + item_list[1][1][5] + item_list[1][1][6] + item_list[1][1][7] + item_list[1][1][8] + item_list[1][1][9] + item_list[1][1][10] + "│"  + item_list[2][1][0] + item_list[2][1][1] + item_list[2][1][2] + item_list[2][1][3] + item_list[2][1][4] + item_list[2][1][5] + item_list[2][1][6] + item_list[2][1][7] + item_list[2][1][8] + item_list[2][1][9] + item_list[2][1][10] + "│");
        System.out.println("│"+ item_list[0][2][0] + item_list[0][2][1] + item_list[0][2][2] + item_list[0][2][3] + item_list[0][2][4] + item_list[0][2][5] + item_list[0][2][6] + item_list[0][2][7] + item_list[0][2][8] + item_list[0][2][9] + item_list[0][2][10] + "│" + item_list[1][2][0] + item_list[1][2][1] + item_list[1][2][2] + item_list[1][2][3] + item_list[1][2][4] + item_list[1][2][5] + item_list[1][2][6] + item_list[1][2][7] + item_list[1][2][8] + item_list[1][2][9] + item_list[1][2][10] + "│"  + item_list[2][2][0] + item_list[2][2][1] + item_list[2][2][2] + item_list[2][2][3] + item_list[2][2][4] + item_list[2][2][5] + item_list[2][2][6] + item_list[2][2][7] + item_list[2][2][8] + item_list[2][2][9] + item_list[2][2][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ item_list[0][3][0] + item_list[0][3][1] + item_list[0][3][2] + item_list[0][3][3] + item_list[0][3][4] + item_list[0][3][5] + item_list[0][3][6] + item_list[0][3][7] + item_list[0][3][8] + item_list[0][3][9] + item_list[0][3][10] + "│" + item_list[1][3][0] + item_list[1][3][1] + item_list[1][3][2] + item_list[1][3][3] + item_list[1][3][4] + item_list[1][3][5] + item_list[1][3][6] + item_list[1][3][7] + item_list[1][3][8] + item_list[1][3][9] + item_list[1][3][10] + "│"  + item_list[2][3][0] + item_list[2][3][1] + item_list[2][3][2] + item_list[2][3][3] + item_list[2][3][4] + item_list[2][3][5] + item_list[2][3][6] + item_list[2][3][7] + item_list[2][3][8] + item_list[2][3][9] + item_list[2][3][10] + "│" + "            ┌──────────────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │                                  │");
        System.out.println("│"+ item_list[3][0][0] + item_list[3][0][1] + item_list[3][0][2] + item_list[3][0][3] + item_list[3][0][4] + item_list[3][0][5] + item_list[3][0][6] + item_list[3][0][7] + item_list[3][0][8] + item_list[3][0][9] + item_list[3][0][10] + "│" + item_list[4][0][0] + item_list[4][0][1] + item_list[4][0][2] + item_list[4][0][3] + item_list[4][0][4] + item_list[4][0][5] + item_list[4][0][6] + item_list[4][0][7] + item_list[4][0][8] + item_list[4][0][9] + item_list[4][0][10] + "│"  + item_list[5][0][0] + item_list[5][0][1] + item_list[5][0][2] + item_list[5][0][3] + item_list[5][0][4] + item_list[5][0][5] + item_list[5][0][6] + item_list[5][0][7] + item_list[5][0][8] + item_list[5][0][9] + item_list[5][0][10] + "│" + "            │   \u001b[1m\u001b[36mGame is running! Be patient.\u001b[0m   │");
        System.out.println("│"+ item_list[3][1][0] + item_list[3][1][1] + item_list[3][1][2] + item_list[3][1][3] + item_list[3][1][4] + item_list[3][1][5] + item_list[3][1][6] + item_list[3][1][7] + item_list[3][1][8] + item_list[3][1][9] + item_list[3][1][10] + "│" + item_list[4][1][0] + item_list[4][1][1] + item_list[4][1][2] + item_list[4][1][3] + item_list[4][1][4] + item_list[4][1][5] + item_list[4][1][6] + item_list[4][1][7] + item_list[4][1][8] + item_list[4][1][9] + item_list[4][1][10] + "│"  + item_list[5][1][0] + item_list[5][1][1] + item_list[5][1][2] + item_list[5][1][3] + item_list[5][1][4] + item_list[5][1][5] + item_list[5][1][6] + item_list[5][1][7] + item_list[5][1][8] + item_list[5][1][9] + item_list[5][1][10] + "│" + "            │                                  │");
        System.out.println("│"+ item_list[3][2][0] + item_list[3][2][1] + item_list[3][2][2] + item_list[3][2][3] + item_list[3][2][4] + item_list[3][2][5] + item_list[3][2][6] + item_list[3][2][7] + item_list[3][2][8] + item_list[3][2][9] + item_list[3][2][10] + "│" + item_list[4][2][0] + item_list[4][2][1] + item_list[4][2][2] + item_list[4][2][3] + item_list[4][2][4] + item_list[4][2][5] + item_list[4][2][6] + item_list[4][2][7] + item_list[4][2][8] + item_list[4][2][9] + item_list[4][2][10] + "│"  + item_list[5][2][0] + item_list[5][2][1] + item_list[5][2][2] + item_list[5][2][3] + item_list[5][2][4] + item_list[5][2][5] + item_list[5][2][6] + item_list[5][2][7] + item_list[5][2][8] + item_list[5][2][9] + item_list[5][2][10] + "│" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ item_list[3][3][0] + item_list[3][3][1] + item_list[3][3][2] + item_list[3][3][3] + item_list[3][3][4] + item_list[3][3][5] + item_list[3][3][6] + item_list[3][3][7] + item_list[3][3][8] + item_list[3][3][9] + item_list[3][3][10] + "│" + item_list[4][3][0] + item_list[4][3][1] + item_list[4][3][2] + item_list[4][3][3] + item_list[4][3][4] + item_list[4][3][5] + item_list[4][3][6] + item_list[4][3][7] + item_list[4][3][8] + item_list[4][3][9] + item_list[4][3][10] + "│"  + item_list[5][3][0] + item_list[5][3][1] + item_list[5][3][2] + item_list[5][3][3] + item_list[5][3][4] + item_list[5][3][5] + item_list[5][3][6] + item_list[5][3][7] + item_list[5][3][8] + item_list[5][3][9] + item_list[5][3][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ item_list[6][0][0] + item_list[6][0][1] + item_list[6][0][2] + item_list[6][0][3] + item_list[6][0][4] + item_list[6][0][5] + item_list[6][0][6] + item_list[6][0][7] + item_list[6][0][8] + item_list[6][0][9] + item_list[6][0][10] + "│" + item_list[7][0][0] + item_list[7][0][1] + item_list[7][0][2] + item_list[7][0][3] + item_list[7][0][4] + item_list[7][0][5] + item_list[7][0][6] + item_list[7][0][7] + item_list[7][0][8] + item_list[7][0][9] + item_list[7][0][10] + "│"  + item_list[8][0][0] + item_list[8][0][1] + item_list[8][0][2] + item_list[8][0][3] + item_list[8][0][4] + item_list[8][0][5] + item_list[8][0][6] + item_list[8][0][7] + item_list[8][0][8] + item_list[8][0][9] + item_list[8][0][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("│"+ item_list[6][1][0] + item_list[6][1][1] + item_list[6][1][2] + item_list[6][1][3] + item_list[6][1][4] + item_list[6][1][5] + item_list[6][1][6] + item_list[6][1][7] + item_list[6][1][8] + item_list[6][1][9] + item_list[6][1][10] + "│" + item_list[7][1][0] + item_list[7][1][1] + item_list[7][1][2] + item_list[7][1][3] + item_list[7][1][4] + item_list[7][1][5] + item_list[7][1][6] + item_list[7][1][7] + item_list[7][1][8] + item_list[7][1][9] + item_list[7][1][10] + "│"  + item_list[8][1][0] + item_list[8][1][1] + item_list[8][1][2] + item_list[8][1][3] + item_list[8][1][4] + item_list[8][1][5] + item_list[8][1][6] + item_list[8][1][7] + item_list[8][1][8] + item_list[8][1][9] + item_list[8][1][10] + "│");
        System.out.println("│"+ item_list[6][2][0] + item_list[6][2][1] + item_list[6][2][2] + item_list[6][2][3] + item_list[6][2][4] + item_list[6][2][5] + item_list[6][2][6] + item_list[6][2][7] + item_list[6][2][8] + item_list[6][2][9] + item_list[6][2][10] + "│" + item_list[7][2][0] + item_list[7][2][1] + item_list[7][2][2] + item_list[7][2][3] + item_list[7][2][4] + item_list[7][2][5] + item_list[7][2][6] + item_list[7][2][7] + item_list[7][2][8] + item_list[7][2][9] + item_list[7][2][10] + "│"  + item_list[8][2][0] + item_list[8][2][1] + item_list[8][2][2] + item_list[8][2][3] + item_list[8][2][4] + item_list[8][2][5] + item_list[8][2][6] + item_list[8][2][7] + item_list[8][2][8] + item_list[8][2][9] + item_list[8][2][10] + "│");
        System.out.println("│"+ item_list[6][3][0] + item_list[6][3][1] + item_list[6][3][2] + item_list[6][3][3] + item_list[6][3][4] + item_list[6][3][5] + item_list[6][3][6] + item_list[6][3][7] + item_list[6][3][8] + item_list[6][3][9] + item_list[6][3][10] + "│" + item_list[7][3][0] + item_list[7][3][1] + item_list[7][3][2] + item_list[7][3][3] + item_list[7][3][4] + item_list[7][3][5] + item_list[7][3][6] + item_list[7][3][7] + item_list[7][3][8] + item_list[7][3][9] + item_list[7][3][10] + "│"  + item_list[8][3][0] + item_list[8][3][1] + item_list[8][3][2] + item_list[8][3][3] + item_list[8][3][4] + item_list[8][3][5] + item_list[8][3][6] + item_list[8][3][7] + item_list[8][3][8] + item_list[8][3][9] + item_list[8][3][10] + "│");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void displayWin(String[][][] item_list, String[][] bell, String[][] seven, String[][] star, String[][] apple, String[][] cherry) {
        System.out.println("\033c");
        StringBuilder space = new StringBuilder();
        for (int i = String.valueOf(combos(item_list, bell, seven, star, apple, cherry)).length() ; i < 9; i++) {
            space.append(" ");
        }
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ item_list[0][0][0] + item_list[0][0][1] + item_list[0][0][2] + item_list[0][0][3] + item_list[0][0][4] + item_list[0][0][5] + item_list[0][0][6] + item_list[0][0][7] + item_list[0][0][8] + item_list[0][0][9] + item_list[0][0][10] + "│" + item_list[1][0][0] + item_list[1][0][1] + item_list[1][0][2] + item_list[1][0][3] + item_list[1][0][4] + item_list[1][0][5] + item_list[1][0][6] + item_list[1][0][7] + item_list[1][0][8] + item_list[1][0][9] + item_list[1][0][10] + "│"  + item_list[2][0][0] + item_list[2][0][1] + item_list[2][0][2] + item_list[2][0][3] + item_list[2][0][4] + item_list[2][0][5] + item_list[2][0][6] + item_list[2][0][7] + item_list[2][0][8] + item_list[2][0][9] + item_list[2][0][10] + "│");
        System.out.println("│"+ item_list[0][1][0] + item_list[0][1][1] + item_list[0][1][2] + item_list[0][1][3] + item_list[0][1][4] + item_list[0][1][5] + item_list[0][1][6] + item_list[0][1][7] + item_list[0][1][8] + item_list[0][1][9] + item_list[0][1][10] + "│" + item_list[1][1][0] + item_list[1][1][1] + item_list[1][1][2] + item_list[1][1][3] + item_list[1][1][4] + item_list[1][1][5] + item_list[1][1][6] + item_list[1][1][7] + item_list[1][1][8] + item_list[1][1][9] + item_list[1][1][10] + "│"  + item_list[2][1][0] + item_list[2][1][1] + item_list[2][1][2] + item_list[2][1][3] + item_list[2][1][4] + item_list[2][1][5] + item_list[2][1][6] + item_list[2][1][7] + item_list[2][1][8] + item_list[2][1][9] + item_list[2][1][10] + "│");
        System.out.println("│"+ item_list[0][2][0] + item_list[0][2][1] + item_list[0][2][2] + item_list[0][2][3] + item_list[0][2][4] + item_list[0][2][5] + item_list[0][2][6] + item_list[0][2][7] + item_list[0][2][8] + item_list[0][2][9] + item_list[0][2][10] + "│" + item_list[1][2][0] + item_list[1][2][1] + item_list[1][2][2] + item_list[1][2][3] + item_list[1][2][4] + item_list[1][2][5] + item_list[1][2][6] + item_list[1][2][7] + item_list[1][2][8] + item_list[1][2][9] + item_list[1][2][10] + "│"  + item_list[2][2][0] + item_list[2][2][1] + item_list[2][2][2] + item_list[2][2][3] + item_list[2][2][4] + item_list[2][2][5] + item_list[2][2][6] + item_list[2][2][7] + item_list[2][2][8] + item_list[2][2][9] + item_list[2][2][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ item_list[0][3][0] + item_list[0][3][1] + item_list[0][3][2] + item_list[0][3][3] + item_list[0][3][4] + item_list[0][3][5] + item_list[0][3][6] + item_list[0][3][7] + item_list[0][3][8] + item_list[0][3][9] + item_list[0][3][10] + "│" + item_list[1][3][0] + item_list[1][3][1] + item_list[1][3][2] + item_list[1][3][3] + item_list[1][3][4] + item_list[1][3][5] + item_list[1][3][6] + item_list[1][3][7] + item_list[1][3][8] + item_list[1][3][9] + item_list[1][3][10] + "│"  + item_list[2][3][0] + item_list[2][3][1] + item_list[2][3][2] + item_list[2][3][3] + item_list[2][3][4] + item_list[2][3][5] + item_list[2][3][6] + item_list[2][3][7] + item_list[2][3][8] + item_list[2][3][9] + item_list[2][3][10] + "│" + "            ┌─────────────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │                                 │");
        System.out.println("│"+ item_list[3][0][0] + item_list[3][0][1] + item_list[3][0][2] + item_list[3][0][3] + item_list[3][0][4] + item_list[3][0][5] + item_list[3][0][6] + item_list[3][0][7] + item_list[3][0][8] + item_list[3][0][9] + item_list[3][0][10] + "│" + item_list[4][0][0] + item_list[4][0][1] + item_list[4][0][2] + item_list[4][0][3] + item_list[4][0][4] + item_list[4][0][5] + item_list[4][0][6] + item_list[4][0][7] + item_list[4][0][8] + item_list[4][0][9] + item_list[4][0][10] + "│"  + item_list[5][0][0] + item_list[5][0][1] + item_list[5][0][2] + item_list[5][0][3] + item_list[5][0][4] + item_list[5][0][5] + item_list[5][0][6] + item_list[5][0][7] + item_list[5][0][8] + item_list[5][0][9] + item_list[5][0][10] + "│" + "            │      \u001b[1m\u001b[32mCongarts! Keep it up\u001b[0m       │");
        System.out.println("│"+ item_list[3][1][0] + item_list[3][1][1] + item_list[3][1][2] + item_list[3][1][3] + item_list[3][1][4] + item_list[3][1][5] + item_list[3][1][6] + item_list[3][1][7] + item_list[3][1][8] + item_list[3][1][9] + item_list[3][1][10] + "│" + item_list[4][1][0] + item_list[4][1][1] + item_list[4][1][2] + item_list[4][1][3] + item_list[4][1][4] + item_list[4][1][5] + item_list[4][1][6] + item_list[4][1][7] + item_list[4][1][8] + item_list[4][1][9] + item_list[4][1][10] + "│"  + item_list[5][1][0] + item_list[5][1][1] + item_list[5][1][2] + item_list[5][1][3] + item_list[5][1][4] + item_list[5][1][5] + item_list[5][1][6] + item_list[5][1][7] + item_list[5][1][8] + item_list[5][1][9] + item_list[5][1][10] + "│" + "            │     your multiplier is \u001b[1m\u001b[33m"  + combos(item_list, bell, seven, star, apple, cherry) + space + "\u001b[0m│");
        System.out.println("│"+ item_list[3][2][0] + item_list[3][2][1] + item_list[3][2][2] + item_list[3][2][3] + item_list[3][2][4] + item_list[3][2][5] + item_list[3][2][6] + item_list[3][2][7] + item_list[3][2][8] + item_list[3][2][9] + item_list[3][2][10] + "│" + item_list[4][2][0] + item_list[4][2][1] + item_list[4][2][2] + item_list[4][2][3] + item_list[4][2][4] + item_list[4][2][5] + item_list[4][2][6] + item_list[4][2][7] + item_list[4][2][8] + item_list[4][2][9] + item_list[4][2][10] + "│"  + item_list[5][2][0] + item_list[5][2][1] + item_list[5][2][2] + item_list[5][2][3] + item_list[5][2][4] + item_list[5][2][5] + item_list[5][2][6] + item_list[5][2][7] + item_list[5][2][8] + item_list[5][2][9] + item_list[5][2][10] + "│" + "            │                                 │");
        System.out.println("│"+ item_list[3][3][0] + item_list[3][3][1] + item_list[3][3][2] + item_list[3][3][3] + item_list[3][3][4] + item_list[3][3][5] + item_list[3][3][6] + item_list[3][3][7] + item_list[3][3][8] + item_list[3][3][9] + item_list[3][3][10] + "│" + item_list[4][3][0] + item_list[4][3][1] + item_list[4][3][2] + item_list[4][3][3] + item_list[4][3][4] + item_list[4][3][5] + item_list[4][3][6] + item_list[4][3][7] + item_list[4][3][8] + item_list[4][3][9] + item_list[4][3][10] + "│"  + item_list[5][3][0] + item_list[5][3][1] + item_list[5][3][2] + item_list[5][3][3] + item_list[5][3][4] + item_list[5][3][5] + item_list[5][3][6] + item_list[5][3][7] + item_list[5][3][8] + item_list[5][3][9] + item_list[5][3][10] + "│" + "            └─┬─────┬─────────────────────────┘");
        System.out.println("├───────────┼───────────┼───────────┤" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("│"+ item_list[6][0][0] + item_list[6][0][1] + item_list[6][0][2] + item_list[6][0][3] + item_list[6][0][4] + item_list[6][0][5] + item_list[6][0][6] + item_list[6][0][7] + item_list[6][0][8] + item_list[6][0][9] + item_list[6][0][10] + "│" + item_list[7][0][0] + item_list[7][0][1] + item_list[7][0][2] + item_list[7][0][3] + item_list[7][0][4] + item_list[7][0][5] + item_list[7][0][6] + item_list[7][0][7] + item_list[7][0][8] + item_list[7][0][9] + item_list[7][0][10] + "│"  + item_list[8][0][0] + item_list[8][0][1] + item_list[8][0][2] + item_list[8][0][3] + item_list[8][0][4] + item_list[8][0][5] + item_list[8][0][6] + item_list[8][0][7] + item_list[8][0][8] + item_list[8][0][9] + item_list[8][0][10] + "│" + "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ item_list[6][1][0] + item_list[6][1][1] + item_list[6][1][2] + item_list[6][1][3] + item_list[6][1][4] + item_list[6][1][5] + item_list[6][1][6] + item_list[6][1][7] + item_list[6][1][8] + item_list[6][1][9] + item_list[6][1][10] + "│" + item_list[7][1][0] + item_list[7][1][1] + item_list[7][1][2] + item_list[7][1][3] + item_list[7][1][4] + item_list[7][1][5] + item_list[7][1][6] + item_list[7][1][7] + item_list[7][1][8] + item_list[7][1][9] + item_list[7][1][10] + "│"  + item_list[8][1][0] + item_list[8][1][1] + item_list[8][1][2] + item_list[8][1][3] + item_list[8][1][4] + item_list[8][1][5] + item_list[8][1][6] + item_list[8][1][7] + item_list[8][1][8] + item_list[8][1][9] + item_list[8][1][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("│"+ item_list[6][2][0] + item_list[6][2][1] + item_list[6][2][2] + item_list[6][2][3] + item_list[6][2][4] + item_list[6][2][5] + item_list[6][2][6] + item_list[6][2][7] + item_list[6][2][8] + item_list[6][2][9] + item_list[6][2][10] + "│" + item_list[7][2][0] + item_list[7][2][1] + item_list[7][2][2] + item_list[7][2][3] + item_list[7][2][4] + item_list[7][2][5] + item_list[7][2][6] + item_list[7][2][7] + item_list[7][2][8] + item_list[7][2][9] + item_list[7][2][10] + "│"  + item_list[8][2][0] + item_list[8][2][1] + item_list[8][2][2] + item_list[8][2][3] + item_list[8][2][4] + item_list[8][2][5] + item_list[8][2][6] + item_list[8][2][7] + item_list[8][2][8] + item_list[8][2][9] + item_list[8][2][10] + "│");
        System.out.println("│"+ item_list[6][3][0] + item_list[6][3][1] + item_list[6][3][2] + item_list[6][3][3] + item_list[6][3][4] + item_list[6][3][5] + item_list[6][3][6] + item_list[6][3][7] + item_list[6][3][8] + item_list[6][3][9] + item_list[6][3][10] + "│" + item_list[7][3][0] + item_list[7][3][1] + item_list[7][3][2] + item_list[7][3][3] + item_list[7][3][4] + item_list[7][3][5] + item_list[7][3][6] + item_list[7][3][7] + item_list[7][3][8] + item_list[7][3][9] + item_list[7][3][10] + "│"  + item_list[8][3][0] + item_list[8][3][1] + item_list[8][3][2] + item_list[8][3][3] + item_list[8][3][4] + item_list[8][3][5] + item_list[8][3][6] + item_list[8][3][7] + item_list[8][3][8] + item_list[8][3][9] + item_list[8][3][10] + "│");
        System.out.println("└───────────┴───────────┴───────────┘");
    }

    public static void displayLose(String[][][] item_list) {
        System.out.println("\033c");
        System.out.println("┌───────────┬───────────┬───────────┐");
        System.out.println("│"+ item_list[0][0][0] + item_list[0][0][1] + item_list[0][0][2] + item_list[0][0][3] + item_list[0][0][4] + item_list[0][0][5] + item_list[0][0][6] + item_list[0][0][7] + item_list[0][0][8] + item_list[0][0][9] + item_list[0][0][10] + "│" + item_list[1][0][0] + item_list[1][0][1] + item_list[1][0][2] + item_list[1][0][3] + item_list[1][0][4] + item_list[1][0][5] + item_list[1][0][6] + item_list[1][0][7] + item_list[1][0][8] + item_list[1][0][9] + item_list[1][0][10] + "│"  + item_list[2][0][0] + item_list[2][0][1] + item_list[2][0][2] + item_list[2][0][3] + item_list[2][0][4] + item_list[2][0][5] + item_list[2][0][6] + item_list[2][0][7] + item_list[2][0][8] + item_list[2][0][9] + item_list[2][0][10] + "│");
        System.out.println("│"+ item_list[0][1][0] + item_list[0][1][1] + item_list[0][1][2] + item_list[0][1][3] + item_list[0][1][4] + item_list[0][1][5] + item_list[0][1][6] + item_list[0][1][7] + item_list[0][1][8] + item_list[0][1][9] + item_list[0][1][10] + "│" + item_list[1][1][0] + item_list[1][1][1] + item_list[1][1][2] + item_list[1][1][3] + item_list[1][1][4] + item_list[1][1][5] + item_list[1][1][6] + item_list[1][1][7] + item_list[1][1][8] + item_list[1][1][9] + item_list[1][1][10] + "│"  + item_list[2][1][0] + item_list[2][1][1] + item_list[2][1][2] + item_list[2][1][3] + item_list[2][1][4] + item_list[2][1][5] + item_list[2][1][6] + item_list[2][1][7] + item_list[2][1][8] + item_list[2][1][9] + item_list[2][1][10] + "│");
        System.out.println("│"+ item_list[0][2][0] + item_list[0][2][1] + item_list[0][2][2] + item_list[0][2][3] + item_list[0][2][4] + item_list[0][2][5] + item_list[0][2][6] + item_list[0][2][7] + item_list[0][2][8] + item_list[0][2][9] + item_list[0][2][10] + "│" + item_list[1][2][0] + item_list[1][2][1] + item_list[1][2][2] + item_list[1][2][3] + item_list[1][2][4] + item_list[1][2][5] + item_list[1][2][6] + item_list[1][2][7] + item_list[1][2][8] + item_list[1][2][9] + item_list[1][2][10] + "│"  + item_list[2][2][0] + item_list[2][2][1] + item_list[2][2][2] + item_list[2][2][3] + item_list[2][2][4] + item_list[2][2][5] + item_list[2][2][6] + item_list[2][2][7] + item_list[2][2][8] + item_list[2][2][9] + item_list[2][2][10] + "│" + "                       \u001b[1m-=/  \u001b[36mMENU\u001b[0m  \u001b[1m\\=-\u001b[0m");
        System.out.println("│"+ item_list[0][3][0] + item_list[0][3][1] + item_list[0][3][2] + item_list[0][3][3] + item_list[0][3][4] + item_list[0][3][5] + item_list[0][3][6] + item_list[0][3][7] + item_list[0][3][8] + item_list[0][3][9] + item_list[0][3][10] + "│" + item_list[1][3][0] + item_list[1][3][1] + item_list[1][3][2] + item_list[1][3][3] + item_list[1][3][4] + item_list[1][3][5] + item_list[1][3][6] + item_list[1][3][7] + item_list[1][3][8] + item_list[1][3][9] + item_list[1][3][10] + "│"  + item_list[2][3][0] + item_list[2][3][1] + item_list[2][3][2] + item_list[2][3][3] + item_list[2][3][4] + item_list[2][3][5] + item_list[2][3][6] + item_list[2][3][7] + item_list[2][3][8] + item_list[2][3][9] + item_list[2][3][10] + "│" + "            ┌──────────────────────────────────┐ ");
        System.out.println("├───────────┼───────────┼───────────┤" + "            │                                  │");
        System.out.println("│"+ item_list[3][0][0] + item_list[3][0][1] + item_list[3][0][2] + item_list[3][0][3] + item_list[3][0][4] + item_list[3][0][5] + item_list[3][0][6] + item_list[3][0][7] + item_list[3][0][8] + item_list[3][0][9] + item_list[3][0][10] + "│" + item_list[4][0][0] + item_list[4][0][1] + item_list[4][0][2] + item_list[4][0][3] + item_list[4][0][4] + item_list[4][0][5] + item_list[4][0][6] + item_list[4][0][7] + item_list[4][0][8] + item_list[4][0][9] + item_list[4][0][10] + "│"  + item_list[5][0][0] + item_list[5][0][1] + item_list[5][0][2] + item_list[5][0][3] + item_list[5][0][4] + item_list[5][0][5] + item_list[5][0][6] + item_list[5][0][7] + item_list[5][0][8] + item_list[5][0][9] + item_list[5][0][10] + "│" + "            │     \u001b[1m\u001b[31mUnfortunately. Try again.\u001b[0m    │");
        System.out.println("│"+ item_list[3][1][0] + item_list[3][1][1] + item_list[3][1][2] + item_list[3][1][3] + item_list[3][1][4] + item_list[3][1][5] + item_list[3][1][6] + item_list[3][1][7] + item_list[3][1][8] + item_list[3][1][9] + item_list[3][1][10] + "│" + item_list[4][1][0] + item_list[4][1][1] + item_list[4][1][2] + item_list[4][1][3] + item_list[4][1][4] + item_list[4][1][5] + item_list[4][1][6] + item_list[4][1][7] + item_list[4][1][8] + item_list[4][1][9] + item_list[4][1][10] + "│"  + item_list[5][1][0] + item_list[5][1][1] + item_list[5][1][2] + item_list[5][1][3] + item_list[5][1][4] + item_list[5][1][5] + item_list[5][1][6] + item_list[5][1][7] + item_list[5][1][8] + item_list[5][1][9] + item_list[5][1][10] + "│" + "            │                                  │");
        System.out.println("│"+ item_list[3][2][0] + item_list[3][2][1] + item_list[3][2][2] + item_list[3][2][3] + item_list[3][2][4] + item_list[3][2][5] + item_list[3][2][6] + item_list[3][2][7] + item_list[3][2][8] + item_list[3][2][9] + item_list[3][2][10] + "│" + item_list[4][2][0] + item_list[4][2][1] + item_list[4][2][2] + item_list[4][2][3] + item_list[4][2][4] + item_list[4][2][5] + item_list[4][2][6] + item_list[4][2][7] + item_list[4][2][8] + item_list[4][2][9] + item_list[4][2][10] + "│"  + item_list[5][2][0] + item_list[5][2][1] + item_list[5][2][2] + item_list[5][2][3] + item_list[5][2][4] + item_list[5][2][5] + item_list[5][2][6] + item_list[5][2][7] + item_list[5][2][8] + item_list[5][2][9] + item_list[5][2][10] + "│" + "            └─┬─────┬──────────────────────────┘");
        System.out.println("│"+ item_list[3][3][0] + item_list[3][3][1] + item_list[3][3][2] + item_list[3][3][3] + item_list[3][3][4] + item_list[3][3][5] + item_list[3][3][6] + item_list[3][3][7] + item_list[3][3][8] + item_list[3][3][9] + item_list[3][3][10] + "│" + item_list[4][3][0] + item_list[4][3][1] + item_list[4][3][2] + item_list[4][3][3] + item_list[4][3][4] + item_list[4][3][5] + item_list[4][3][6] + item_list[4][3][7] + item_list[4][3][8] + item_list[4][3][9] + item_list[4][3][10] + "│"  + item_list[5][3][0] + item_list[5][3][1] + item_list[5][3][2] + item_list[5][3][3] + item_list[5][3][4] + item_list[5][3][5] + item_list[5][3][6] + item_list[5][3][7] + item_list[5][3][8] + item_list[5][3][9] + item_list[5][3][10] + "│" + "            ┌─┴ \u001b[1m\u001b[33mmap\u001b[0m ┴──────────────────────────┐");
        System.out.println("├───────────┼───────────┼───────────┤" +  "            │  \u001b[1m\u001b[33m[ ➢ ]\u001b[0m  Main Menu -> Slots Game  │");
        System.out.println("│"+ item_list[6][0][0] + item_list[6][0][1] + item_list[6][0][2] + item_list[6][0][3] + item_list[6][0][4] + item_list[6][0][5] + item_list[6][0][6] + item_list[6][0][7] + item_list[6][0][8] + item_list[6][0][9] + item_list[6][0][10] + "│" + item_list[7][0][0] + item_list[7][0][1] + item_list[7][0][2] + item_list[7][0][3] + item_list[7][0][4] + item_list[7][0][5] + item_list[7][0][6] + item_list[7][0][7] + item_list[7][0][8] + item_list[7][0][9] + item_list[7][0][10] + "│"  + item_list[8][0][0] + item_list[8][0][1] + item_list[8][0][2] + item_list[8][0][3] + item_list[8][0][4] + item_list[8][0][5] + item_list[8][0][6] + item_list[8][0][7] + item_list[8][0][8] + item_list[8][0][9] + item_list[8][0][10] + "│" + "            └──────────────────────────────────┘");
        System.out.println("│"+ item_list[6][1][0] + item_list[6][1][1] + item_list[6][1][2] + item_list[6][1][3] + item_list[6][1][4] + item_list[6][1][5] + item_list[6][1][6] + item_list[6][1][7] + item_list[6][1][8] + item_list[6][1][9] + item_list[6][1][10] + "│" + item_list[7][1][0] + item_list[7][1][1] + item_list[7][1][2] + item_list[7][1][3] + item_list[7][1][4] + item_list[7][1][5] + item_list[7][1][6] + item_list[7][1][7] + item_list[7][1][8] + item_list[7][1][9] + item_list[7][1][10] + "│"  + item_list[8][1][0] + item_list[8][1][1] + item_list[8][1][2] + item_list[8][1][3] + item_list[8][1][4] + item_list[8][1][5] + item_list[8][1][6] + item_list[8][1][7] + item_list[8][1][8] + item_list[8][1][9] + item_list[8][1][10] + "│");
        System.out.println("│"+ item_list[6][2][0] + item_list[6][2][1] + item_list[6][2][2] + item_list[6][2][3] + item_list[6][2][4] + item_list[6][2][5] + item_list[6][2][6] + item_list[6][2][7] + item_list[6][2][8] + item_list[6][2][9] + item_list[6][2][10] + "│" + item_list[7][2][0] + item_list[7][2][1] + item_list[7][2][2] + item_list[7][2][3] + item_list[7][2][4] + item_list[7][2][5] + item_list[7][2][6] + item_list[7][2][7] + item_list[7][2][8] + item_list[7][2][9] + item_list[7][2][10] + "│"  + item_list[8][2][0] + item_list[8][2][1] + item_list[8][2][2] + item_list[8][2][3] + item_list[8][2][4] + item_list[8][2][5] + item_list[8][2][6] + item_list[8][2][7] + item_list[8][2][8] + item_list[8][2][9] + item_list[8][2][10] + "│");
        System.out.println("│"+ item_list[6][3][0] + item_list[6][3][1] + item_list[6][3][2] + item_list[6][3][3] + item_list[6][3][4] + item_list[6][3][5] + item_list[6][3][6] + item_list[6][3][7] + item_list[6][3][8] + item_list[6][3][9] + item_list[6][3][10] + "│" + item_list[7][3][0] + item_list[7][3][1] + item_list[7][3][2] + item_list[7][3][3] + item_list[7][3][4] + item_list[7][3][5] + item_list[7][3][6] + item_list[7][3][7] + item_list[7][3][8] + item_list[7][3][9] + item_list[7][3][10] + "│"  + item_list[8][3][0] + item_list[8][3][1] + item_list[8][3][2] + item_list[8][3][3] + item_list[8][3][4] + item_list[8][3][5] + item_list[8][3][6] + item_list[8][3][7] + item_list[8][3][8] + item_list[8][3][9] + item_list[8][3][10] + "│");
        System.out.println("└───────────┴───────────┴───────────┘");
    }
}