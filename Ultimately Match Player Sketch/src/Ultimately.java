import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ultimately extends JFrame{
    private JPanel mainWindow;
    private JButton matchButton;
    private JButton insertButton;
    private JTextField assistText;
    private JTextField goalsText;
    private JTextField pasesText;
    private JTextField recoverText;


    public Ultimately(){
        setContentPane(mainWindow);
        setSize(500,500);

        matchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(assistText.getText());
                System.out.println(goalsText.getText());
                System.out.println(pasesText.getText());
                System.out.println(recoverText.getText());

            }
        });
    }

    public static void main(String[] args) {
        JFrame runApp = new Ultimately();
        runApp.setVisible(true);
    }
}
