## 3 uzdevums

### Nosacījumi:

Uzrakstīt programmu lineāra vienādojuma un kvadrātvienādojuma atrisināšanai.
Vienādojumu atrisināšanu realizēt ar vienu programmu

### Kods:

```java
import java.lang.Math;
import java.util.Scanner;

public class Main {

  public static void linear(Scanner in) {
    System.out.println("Linearais vienadojums (aX + b = 0)");

    System.out.print("a: ");
    String a = in.nextLine();

    System.out.print("b: ");
    String b = in.nextLine();

    in.close();

    int aInt = Integer.parseInt(a);
    int bInt = Integer.parseInt(b);

    float result = (0 - bInt) / aInt;

    System.out.println("Rezultats: " + result);
  }

  public static void square(Scanner in) {
    System.out.println("Kvadratvienadojums (aX^2 + bX + c = 0)");

    System.out.print("a: ");
    String a = in.nextLine();

    System.out.print("b: ");
    String b = in.nextLine();

    System.out.print("c: ");
    String c = in.nextLine();

    in.close();

    int aInt = Integer.parseInt(a);
    int bInt = Integer.parseInt(b);
    int cInt = Integer.parseInt(c);

    double D = Math.pow(bInt, 2) - (4 * aInt * cInt);

    System.out.println(D);

    if (D < 0) {
      System.out.println("Rezultats nav iespejams");
    } else if (D > 0) {
      double x1 = (Math.sqrt(D) - bInt) / (2 * aInt);
      double x2 = (- Math.sqrt(D) - bInt) / (2 * aInt);

      System.out.println("Saknes ir:");
      System.out.println("x1: " + x1);
      System.out.println("x2: " + x2);
    } else {
      double x = -bInt / (2 * aInt);
      System.out.println("Sakne ir:" + x);
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.println("Izvelieties vienadojumu: ");
    System.out.println("A - Linearais vienadojums");
    System.out.println("B - Kvadratvienadojums");

    String equation = in.nextLine();

    while (
      equation.toLowerCase().equals("a") && equation.toLowerCase().equals("b")
    ) {
      System.out.println("Meginiet velreiz");

      equation = in.nextLine();
    }

    if (equation.toLowerCase().equals("a")) {
      linear(in);
    } else {
      square(in);
    }
  }
}
```

### Rezultāts:

