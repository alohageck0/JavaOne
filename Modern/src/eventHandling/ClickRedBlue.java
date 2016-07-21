package eventHandling;

import javax.swing.*;
import java.awt.*;

public class ClickRedBlue extends JPanel {

   public ClickRedBlue() {
      setBackground(Color.RED);
      addMouseListener(new MouseListener());
   }
}
