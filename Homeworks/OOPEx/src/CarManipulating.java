
public class CarManipulating {
    public static void main(String[] args) {

       Cat someCat = new Cat();
        someCat.sayMiau();

        System.out.printf("The color of cat %s is %s.\n", someCat.name, someCat.color);

        Cat myWhiteCat = new Cat("Lucky", "White");
        myWhiteCat.sayMiau();

        //myWhiteCat.name = "Fero";

        System.out.printf("The color of cat %s is %s.\n", myWhiteCat.getName() , myWhiteCat.setColor("Green"));

    }
}
