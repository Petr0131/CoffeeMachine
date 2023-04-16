public class CoffeeMachine {
    Container milk;
    Container water;
    Container beans;

    int maxCapacityMilkContainer = 500;
    int maxCapacityWaterContainer = 500;    // Максимальная вместительность контейнеров, определяется в ТХ кофемашины.
    int maxCapacityBeansContainer = 200;

    /**
     * CoffeeMachine - создает контейнера с изначально определенной, максимальной вместительностью.
     * @param currentVolumeMilk - текущий объем молока в контейнере.
     * @param currentVolumeWater - текущий объем воды в контейнере.
     * @param currentWeightBeans - текущая масса кофе бобов в контейнере.
     */
        CoffeeMachine(int currentVolumeMilk, int currentVolumeWater, int currentWeightBeans){
            milk = new Container(maxCapacityMilkContainer, currentVolumeMilk);
            water = new Container(maxCapacityWaterContainer, currentVolumeWater);
            beans = new Container(maxCapacityBeansContainer, currentWeightBeans);

            //HashMap<String, Container> dict = new HashMap<>();
            //dict.put("one", new Container(0,0));
        }

    /**
     * сreateCoffee - запускает создание единицы кофе по изначально известному рецепту.
     * @return - возвращает экземпляр кофе.
     */
    public Coffee createCoffee(){
            Coffee coffee;
            try {

                coffee = new Coffee(this, 50, 50, 20);

            } catch (Exception e){

                System.out.println(e.getMessage());
                return new Coffee();    // Возвращает пустую "кружку" кофе.

            }
            return coffee;              // Возвращает готовую "кружку" кофе.
        }
}
