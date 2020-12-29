package academy.learnprogramming;
// Example of using packages

import java.awt.*;
// the star means to import all class, interfaces, and static from the java.awt
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// the .event are different packages from the awt package

public class MyWindow extends Frame {
    // this is the constructor
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 10);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}
// this will create a pop up window in the browser
// packages can be bundles
