public class Main {
    public static void main(String[] args) {

        ArrayList<Category> store = new ArrayList<>();

        Goods milk = new Goods("Молоко", 86.30, 9.3, 15);
        Goods eggs = new Goods("Яйца", 121.50, 8.0, 18);
        Goods bread = new Goods("Хлеб", 35.0, 5.0, 150);
        Goods toothpaste = new Goods("Зубная паста", 235.0, 4.0, 40);

        Category chemestry = new Category("Бытовая химия", new ArrayList<>());
        Category products = new Category("Продукты", new ArrayList<>());

        products.addToCategory(milk);
        products.addToCategory(eggs);
        products.addToCategory(bread);
        chemestry.addToCategory(toothpaste);

        store.add(products);
        store.add(chemestry);

        System.out.println("Итого в магазине: ");
        for (Category category : store) {
            category.printCategory();
        }
        System.out.println("_________________________________1____________________________________ ");
        User valentin = new User("Valentin", "111", new Basket());
        User dima = new User("Dima", "222", new Basket());
        User elena = new User("Elena", "333", new Basket());

        System.out.println("________________________________2____________________________________ ");
        buy(valentin, store, "Хлеб", 3);
        buy(elena, store, "Зубная паста", 1);
        System.out.println("________________________________3____________________________________ ");
        valentin.showBasket();
        elena.showBasket();

        System.out.println("_________________________________4_____________________________________ ");
        System.out.println("_______________________________________________________________________ ");
        System.out.println("_______________________________________________________________________ ");

        System.out.println("Итого в магазине: ");
        for (Category category : store) {
            category.printCategory();
        }
    }

    public static void buy(User user, ArrayList<Category> store, String prod, int qty) {

        for (Category cat : store) {
            int temp = cat.findByName(prod).getQty();
            cat.findByName(prod).setQty(temp - qty);
        }
        user.getBasket().addToBasket(prod, qty);
    }

}