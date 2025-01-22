public class CompoundInterest

{

    public static void main(String x[])

      {
          double p = Double.parseDouble(x[0]);
          double r = Double.parseDouble(x[1]);
          double t = Double.parseDouble(x[2]);
          double result = p * Math.pow((1+r/100),t)-p;
          System.out.printf("Compound interest:= %f", result);

      }

}