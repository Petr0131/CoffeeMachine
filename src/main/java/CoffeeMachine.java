public class CoffeeMachine {
    Container milk;
    Container water;
    Container beans;

        CoffeeMachine(){
            milk = new Container(500, 500);
            water = new Container(500, 500);
            beans = new Container(200, 200);
        }
        public static Coffee createCoffee(){
            Coffee coffee = new Coffee(50, 50, 20);
            try {
                milk.subtractComponent(50);
                water.subtractComponent(50);
                beans.subtractComponent(50);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            return coffee;
        }
}
