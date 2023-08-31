public class Goods {
    private String name;
    private Double price;
    private Double rating;
    private int qty;

    public Goods(String name, Double price, Double rating, int qty) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.qty = qty;
    }

    public void increaseQty (int add){
        qty = qty + add;
    }

    public void reduceQty(int remove){
        if (qty>remove) {
            qty = qty - remove;
        } else System.out.println("Не могу выполнить операцию, недостаточно товара");
    }


    @Override
    public String toString() {
        return "Товар{" +
                "Наименование='" + name + '\'' + "\n"+
                "Цена=" + price + "\n"+
                "Рейтинг=" + rating + "\n"+
                "Кол-во=" + qty + "\n"+
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
}
    void showBasket() {
        System.out.println("Корзина - " + login);
        basket.printBasket();
        System.out.println("################################### ");
    }
}
