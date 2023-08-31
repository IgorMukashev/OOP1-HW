public class Category {
    private String catName;
    private ArrayList<Goods> goodsArray;

    public Category(String catName, ArrayList<Goods> goodsArray) {
        this.catName = catName;
        this.goodsArray = goodsArray;
    }

    public void addToCategory(Goods goods){
        goodsArray.add(goods);
    }

    public void printCategory (){
        System.out.println(" Категория " + catName+ ":");
        for (Goods prod :goodsArray
             ) { System.out.println(prod);
        }
    }

    public Goods findByName(String prodName) {
        for (Goods prod : goodsArray) {
            if (prod.getName().equals(prodName)) {
                return prod;
            }
        }
        return new Goods("Неизвестный товар", 0.0, 0.0, 0);
    }
}
    public Goods findByName(String prodName) {
        for (Goods prod : goodsArray) {
            if (prod.getName().equals(prodName)) {
                return prod;
            }
        }
        return new Goods("Неизвестный товар", 0.0, 0.0, 0);
    }
}

public class Main {

}
