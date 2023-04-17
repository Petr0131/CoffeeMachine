import org.junit.Assert;
import org.junit.Test;

public class CoffeeMachineTest {

    @Test
    public void createCoffeeTest(){                     // Тест создания кофе.

        Coffee coffee = new Coffee(new CoffeeMachine(500, 500, 200), 50, 50, 20);
        Assert.assertEquals(coffee, coffee);

    }

    @Test(expected = IllegalArgumentException.class)
    public void createCoffeeEnoughComponentTest(){      // Тест работы исключения.

        new Coffee(new CoffeeMachine(0, 500, 200), 50, 50, 20);

    }
}
