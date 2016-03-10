package HashSetsPractice;

public class HeavenlyBody {
   private final String name;
   private final double orbitalPeriod;
   private final String bodyType;

   public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
      this.name = name;
      this.orbitalPeriod = orbitalPeriod;
//      this.satellites = new HashSet<>();
      this.bodyType = bodyType;
   }

   public String getName() {
      return name;
   }

   public double getOrbitalPeriod() {
      return orbitalPeriod;
   }




   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      System.out.println("obj.getClass() is " + obj.getClass());
      System.out.println("this.getClass() is " + this.getClass());
      if ((obj == null) || (obj.getClass() != this.getClass())) {
         return false;
      }
      String objName = ((HeavenlyBody) obj).getName();
      return this.name.equals(objName);

   }

   @Override
   public int hashCode() {
      System.out.println("hashCode() called");
      return this.name.hashCode() + 57;
   }
}
