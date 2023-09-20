public class Item {
    private String name;
    private double price;

    public Item(String name, double price){
        if(name.isBlank() || name == null){
            throw new IllegalArgumentException("Please provide correct name!");
        }
        if(price < 0){
            throw new IllegalArgumentException("Please provide correct price!");
        }
        this.name = name;
        this.price = price;
    }

    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                "\tPrice: " + price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        if(name.isBlank() || name == null){
            throw new IllegalArgumentException("Please provide correct name!");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Please provide correct price!");
        }
        this.price = price;
    }

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        else if(!(obj instanceof Item)){
            return false;
        }
        Item item = (Item)obj;
        return this.name.equals(item.name) && this.price == item.price;
    }
}
