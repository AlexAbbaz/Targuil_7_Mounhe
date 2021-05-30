public class FriedEgg extends HamburgerDecorator{
    public FriedEgg(Hamburger hamburger) {
        super(hamburger);
    }

    public String serve() {
        return super.serve() + serveWithFriedEgg();
    }

    private String serveWithFriedEgg() {
        return " with fried egg";
    }
}
