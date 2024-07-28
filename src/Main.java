import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String menuChoice;
        boolean quitChoice = false;
        boolean isDone = false;
        int listNum = 1;
        String userInput;
        int userIndex = 0;

        ArrayList<String> myArrList = new ArrayList<>();
        ArrayList<String> printedArrList = new ArrayList<>();

        String prompt0 = "Please select a menu option: \nA - Add an item\nD - Delete an item\nI - Insert an item\nP - Display the list\nQ - Quit";
        String prompt1 = "Enter a string to add to the list: ";
        String prompt2 = "Please enter the index of the item you would like to delete: ";
        String prompt3 = "Please enter the index of the item you would like to replace: ";
        String prompt4 = "Here is the current state of the list: ";
        String prompt5 = "Quit - are you sure?";

        do {

            System.out.println(prompt0 + "\n");
            menuChoice = sca.nextLine();

            if (menuChoice.equalsIgnoreCase("A")) {
                listNum = 1;
                System.out.println(prompt1 + "\n");
                userInput = sca.nextLine();
                myArrList.add(0, userInput);
                printedArrList.clear();
                for (int i = 0; i < myArrList.size(); i++) {
                    printedArrList.add(listNum + ". " + myArrList.get(i));
                    listNum++;
                }
                System.out.println();
            }

            if (menuChoice.equalsIgnoreCase("D")) {
                listNum = 1;
                System.out.println(prompt2 + "\n");
                userIndex = sca.nextInt();
                myArrList.remove(userIndex - 1);
                printedArrList.clear();
                for (int i = 0; i < myArrList.size(); i++) {
                    printedArrList.add(listNum + ". " + myArrList.get(i));
                    listNum++;
                }
                System.out.println();
            }

            if (menuChoice.equalsIgnoreCase("I")) {
                listNum = 1;
                System.out.println(prompt3 + "\n");
                userIndex = sca.nextInt();
                System.out.println(prompt1 + "\n");
                userInput = sca.nextLine();
                userInput = sca.nextLine();
                myArrList.add(userIndex-1, userInput);
                printedArrList.clear();
                for (int i = 0; i < myArrList.size(); i++) {
                    printedArrList.add(listNum + ". " + myArrList.get(i));
                    listNum++;
                }
                System.out.println();
            }

            if (menuChoice.equalsIgnoreCase("P")) {
                System.out.println(prompt4 + " ");
                System.out.print(printedArrList);
                System.out.println("\n");
            }

            if (menuChoice.equalsIgnoreCase("Q")) {
                quitChoice = SafeInput.getYNConfirm(sca, prompt5 + "\n");
            }
            if (quitChoice) {
                isDone = true;
            }

        } while (!isDone);
    }
}