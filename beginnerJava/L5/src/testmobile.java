public class testmobile {
    public static void main(String[] args) {
        Card ca = new Card();
        ca.store("ÄãºÃ");
        Mobile mo = new Mobile(ca);
        mo.showMessage();
    }
}
