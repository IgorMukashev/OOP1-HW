public class Basket {

    private HashMap<String, Integer> basketGoods;

    public Basket() {
        basketGoods= new HashMap<String, Integer>();
    }


    public void addToBasket(String productName, int qty) {
        if (basketGoods.isEmpty()) {
            basketGoods.put(productName, qty);
        } else {
                for (Map.Entry entry : basketGoods.entrySet()
                ) {
                    if (entry.getKey().equals(productName)) {
                        int temp = (int) entry.getValue();
                        temp = temp + qty;
                        entry.setValue(temp);
                    }

                }
            }
        }


    void printBasket() {
        for (Map.Entry entry : basketGoods.entrySet()
        ) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue().toString() + " шт.");
        }
    }


    public HashMap<String, Integer> getBasketGoods() {
        return basketGoods;
    }

    public void setBasketGoods(HashMap<String, Integer> basketGoods) {
        this.basketGoods = basketGoods;
    }
}