public class CoffeeMachine {
    Container milk;
    Container water;
    Container beans;

        CoffeeMachine(){
            milk = new Container(500, 500);
            water = new Container(500, 500);
            beans = new Container(200, 200);
        }

        public Coffee createCoffee(){
            Coffee coffee;
            try {
                milk.subtractComponent(50);
                water.subtractComponent(50);
                beans.subtractComponent(50);
                coffee = new Coffee(50, 50, 20);
            } catch (Exception e){
                System.out.println(e.getMessage());
                return new Coffee();
            }
            return coffee;
        }
}
