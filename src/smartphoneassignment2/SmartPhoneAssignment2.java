package smartphoneassignment2;

public class SmartPhoneAssignment2 {

    public static void main(String[] args) {
        System.out.println("I just bought this new brand smartphone.\n");
        SmartPhone Samsung = new SmartPhone();
        Samsung.setbrand("Samsung");
        Samsung.setweight(157);
        Samsung.setprice(750);
        Samsung.toString();
        
        System.out.println(Samsung.toString());
    }
    
}
