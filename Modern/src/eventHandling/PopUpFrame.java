package eventHandling;

import javax.swing.*;
import java.awt.*;

public class PopUpFrame extends JFrame {
   public PopUpFrame() throws HeadlessException {
      setContentPane(new ClickRedBlueInterface());
      setSize(100, 100);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setVisible(true);
   }

   public static void main(String[] args) {
      new PopUpFrame();
   }
}
