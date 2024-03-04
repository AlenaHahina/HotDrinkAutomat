package DZ_Seminar1;

import java.util.ArrayList;

class HotDrinkVendingMachine implements VendingMachine {
    private ArrayList<HotDrink> drinks;
    public void init(ArrayList<HotDrink> drinks){
        this.drinks = drinks;
    }
    
    public void getDrink(String name, int volume){
        for (int i = 0; i < drinks.size(); i++) {
            if(name.equals(drinks.get(i).getName())&& volume==drinks.get(i).getVolume()){
                System.out.println(drinks.get(i));
            }
            
        }
    }
    public void getDrink(String name, int volume, int t){
        for (int i = 0; i < drinks.size(); i++) {
            if(name.equals(drinks.get(i).getName())&& volume==drinks.get(i).getVolume()&& t==drinks.get(i).getT()){
                System.out.println(drinks.get(i));
            }
    }
}
}

