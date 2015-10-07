public class TestMethodOverload {
  public static void main(String[] args) {
    // your code
  }

  public static int max(int i1,int i2) {
    if (i1 > i2)
      return i1;
    else
      return i2;
  }

  public static double max(double i1, double i2) {
    if (i1 > i2)
      return i1;
    else
      return i2;
  }

  public static double max(double i1, double i2), double i3) {
    return max(max(i1,i2),i3);
  }
}
