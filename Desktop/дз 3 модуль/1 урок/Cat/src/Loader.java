public class Loader {
    public static void main(String[] args) {
        Cat murka = new Cat();

        System.out.println("Murka weight: " + murka.getWeight());

        murka.feed(150.0);
        System.out.println("Murka weight: " + murka.getWeight());

        murka.feed(100.0);
        System.out.println("Murka weight: " + murka.getWeight());

        murka.pee();
        murka.pee();
        murka.pee();
        System.out.println("Murka weight: " + murka.getWeight());
        System.out.println("Murka: " + murka.getStatus());

        System.out.println("Feed: " + murka.getFeed());

        System.out.println();

        Cat vasya = new Cat();
        System.out.println("Vasya weight: " + vasya.getWeight());

        vasya.feed(2);
        System.out.println("Vasya weight: " + vasya.getWeight());
        System.out.println("Vasya: " + vasya.getStatus());

        System.out.println();

        Cat petya = new Cat();
        System.out.println("Petya weight: " + petya.getWeight());
        System.out.println("Petya: " + petya.isAlive());

        petya.drink(500);
        System.out.println("Petya weight: " + petya.getWeight());
        System.out.println("Petya: " + petya.getStatus());
        System.out.println("Petya: " + petya.isAlive());
    }
}
