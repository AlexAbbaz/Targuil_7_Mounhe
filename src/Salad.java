public class Salad extends HamburgerDecorator{
    public Salad(Hamburger hamburger) {
        super(hamburger);
    }

    public String serve() {
        return super.serve() + serveWithSalad();
    }

    private String serveWithSalad() {
        return " with salade";
    }
}
