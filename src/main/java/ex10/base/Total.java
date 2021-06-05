package ex10.base;

public class Total {

    static final double TAX = 5.5 / 100;
    private float subtotal;
    private Item item1;
    private Item item2;
    private Item item3;

    public Total(Item item1, Item item2, Item item3){
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }
    public float subtotal (){
        this.subtotal = item1.getPrice() * item1.getQuantity() + item2.getPrice() * item2.getQuantity() +
                item3.getPrice() * item3.getQuantity();
        return subtotal;
    }

    public double taxed (){
        return subtotal * TAX;
    }

    public double totalFinal (){
        return subtotal + taxed();

    }

}
