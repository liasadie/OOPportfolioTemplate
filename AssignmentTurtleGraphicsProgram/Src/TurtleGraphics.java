package Src;

import uk.ac.leedsbeckett.oop.OOPGraphics;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.io.PrintWriter;
import java.util.Scanner;

public class TurtleGraphics extends OOPGraphics {

    private final String[] commands =
            {"penup", "pendown", "turnleft", "turnright", "forward", "backward", "black", "green", "red", "white", "reset", "clear", "circle", "square", "penwidth", "triangle"};


    public TurtleGraphics() {
        JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                                               //set the frame to a size we can see
        MainFrame.setVisible(true);                             //now display it
        //about();                                                                //call the OOPGraphics about method to display version information.
    }

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }


    @Override
    public void processCommand(String command) {
        String[] commands = command.split(" ");
        ;
        if (!isValidCommand(commands[0])) {
            System.out.println("Invalid command");
            return;
        }
        //if(commands.length>2){
        //   System.out.println("Incorrect number of parameters");
        //  return;
        // }

        switch (commands[0]) {
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
                clear();
                return;
            case "clear":
                clear();
                return;
            case "circle":
                doMyCircleImplementation(commands);
                return;
            case "square":
                doMySquareImplementation(commands);
                return;
            case "penwidth":
                doMyPenWidthImplementation(commands);
                return;
            case "triangle":
                doMyTriangleImplementation(commands);
                return;
        }
    }

    private void doMyTriangleImplementation(String[] commands) {
        if (commands.length != 2){
            System.out.println("incorrect number of parameters");
            return;
        }
        int side = Integer.parseInt(commands [1]);
        if(side <0 || side >600){
            System.out.println("Out of bounds");
            return;
        }
        try{
            turnLeft(30);
            penDown();
            forward(side);
            turnRight(120);
            forward(side);
            turnRight(120);
            forward(side);
        }
        catch(NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyPenWidthImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int width = Integer.parseInt(commands[1]);
        if(width <1 || width >20){
            System.out.println("Out of bounds");
            return;
        }
        try{
            setStroke(width);
        }
        catch(NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMySquareImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int side = Integer.parseInt(commands[1]);
        if(side <0 || side > 600){
            System.out.println("Out of bounds");
            return;
        }
        try{
            forward(side);
            turnRight(90);
            forward(side);
            turnRight(90);
            forward(side);
            turnRight(90);
            forward(side);
        }
        catch(NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyCircleImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int radius = Integer.parseInt(commands[1]);
        if(radius <0 || radius >600){
            System.out.println("radius is too large");
            return;
        }
        try{
            circle(radius);
        }
        catch(NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyTurnRightImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int angleRight = Integer.parseInt(commands[1]);
        if (angleRight < 0 || angleRight > 360) {
            System.out.println("Angle must be between 0 and 360 degrees");
            return;
        }
        try {
            turnRight(angleRight);
        } catch (NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyTurnLeftImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int angleLeft = Integer.parseInt(commands[1]);
        if (angleLeft <0 || angleLeft > 360){
            System.out.println("Angle must be between 0 and 360 degrees");
            return;
        }
        try {
            turnLeft(angleLeft);
        } catch (NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }


    private void doMyBackwardImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int amount = Integer.parseInt(commands[1]);
        if(amount <0 || amount >600){
            System.out.println("Out of bounds");
            return;
        }
        try {
            forward(-amount);
        } catch (NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    private void doMyForwardImplementation(String[] commands) {
        if (commands.length != 2) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        int distance = Integer.parseInt(commands[1]);
        if(distance <0 || distance >600){
            System.out.println("Out of bounds");
            return;
        }
        try {
            forward(distance);
        } catch (NumberFormatException e) {
            System.out.println("Parameter 2 needs to be a number");
        }
    }

    public boolean isValidCommand(String command) {
        return Arrays.asList(commands).contains(command);
    }

}



