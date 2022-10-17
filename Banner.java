/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = "I'm am the mighty scarecrow! Fear me birds!";
    }

   
    public void display() {

        System.out.println("           ****************************");
        System.out.println("    *********~~~~~~~~~~~~~~~~~~~~~~~~ ********");
        System.out.print("** ~");
        System.out.print(this.message); 
        System.out.println(" ~**");
        System.out.println("    ******** ~~~~~~~~~~~~~~~~~~~~~~~~ ********");
        System.out.println("           ****************************");
        System.out.println("                    *******");
        System.out.println("                    ***");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello");
        myBanner.display(); 
    }
}
