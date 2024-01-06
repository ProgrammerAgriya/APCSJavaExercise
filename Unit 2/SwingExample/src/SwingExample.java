import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample{
    public static boolean go()
    {
        // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("My app");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // create a Button and a Label
        JButton helloButton = new JButton("Click Me!");
        JLabel outputLabel = new JLabel();

        //create a Button and a Label for Goodbye
        JButton goodbyeButton = new JButton("Goodbye !");
        JLabel outputGoodbye = new JLabel();

        // place and size for components
        // setBounds(x position, y position, width, height)
        helloButton.setBounds(100, 100, 100, 50);
        outputLabel.setBounds(100,200,200,50);
        Font helloWorldFont = new Font("Arial", Font.PLAIN, 32);
        outputLabel.setFont(helloWorldFont);
        outputLabel.setForeground(Color.BLUE);

        //place and size for components for your new button
        //setBounds(x position, y position, width, height)
        goodbyeButton.setBounds(110, 110, 100, 50);
        outputGoodbye.setBounds(200, 300, 300, 100);
        Font goodbyeFont = new Font("New Times Roman", Font.BOLD, 50);
        outputGoodbye.setFont(goodbyeFont);
        outputGoodbye.setForeground(Color.red);
        outputGoodbye.setForeground(new Color(18, 54, 40));


        // add components to JFrame
        frame.add(helloButton);
        frame.add(outputLabel);
        frame.add(goodbyeButton);
        frame.add(outputGoodbye);

        // add event listener for button click
        ActionListener hello = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputLabel.setText("Hello World!");
            }
        };
        helloButton.addActionListener(hello);

        //add event listener for goodbye button click
        ActionListener byebye = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputGoodbye.setText("Goodbye !");
            }
        };
        goodbyeButton.addActionListener(byebye);

        // make the frame visible
        frame.setVisible(true);

        //Do not alter the code below:
        String helloWorldFontName = helloWorldFont.getFontName();
        int helloWorldFontStyle = helloWorldFont.getStyle();
        String goodbyeFontName = goodbyeFont.getFontName();
        int goodbyeFontStyle = goodbyeFont.getStyle();
        boolean isDifferent = (!helloWorldFontName.equals(goodbyeFontName) && helloWorldFontStyle != goodbyeFontStyle);
        return isDifferent;
    }
    public static void main(String[] args)
    {
        go();
    }
}