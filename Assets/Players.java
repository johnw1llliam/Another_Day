package Assets;

import java.util.Scanner;  

public abstract class Players {
    public String name;
    public Items item;
    public String choice;
    final Scanner scanner = new Scanner(System.in); 

    public void skip() {
        scanner.nextLine();
    }

    public void setChoices() { 
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        this.choice = choice;
    }


    public String getChoices() {
        return choice;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        this.name = name;
    }

    public void setItem(Items givenItems) {
        this.item = givenItems;
    }

    public Items getItem() {
        return item;
    }

    public void removeItem() {
        this.item = null;
    }
}