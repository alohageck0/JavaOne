package HashSetsPractice.Challenge;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody {
   private Set<Moon> satellites;

   public Planet(String name, double orbitalPeriod) {
      super(name, orbitalPeriod, "Planet");
      this.satellites = new HashSet<>();
   }

   public boolean addMoon(Moon moon) {
      return this.satellites.add(moon);
   }

   public Set<Moon> getSatellites() {
      return new HashSet<>(this.satellites);
   }
}
