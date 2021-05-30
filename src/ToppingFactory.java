public class ToppingFactory {
    public Hamburger addTopping(String str, Hamburger hamburger) {
        switch (str){
            case "ch":
                return new Chips(hamburger);
            case "or":
                return new OnionRings(hamburger);
            case "sa":
                return new Salad(hamburger);
            case "fe":
                return new FriedEgg(hamburger);
            default:
                return hamburger;
        }
    }
}
