public class User {
    private final String login;
    private String pass;
    private final Basket basket;

    public User(String login, String pass, Basket basket) {
        this.login = login;
        this.pass = pass;
        this.basket = basket;

    }

    public String getLogin() {
        return login;
    }

    public Basket getBasket() {
        return basket;
    }

    void showBasket() {
        System.out.println("Корзина - " + login);
        basket.printBasket();
        System.out.println("################################### ");
    }
}