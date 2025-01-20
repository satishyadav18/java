package pTwo;

import pOne.PackageOne;

public class PackageTwo extends PackageOne{
  public int b = 20;

  public void pTwoShow() {
    System.out.println(a);
    System.out.println(b);
    pOneShow();
  }
}