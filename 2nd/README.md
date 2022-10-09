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

