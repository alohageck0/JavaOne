public class Account {
   private int accNumber;
   private double balance;
   private String customerName;
   private String email;
   private String phone;


   public Account() {
      this(24234, 2.5, "default", "def email", "def phone");
      System.out.println("Empty constructor");
   }

   public Account(int number, double balance, String customerName, String email, String phone) {
      this.accNumber = number;
      this.balance = balance;
      this.customerName = customerName;
      this.email = email;
      this.phone = phone;
      System.out.println("With params");
   }

   public int getAccNumber() {
      return accNumber;
   }

   public double getBalance() {
      return balance;
   }

   public String getCustomerName() {
      return customerName;
   }

   public String getEmail() {
      return email;
   }

   public String getPhone() {
      return phone;
   }

   public void setAccNumber(int accNumber) {
      this.accNumber = accNumber;
   }

   public void setBalance(double balance) {
      this.balance = balance;
      System.out.println("New balance = " + this.balance);
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void deposit(double amount) {
      this.balance += amount;
      System.out.println("New balance = " + this.balance);
   }

   public void withdraw(double amount) {
      if ((this.balance - amount) >= 0) {
         this.balance -= amount;
         System.out.println("New balance = " + this.balance);
      } else {
         System.out.println("Not enough money");
      }
   }
}
