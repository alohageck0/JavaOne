package HashSetsPractice.Challenge;

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

   public String getBodyType() {
      return bodyType;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      System.out.println("obj.getClass() is " + obj.getClass());
      System.out.println("this.getClass() is " + this.getClass());
      if ((obj == null)) {
         return false;
      }
      String objName = ((HeavenlyBody) obj).getName();
      String objBodyType = ((HeavenlyBody) obj).getBodyType();
      if (this.name.equals(objName)) {
         if (this.bodyType.equals(objBodyType)) {
            return true;
         } else {
            return false;
         }

      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
//      System.out.println("hashCode() called");
      return this.name.hashCode() + 57;
   }
}
