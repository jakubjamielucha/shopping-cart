import java.lang.reflect.Array;

public class Store {
    private Item[][] items;

    public Store(){
        this.items = new Item[7][3];
    }

    public Item getItem(int row, int column){
        return new Item(this.items[row][column]);
    }

    public void setItem(int row, int column, Item item){
        this.items[row][column] = new Item(item);
    }

    public String toString(){
        String temp = "\n";
        for (int i = 0; i < this.items.length; i++) {
            switch (i) {
                case 0: temp += "\tDRINKS:        "; break;
                case 1: temp += "\tCEREAL:        "; break;
                case 2: temp += "\tDAIRY:         "; break;
                case 3: temp += "\tDELI:          "; break;
                case 4: temp += "\tGREENS:        "; break;
                case 5: temp += "\tCLOTHING:      "; break;
                case 6: temp += "\tELECTRONICS:   "; break;
            }
            for (int j = 0; j < this.items[i].length; j++) {
                temp += this.items[i][j].getName() + ":\t" + this.items[i][j].getPrice() + "\t\t";
            }
            temp += "\n\n";
        }
        temp +="\t********************************************************************************\n";
        return temp;
    }

}
