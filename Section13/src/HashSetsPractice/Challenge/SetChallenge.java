package HashSetsPractice.Challenge;

import java.util.HashSet;
import java.util.Set;

public class SetChallenge {
   private static Set<HeavenlyBody> solarSystem = new HashSet<>();

   public static void main(String[] args) {
      Planet temp = new Planet("Mercury", 88);
      solarSystem.add(temp);

      temp = new Planet("Venus", 225);
      solarSystem.add(temp);

      temp = new Planet("Pluto", 248);
      solarSystem.add(temp);

      temp = new Planet("Earth", 265);
      solarSystem.add(temp);

      temp = new Planet("Mars", 687);
      temp.addMoon(new Moon("Phobos", 0.3));
      temp.addMoon(new Moon("Deimos", 1.3));
      solarSystem.add(temp);

      temp = new Planet("Jupiter", 4332);
      temp.addMoon(new Moon("Io", 1.8));
      temp.addMoon(new Moon("Europa", 3.5));
      temp.addMoon(new Moon("Ganymede", 7.1));
      temp.addMoon(new Moon("Callisto", 16.7));
      solarSystem.add(temp);

      temp = new Planet("Saturn", 10759);
      solarSystem.add(temp);

      temp = new Planet("Uranus", 30660);
      solarSystem.add(temp);

      temp = new Planet("Nuptune", 165);
      solarSystem.add(temp);

      temp = new Planet("Pluto", 165);
      solarSystem.add(temp);


      Moon tempMoon = new Moon("Moon", 27);
      solarSystem.add(tempMoon);

      getPlanet("Earth").addMoon(getMoon("Moon"));

      printSystem(solarSystem);
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

   public static void printSystem(Set<HeavenlyBody> set) {
      for (HeavenlyBody planet : set) {
         System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
      }
   }
}
