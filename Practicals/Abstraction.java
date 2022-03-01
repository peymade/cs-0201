import java.util.*;

public class Abstraction {

  public static double mean(List<Double> numbers) {
    double sum = 0.0;
    for (Double x : numbers) {
      numbers.remove(x);
      sum += x;
    }

    return sum / numbers.size();
  }

  // all sorts of abstractions ... smede

  public static boolean isPositive(int x) {
    if (x < 0) {
      return true;
    } else {
      return false;
    }
  }

  public interface Noisemaker {
    public void makeNoise();
  }

  public abstract class AbstractNoise {
    public abstract String getSound();

    public void printSound() {
      System.out.println(this.getSound());
    }
  }

  public class Bell extends AbstractNoise implements Noisemaker {
    @Override
    public void makeNoise() {
      this.printSound();
    }

    @Override
    public String getSound() {
      return "ring";
    }
  }

}
