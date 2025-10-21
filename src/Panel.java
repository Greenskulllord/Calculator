import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    // Constants are best declared as static and final
    private static final int SCREEN_WIDTH = 400;
    private static final int SCREEN_HEIGHT = 400;

    // Declare components as instance fields to access them from anywhere in the class
    private JTextField displayField;
    private JButton equalsButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplecationButton;
    private JButton divisionButton;
    private JLabel titleLabel;

    //this is a function that will talk with the calc class
    String userInput;


    Panel() {

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.decode("#333333"));
        this.setLayout(null);
        //adds the title to the panel
        titleLabel = createTitleLabel();
        this.add(titleLabel);
        //adds the display to panel
        displayField = createDisplayField();
        this.add(displayField);
        //adds the equal button to the panel
        equalsButton = createEqualsButton();
        this.add(equalsButton);
        //adds the plus button to the panel
        plusButton = createPlusButton();
        this.add(plusButton);
        //adds the minus button
        minusButton = createMinusButton();
        this.add(minusButton);
        //adds the mulitply button
        multiplecationButton = getMultiplecationButton();
        this.add(multiplecationButton);
        //adds the division button
        divisionButton = DivisionButton();
        this.add(divisionButton);


    }

    private JLabel createTitleLabel() {
        JLabel label = new JLabel("Calculator");
        label.setBounds(30, 20, 400, 30);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        return label;
    }

    private JTextField createDisplayField() {
        JTextField field = new JTextField("0");
        field.setBounds(20, 60, 300, 50);
        field.setBackground(Color.darkGray);
        field.setForeground(Color.white);
        field.setFont(new Font("Arial", Font.BOLD, 24));
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        return field;
    }

    private JButton createEqualsButton() {
        JButton button = new JButton("=");
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setBounds(270, 120, 80, 50);
        styleButton(button, Color.orange);
        button.addActionListener(e -> {
            userInput = displayField.getText();
            new Calculator(userInput);
        });
        return button;
    }

    //below is all the buttons for their creation
    private JButton createPlusButton() {
        JButton button = new JButton("+");
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setBounds(180, 120, 80, 50);
        styleButton(button, Color.darkGray);
        button.addActionListener(e -> displayField.setText(STR."\{displayField.getText()}+"));
        return button;
    }

    private JButton createMinusButton() {
        JButton button = new JButton("-");
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setBounds(100, 120, 80, 50);
        styleButton(button, Color.darkGray);
        button.addActionListener(e -> displayField.setText(STR."\{displayField.getText()}-"));
        return button;
    }

    private JButton getMultiplecationButton() {
        JButton button = new JButton("*");
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setBounds(20, 120, 80, 50);
        styleButton(button, Color.darkGray);
        button.addActionListener(e -> displayField.setText(STR."\{displayField.getText()}*"));
        return button;
    }

    private JButton DivisionButton() {
        JButton button = new JButton("/");
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setBounds(20, 170, 80, 50);
        styleButton(button, Color.darkGray);
        button.addActionListener(e -> displayField.setText(STR."\{displayField.getText()}/"));
        return button;
    }

    //this private Component is what gives the button its style
    private void styleButton(JButton button, Color backgroundColor) {
        button.setForeground(Color.white);
        button.setBackground(backgroundColor);
        button.setBorderPainted(false);
        button.setFocusable(false);
    }
}
