public class BackedGoods {

    private final int TYPE_OF_FLOUR = 405; //Konstante, nicht veränderbar, in Java üblich alles groß

    private int backingTime; //Eigenschaften, private => nicht vererbt
    private String name;
    private String recipe;

    //Konstruktor (evtl. nicht sichtbar wenn Standárdkonstruktor ohne Parameter)
    //Das Überladen von Konstruktor setzt die s.g. Polymorpie um
    public BackedGoods(){
        backingTime = 45;
        name = "Backware";
        recipe= "Mehl, Wasser, Eier, Butter, Zucker rühren und backen.";
    }

    public BackedGoods(int backingTime) {
        this.backingTime = backingTime;
        name = "Backware";
        recipe= "Mehl, Wasser, Eier, Butter, Zucker rühren und backen.";
    }

    public BackedGoods(String name) {
        this.name = name;
        this.backingTime = 45;
        recipe= "Mehl, Wasser, Eier, Butter, Zucker rühren und backen.";
    }
    public BackedGoods(String name, int backingTime) {
        this.name = name;
        this.backingTime = backingTime;
        recipe= "Mehl, Wasser, Eier, Butter, Zucker rühren und backen.";
    }

    public BackedGoods(int backingTime, String name, String recipe) {
        this.backingTime = backingTime;
        this.name = name;
        this.recipe = recipe;
    }


    //Getter und Setter regeln den kontrollierten Zugriff auf Eigenschaften der Klasse
    public int getTYPE_OF_FLOUR() {
        return TYPE_OF_FLOUR;
    }

    public int getBackingTime() {
        return backingTime;
    }

    public void setBackingTime(int backingTime) {
        if(backingTime<5)
            backingTime = 5;

        this.backingTime = backingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
