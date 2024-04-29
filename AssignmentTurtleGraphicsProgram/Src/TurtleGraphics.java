import uk.ac.leedsbeckett.oop.OOPGraphics;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class TurtleGraphics extends OOPGraphics {

    private final String[] commands =
            {"penup", "pendown", "turnleft", "turnright", "forward", "backward", "black", "green", "red", "white", "reset", "clear"};


    public TurtleGraphics() {
        JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                                               //set the frame to a size we can see
        MainFrame.setVisible(true);                             //now display it
        //about();                                                                //call the OOPGraphics about method to display version information.
    }


    @Override
    public void processCommand(String command) {
        String[] commands = command.split(" ");
        ;
        if (!isValidCommand(commands[0])) {
            System.out.println("Invalid command");
            return;
        }
        switch(commands[0]) {
            case "penup":
                penUp();
                return;
            case "pendown":
                penDown();
                return;
            case "turnleft":
                turnLeft(commands[1]);
                return;
            case "turnright":
                turnRight(commands[1]);
                return;
            case "forward":
                forward(commands[1]);
                return;
            case "backward":
                int amount = Integer.parseInt(commands[1]);
                forward(-amount);
            case "black":
                setPenColour(Color.black);
                return;
            case "green":
                setPenColour(Color.green);
                return;
            case "red":
                setPenColour(Color.red);
                return;
            case "white":
                setPenColour(Color.white);
                return;

        }
    }

    public boolean isValidCommand(String command) {
        return Arrays.asList(commands).contains(command);
    }
}


