public class Coffee {

    private final int milk;
    private final int water;
    private final int beans;

    Coffee(CoffeeMachine machine, int milk, int water, int beans){

        machine.milk.checkEnough(milk);
        machine.water.checkEnough(water);       // Проверка наличия достаточного кол-ва компонентов для кофе.
        machine.beans.checkEnough(beans);

        machine.milk.currentSize -= milk;
        machine.water.currentSize -= water;     // Отнятие определенного кол-ва компонентов из контейнеров.
        machine.beans.currentSize -= beans;

        this.milk = milk;
        this.water = water;                     // Присвоение определенных значений компонентов в кофе.
        this.beans = beans;

    }

    Coffee(){
        this.milk = 0;
        this.water = 0;                         // Конструктор по умолчанию, для возвращения пустой "кружки" кофе.
        this.beans = 0;
    }

    public String toString(){                   // Метод наглядной визуализации полученного кофе.
        if(milk == 0 || water == 0 || beans == 0){

            return "Refill Containers!";

        }
        return "Your coffee contains: " + milk + " ml. of milk " + water + " ml. of water " + beans + " gm. of beans! ";
    }
}
