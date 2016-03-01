package InnerClasses;

public class Main {
   public static void main(String[] args) {
      GearBox mcLaren = new GearBox(6);
      GearBox.Gear first = mcLaren.new Gear(1, 12.3);
//      GearBox.Gear second = new GearBox.Gear(2,12);
//      GearBox.Gear thied = new mcLaren.Gear(2,12);

      System.out.println(first.driveSpeed(1000));

   }
}
