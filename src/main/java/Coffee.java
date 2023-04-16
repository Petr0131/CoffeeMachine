public class Coffee {

    private int milk;
    private int water;
    private int beans;

    Coffee(int milk, int water, int beans){
        this.milk = milk;
        this.water = water;
        this.beans = beans;
    }
    Coffee(){
        this.milk = 0;
        this.water = 0;
        this.beans = 0;
    }

    public String toString(){
        return "Your coffee contains: " + milk + " ml. of milk " + water + " ml. of water " + beans + " gm. of beans! ";
    }

}
