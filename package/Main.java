
import pOne.PackageOne;
import pTwo.PackageTwo;

public class Main {
  public static void main(String[] args) {
    PackageOne p1 = new PackageOne();
    PackageTwo p2 = new PackageTwo();

    p1.pOneShow();
    System.out.println("---");
    p2.pTwoShow();
  }
}
