public class OnionRings extends HamburgerDecorator{
    public OnionRings(Hamburger hamburger) {
        super(hamburger);
    }

    public String serve() {
        return super.serve() + serveWithOnionRings();
    }

    private String serveWithOnionRings() {
        return " with onion rings";
    }
}
