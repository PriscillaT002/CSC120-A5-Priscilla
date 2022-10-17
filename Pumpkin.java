/*
 * Pumpkin class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pumpkin {
    
    /*
     * Prints ASCII art depicting a jack-o'-lantern to the console
     */
    public void display() {



        System.out.println("              ___                        /\\                 /\\  ");
        System.out.println("           ___)__|_                     / \\'._   (\\_/)   _.'/ \\");
        System.out.println("      .-*'          '*-,                |.''._'--(o.o)--'_.''.|");
        System.out.println("     /      /|   |\\     \\               \\_ / `;= /    \\-. \\_  /");
        System.out.println("    ;      /_|   |_\\     ;                 `\\__| \\___/ |__/` ");
        System.out.println("    ;   |\\    /\\     /|  ;                      \\(_|_)/ ");
        System.out.println("    ;   | \\/--...--\\/ |  ;                       '   ' ");
        System.out.println("     \\  ''---.....--''  /");
        System.out.println("     ''*-.,_______,.-*'  ");  

    }
    
    /* main method (for testing) */
    public static void main(String[] args) {
        Pumpkin myPumpkin = new Pumpkin();
        myPumpkin.display();
    }

}
