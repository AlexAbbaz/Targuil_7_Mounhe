public abstract class HamburgerDecorator implements Hamburger{
    private Hamburger itsHamburger;

    public HamburgerDecorator(Hamburger hamburger) {
        this.itsHamburger = hamburger;
    }
    @Override
    public String serve() {
        return itsHamburger.serve();
    }
}
