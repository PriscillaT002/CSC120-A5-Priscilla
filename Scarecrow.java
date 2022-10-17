/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */


class Scarecrow {

    //Parts of the Scarecrow

    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    //private String message;

    /* Constructor
     */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot br, Boot bl, Banner m) {
        head = h;
        body = s;
        legs = p;
        rightFoot = br;
        leftFoot = bl;
        sign = m;
    }

    /* Displays the Scarecrow 

     *       ...in the right order!
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        rightFoot.display();
        leftFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        Scarecrow myScarecrow = new Scarecrow (new Pumpkin(), new Shirt(), new Pants(), new Boot("right"), new Boot("left"), new Banner("Hello"));

        // If a message was passed in on the command line, extract and store it
          

        if (args.length > 0) {
          // myScarecrow.message = args[0]; 

        }

        myScarecrow.display();
    }

}

