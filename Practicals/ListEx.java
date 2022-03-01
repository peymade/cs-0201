import java.util.*;

public class ListEx {

  public static void main(String[] args) {

    List<Integer> xs = List.of(7, 3, 11);
    System.out.println(xs);
    xs.add(4);
    System.out.println(xs);

    List<String> songs = new ArrayList<>();
    songs.add("hi");
    songs.add("there");
    songs.add("is");
    songs.add("time");

    int x = 7;
    Integer x2 = null;
    Integer x3 = 7;
    char letter = 'X';
    Character letter2 = 'Z';

    String user = "17";
    int number = Integer.parseInt(user);

    Character.isDigit('&');

    List<Integer> welp = new ArrayList<>();

    xs.add(7);
    xs.add(3);
    xs.add(11);
    xs.add(null);

  }

}
