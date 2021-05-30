public class Chips extends HamburgerDecorator{
    public Chips(Hamburger hamburger) {
        super(hamburger);
    }

    public String serve() {
        return super.serve() + serveWithChips();
    }

    private String serveWithChips() {
        return " with chips";
    }
}
