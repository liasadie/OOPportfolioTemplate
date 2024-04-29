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
            return;}
        //if(commands.length>2){
         //   System.out.println("Incorrect number of parameters");
          //  return;
       // }

        switch(commands[0]) {
            case "penup":
                penUp();
                return;
            case "pendown":
                penDown();
                return;
            case "turnleft":
                doMyTurnLeftImplementation(commands);
                return;
            case "turnright":
                doMyTurnRightImplementation(commands);
                return;
            case "forward":
                doMyForwardImplementation(commands);
                return;
            case "backward":
                doMyBackwardImplementation(commands);
                return;
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
            case "reset":
                reset();
                return;
            case "clear":
                clear();
                return;
        }
    }

    private void doMyTurnRightImplementation(String[] commands) {
        if (commands.length!=2){
            System.out.println("Incorrect number of parameters");
        }
        try{
            int angle = Integer.parseInt(commands[1]);
            turnRight(angle);
        }
        catch(NumberFormatException e){
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyTurnLeftImplementation(String[] commands) {
        if(commands.length!=2){
            System.out.println("Incorrect number of parameters");
            return;
        }
        try{
            int angle = Integer.parseInt(commands[1]);
            turnLeft(angle);
        }
        catch(NumberFormatException e){
            System.out.println("Parameter 2 needs to be a number");
        }
    }


    private void doMyBackwardImplementation(String[] commands) {
        if(commands.length!=2){
            System.out.println("Incorrect number of parameters");
            return;
        }
        try {
            int amount = Integer.parseInt(commands[1]);
            forward(-amount);
        }
        catch(NumberFormatException e){
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyForwardImplementation(String[] commands) {
        if(commands.length!=2){
           System.out.println("Incorrect number of parameters");
          return;
         }
        try {
            int distance = Integer.parseInt(commands[1]);
            forward(distance);
        }
        catch(NumberFormatException e){
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    public boolean isValidCommand(String command) {
        return Arrays.asList(commands).contains(command);
    }
}


