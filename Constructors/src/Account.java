public class Account {
   private int accNumber;
   private double balance;
   private String customerName;
   private String email;
   private String phone;

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

   public void deposit(double ammount) {
      this.balance += ammount;
      System.out.println("New balance = " + this.balance);
   }

   public void withdraw(double ammount) {
      if ((this.balance - ammount) >= 0) {
         this.balance -= ammount;
         System.out.println("New balance = " + this.balance);
      } else {
         System.out.println("Not enough money");
      }
   }
}
