public class Container {
    private int maxSize;
    private int currentSize;

    Container(int maxSize, int currentSize){
        this.maxSize = maxSize;
        this.currentSize = currentSize;
    }

  void addComponent(int size){
    if(currentSize + size > maxSize) {throw new IllegalArgumentException("Not enough space!");}
    this.currentSize += size;
  }
  void subtractComponent(int size){
      if(size > currentSize) {throw new IllegalArgumentException("Not enough component!");}
      this.currentSize -= size;
  }
}
