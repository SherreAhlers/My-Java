package academy.learnprogramming;

public interface ITelephone {
    // right click academy.learnprogramming and create new
    // instead of class select interface
    // the name on interfaces will always start with a I
    // as in interface telephone would be ITelephone.

//    public void powerOn();
//    public void dial(int phoneNumber);
//    public void answer();
//    public boolean callPhone(int phoneNumber);
//    public boolean isRinging();
    // because these are used in a class you don't actually need the public statement
    // because you will define that in the class itself.
    
    // DO INSTEAD:
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    // these are the methods that a class Telephone will use.
    // we do not create classes here we instead we create the signature
    // parameters name and return type, but not actual code itself
    // defining methods that form the interface.


    // for a class it is going to implement from interface these are the methods that are
    // allowed to be used.
}
