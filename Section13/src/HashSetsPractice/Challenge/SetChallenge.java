package HashSetsPractice.Challenge;

import java.util.HashSet;
import java.util.Set;

public class SetChallenge {
   private static Set<HeavenlyBody> solarSystem = new HashSet<>();

   public static void main(String[] args) {
      HeavenlyBody temp = new Planet("Mercury", 88);
      solarSystem.add(temp);

      temp = new Planet("Venus", 225);
      solarSystem.add(temp);

      temp = new Planet("Pluto", 248);
      solarSystem.add(temp);

      temp = new Planet("Earth", 265);
      solarSystem.add(temp);

      HeavenlyBody tempMoon = new Moon("Moon", 27);
      solarSystem.add(tempMoon);

      getPlanet("Earth").addMoon(getMoon("Moon"));
   }

   public static Planet getPlanet(String name) {
      for (HeavenlyBody h : solarSystem) {
         if (h.getName().equals(name) && h.getBodyType().equals("Planet")) {
            return (Planet) h;
         }
      }
      return null;
   }

   public static Moon getMoon(String name) {
      for (HeavenlyBody h : solarSystem) {
         if (h.getName().equals(name) && h.getBodyType().equals("Moon")) {
            return (Moon) h;
         }
      }
      return null;
   }
}
