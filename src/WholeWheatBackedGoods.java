//Vererbung mit extends angeben
public class WholeWheatBackedGoods extends BackedGoods {

    private int typeOfFlour;

    //Eigenschaften sind nicht geerbt, da diese in BackedGoods
    //private sind
    public WholeWheatBackedGoods() {
        super();
    }

    public WholeWheatBackedGoods(int backingTime) {
        super(backingTime);
    }

    public WholeWheatBackedGoods(String name) {
        super(name);
    }

    public WholeWheatBackedGoods(String name, int backingTime) {
        super(name, backingTime);
    }

    public WholeWheatBackedGoods(int backingTime, String name, String recipe) {
        super(backingTime, name, recipe);
    }

    public WholeWheatBackedGoods(int backingTime, String name, String recipe, int typeOfFlour) {
        super(backingTime, name, recipe);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String getName() {


        return "Vollkorn"+ super.getName();

    }














}
