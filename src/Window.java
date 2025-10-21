import javax.swing.*;

public class Window extends JFrame {

    Window() {
        //puts the panel into the window
        this.add(new Panel());

        //sets the title and close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
