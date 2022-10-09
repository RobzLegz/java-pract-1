## 1 uzdevums

### Nosacījumi:

Izveidot programmu, kura ļauj noteikt 100 ģenerēto skaitļu pāra un nepāra skaitļu skaitu, summu
un vidējo vērtību

### Kods:

```java
import java.lang.Math;
import java.util.ArrayList;

public class Main {
  public static int totalNumbers = 100;

  public static boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    }

    return false;
  }

  public static ArrayList<Integer> genArr() {
    int min = 1;
    int max = 99;

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    int i = 0;

    while (i < totalNumbers) {
      i++;

      int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

      numbers.add(random_int);
    }

    return numbers;
  }

  public static void main(String args[]) {
    ArrayList<Integer> numbers = genArr();

    int oddSum = 0;
    int evenSum = 0;
    int evenNumbers = 0;
    int oddNumbers = 0;

    for (int i = 0; i < totalNumbers; i++) {
      int number = numbers.get(i);

      boolean even = isEven(number);

      if (even) {
        evenNumbers++;
        evenSum += number;
      } else {
        oddNumbers++;
        oddSum += number;
      }
    }

    int oddAvg = oddSum / totalNumbers;
    int evenAvg = evenSum / totalNumbers;

    System.out.println("Even numbers: ");
    System.out.println("Even number count: " + evenNumbers);
    System.out.println("Even sum: " + evenSum);
    System.out.println("Even average: " + evenAvg);

    System.out.println("");
    System.out.println("Odd numbers:");

    System.out.println("Odd number count: " + oddNumbers);
    System.out.println("Odd sum: " + oddSum);
    System.out.println("Odd average: " + oddAvg);
  }
}
```

### Rezultāts:

