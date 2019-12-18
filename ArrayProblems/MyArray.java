import java.util.Arrays;

class MyArray {
  private int[] numbers;

  MyArray(int ... numbers) {
    this.numbers = numbers;
  }

  public int[] sumWithout() {
    int[] result = new int[this.numbers.length];
    // Implementation calculating the sum once
    int sum = 0;
    for(int number : numbers) {
      sum += number;
    }

    for(int i = 0; i < numbers.length; i++) {
      result[i] = sum - numbers[i];
    }
    return result;
  }

  public double product() {
    int result = 1;
    for(int num : numbers) {
      result *= num;
    }

    return result;
  }

  // This is honestly probably out of scope for the class and I should expect it
  // to be a wash

  public int productR() {
    return productR(this.numbers);
  }

  // This requires `copyOfRange` and is also definitely out of scope for the
  // class. Whoops. If someone has this, they cheated.
  public int productR(int[] numbers) {
    if(numbers.length == 0) {
      return 1;
    } else {
      int[] newArray = Arrays.copyOfRange(numbers, 1, numbers.length);
      return productR(newArray);
    }
  }
}
