public class Main {
   public static void main(String[] args) {
      ITelephone timsPhone;
      timsPhone = new DeskPhone(123123123);

      timsPhone.powerOn();
      timsPhone.callPhone(123123123);
      timsPhone.answer();


      timsPhone = new MobilePhone(234234);
      timsPhone.powerOn();
      timsPhone.callPhone(234234);
      timsPhone.answer();
   }
}
