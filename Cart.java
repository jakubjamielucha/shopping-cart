import java.util.ArrayList;

public class Cart {

    ArrayList<Item> items;

    public Cart(){
        this.items = new ArrayList<Item>();
    }

    public boolean isEmpty(){
        return this.items.isEmpty();
    }

    public Item getItem(int index){
       return new Item(this.items.get(index));
    }

    public void setItem(Item item, int index){
        this.items.set(index, new Item(item));
    }

    public boolean addItem(Item item){
        if(this.items.contains(item)){
            System.out.println(item.getName() + " is already in your shopping cart.");
            return false;
        }
        this.items.add(new Item(item));
        System.out.println(item.getName() + " was added to your shopping cart.");
        return true;
    }

    public void removeItem(String name){
        if(items.isEmpty()){
            throw new IllegalStateException("The cart is empty, can't remove anything!");
        }
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equals(name)){
                this.items.remove(i);
            }
        }
    }

    public String checkout(){
        if(items.isEmpty()){
            throw new IllegalStateException("The cart is empty, there is nothing to checkout!");
        }
        double[] measures = new double[3];
        for (int i = 0; i < this.items.size(); i++) {
            measures[0] += this.items.get(i).getPrice();
        }
        measures[1] = measures[0] * 0.13;
        measures[2] = measures[0] + measures[1];

        return "\tRECEIPT\n\n" +
                "\tSubtotal: $" + measures[0] + "\n" +
                "\tTax: $" + measures[1] + "\n" +
                "\tTotal: $" + measures[2] + "\n";
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }
}
