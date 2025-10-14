import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Enter up to 5 items to buy (press Enter with no text to finish early):");

        // Ask user for up to 5 items
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            String item = input.nextLine().trim();

            // Stop if user pressed enter on blank line
            if (item.isEmpty()) {
                break;
            }
            shoppingList.add(item);
        }

        // Display shopping list
        System.out.println("\nYour shopping list:");
        if (shoppingList.isEmpty()) {
            System.out.println("(no items entered)");
        } else {
            System.out.println(String.join(", ", shoppingList));
        }

        // Show count
        System.out.println("\nYou entered " + shoppingList.size() + " item(s).");

        // Search feature
        System.out.print("\nSearch for an item: ");
        String search = input.nextLine().trim().toLowerCase();

        boolean found = false;
        for (String item : shoppingList) {
            if (item.toLowerCase().equals(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("✅ " + search + " is in your shopping list!");
        } else {
            System.out.println("❌ " + search + " is NOT in your shopping list.");
        }

        input.close();
    }
}