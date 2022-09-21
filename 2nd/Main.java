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
