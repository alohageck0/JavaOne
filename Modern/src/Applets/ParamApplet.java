package Applets;

import java.applet.Applet;
import java.awt.*;

public class ParamApplet extends Applet {

   @Override
   public void init() {
      String bg = getParameter("BACKGROUND");
      if ((bg != null) && bg.equalsIgnoreCase("light")) {
         setBackground(Color.WHITE);
      } else {
         setBackground(Color.black);
      }
   }
}
