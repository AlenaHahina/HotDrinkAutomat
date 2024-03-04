package DZ_Seminar1;

public class HotDrink extends Drink {
    private int t;

    public HotDrink(int t, String name, int volume) {
        super(name, volume);
        this.t=t;
        
    }
    
    public int getT() {
        return t;
    }
    @Override
    public String toString() {
        
        return "name: "+ name + ", volume: " + volume + ", t: " + t;
    }
    
    
}
