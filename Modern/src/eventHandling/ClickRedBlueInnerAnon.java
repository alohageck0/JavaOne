package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickRedBlueInnerAnon extends JPanel {

   public ClickRedBlueInnerAnon() {
      setBackground(Color.RED);
      addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) {
            if (getBackground().equals(Color.RED)) {
               setBackground(Color.BLUE);
            } else {
               setBackground(Color.RED);
            }
         }
      });
   }
}
