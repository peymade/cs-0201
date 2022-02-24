public class ArrayEx {

  // Code mainly copied during class 2/24 Middlebury Data Structures
  public static void main(String[] args) {
    String[] songs = new String[1000];
    for (int i = 0; i < 1000; i++) {
      songs[i] = "Song #" + i;
    }

    System.out.println(songs[999]);
  }
}
