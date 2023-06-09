package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        ArrayList<String> giftList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continueAdding = true;

        while (continueAdding) {
            System.out.print("Scrivi il regalo che vuoi per Natale: ");
            String gift = scanner.nextLine();
            giftList.add(gift);

            System.out.print("Vuoi aggiungere altri regali? (sì/no): ");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("sì") && !choice.equalsIgnoreCase("si") && !choice.equalsIgnoreCase("no")) {
                System.out.println("Per favore, inserisci una risposta valida.");
            } else if (choice.equalsIgnoreCase("no")) {
                continueAdding = false;
            }
        }

        Collections.sort(giftList);

        System.out.println("Lista dei regali ordinata:");
        for (int i = 0; i < giftList.size(); i++) {
            System.out.println(giftList.get(i));
        }
    }
}
