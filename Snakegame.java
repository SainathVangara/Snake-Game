package snakegame;
import javax.swing.*;

public class Snakegame  extends JFrame {
    Snakegame(){
        super("Snake Game");
        add(new Board());
        pack();           //refresh chesthadi frame ni

        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {

        new Snakegame().setVisible(true);
    }
}
