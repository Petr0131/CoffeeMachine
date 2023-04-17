public class Container {
    final int maxSize;
    int currentSize;

    Container(int maxSize, int currentSize){
        this.maxSize = maxSize;
        this.currentSize = currentSize;
    }

    /**
     * checkEnough - проверяет достаточно ли компонентов в контейнере.
     * @param size - несет значение компонента на единицу кофе.
     */
    void checkEnough (int size){
        if(currentSize < size){

            throw new IllegalArgumentException("Not enough component!");

        }
    }
}
