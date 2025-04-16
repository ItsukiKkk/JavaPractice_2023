public class Card {
    private String message;
    public String store(String msg) {
        message = msg;
        return message;
    }
    public String readCard() {
        return message;
    }
}