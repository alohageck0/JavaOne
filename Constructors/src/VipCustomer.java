public class VipCustomer {
   private String name;
   private double creditLimit;
   private String email;

   public VipCustomer() {
      this("default name", 100000.00, "default@");
   }

   public VipCustomer(String name, double creditLimit) {
      this(name, creditLimit, "default@");
   }

   public String getName() {
      return name;
   }

   public double getCreditLimit() {
      return creditLimit;
   }

   public String getEmail() {
      return email;
   }

   public VipCustomer(String name, double creditLimit, String email) {

      this.name = name;
      this.creditLimit = creditLimit;
      this.email = email;
   }
}
