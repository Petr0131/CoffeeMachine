import org.junit.Test;

public class ContainerTest {

    @Test
    public void checkEnoughTest(){              // Тест проверки на достаточность компонента в контейнере.

        Container container = new Container(500, 50);
        container.checkEnough(50);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkEnoughExceptionTest(){     // Тест работы исключения.

        Container container = new Container(500, 0);
        container.checkEnough(50);

    }
}
