package DZ_Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       ArrayList<HotDrink> drinks = new ArrayList<>();
        drinks.add(new HotDrink(50, "Чай", 100));
        drinks.add(new HotDrink(70,"Чай", 100));
        drinks.add(new HotDrink(55,"Кофе", 100));
        drinks.add(new HotDrink(75,"Кофе", 100));

        HotDrinkVendingMachine automat = new HotDrinkVendingMachine();
        automat.init(drinks);
        automat.getDrink("Чай", 100, 70);



    }
    
}
