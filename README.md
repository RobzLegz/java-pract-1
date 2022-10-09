# Java praktiskie uzdevumi

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
![image](https://user-images.githubusercontent.com/62758448/194777509-0489d778-cb33-43fd-9821-e374cad39220.png)


## 2 uzdevums

### Nosacījumi:

Sastādīt programmu, kura aprēķina banka klienta naudas daudzumu, tas ir, klients ielicis bankā N
EUR uz P procentiem gadā (P ir saliktā procentu likme) un uz G gadiem, bet programma aprēķina, cik
klientam ir bankā nauda pēc G gadiem

### Kods:

```java
import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static int toInt(String parse) {
    return Integer.parseInt(parse);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.println("Noguldījums: ");
    String Nstr = in.nextLine();
    System.out.println("Gadu skaits: ");
    String Pstr = in.nextLine();
    System.out.println("Procentu likme: ");
    String Istr = in.nextLine();

    in.close();

    int N = toInt(Nstr);
    int P = toInt(Pstr);
    int I = toInt(Istr);

    int corI = 1 + I;

    double powe = Math.pow(corI, P);

    double S = N * powe;

    System.out.println(S);
  }
}
```

### Rezultāts:
![image](https://user-images.githubusercontent.com/62758448/194777553-02e6d57c-aaa0-4298-8cac-a9a9ccc3cd43.png)


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
![image](https://user-images.githubusercontent.com/62758448/194777591-99a4aa97-10a2-4cd2-95d9-5a58c6b7c423.png)

