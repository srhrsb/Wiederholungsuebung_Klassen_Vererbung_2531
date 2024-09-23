public class Controller {



    public static void main(String[] args) {

        BackedGoods standard = new BackedGoods();

        BackedGoods bread = new BackedGoods(60, "Brot", "Brotrezept");

        BackedGoods cake = new BackedGoods("Kuchen");

        System.out.println(cake.getName());


        BackedGoods wholeWheatBread = new WholeWheatBackedGoods(60, "Vollkorn Brot", "Volkorn Brot Rezept", 1050);
        System.out.println(wholeWheatBread.getName());



    }


}