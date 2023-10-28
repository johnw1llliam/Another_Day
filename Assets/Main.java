package Assets;

import java.util.ArrayList;
import java.util.List;

public class Main {
    String narrative;
    public List<String> choices = new ArrayList<String>();

    public void setNarratives(String narrative) {
        this.narrative = narrative;
    }

    // public void showNarratives() {
    //     for (int i = 0; i < narrative.length(); i++) {
    //         // Print one character at a time
    //         System.out.print(narrative.charAt(i));
    //         // Introduce a delay (you can adjust the sleep duration as needed)
    //         try {
    //             Thread.sleep(20); // 100 milliseconds
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //     }
    // }

    public void showNarratives() {
        int lineLength = 0;
        int maxLineLength = 120; // Adjust this to your desired line length
        String[] words = narrative.split("\\s+"); // Split the narrative into words
    
        for (String word : words) {
            if (lineLength + word.length() + 1 > maxLineLength) {
                // If adding the current word would exceed the line length, start a new line
                System.out.println(); // Start a new line
                lineLength = 0;
            }
            System.out.print(word + " "); // Print one word at a time
            lineLength += word.length() + 1; // Update the current line length
            try {
                Thread.sleep(20); // Adjust the sleep duration as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Ensure a new line at the end
    }
    

    public void setChoices(List<String> allChoices) {
        this.choices = allChoices;
    }

    public void showChoices(int i) {
        System.out.println(choices.get(i));
    }

}
