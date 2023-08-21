public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("булка з кунжутом", "говядина", "чеддер", "салат, помідори", "є");
        Burger dietBurger = new Burger("булка зернова", "курка", "бринза", "огірки, листя салату");
        Burger doubleMeatBurger = new Burger("булка з кунжутом", "говядина", "чеддер");
    }
}
