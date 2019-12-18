package hollywood;

abstract class Celebrity {
  protected int value;

  Celebrity(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public void increaseValue(int amount) {
    this.value += amount;
  }
}
