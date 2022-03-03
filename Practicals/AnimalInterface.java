
// Some example code from class. Lightly modified.

import java.util.List;

import javax.xml.catalog.CatalogException;

class AnimalInterface {

  // Farm.animal
  public interface Animal {
    public String says();
  }

  public static class Dog implements Animal {
    @Override // This method is declared in a parent
    public String says() {
      return "Woof.";
    }
  }

  public static class Cow implements Animal {
    @Override
    public String says() {
      return "Moo";
    }
  }

  public static class Pig implements Animal {
    @Override
    public String says() {
      return "Oink";
    }
  }

  public static class Cat implements Animal {
    @Override
    public String says() {
      return "Meowww";
    }
  }

  public static void goodLoop() {
    List<Animal> occupants = List.of(new Pig(), new Cow(), new Cat(), new Dog());
    for (Animal a : occupants) {
      System.out.println(a.says());
    }
  }

  public static void badLoop() {
    List<?> anything = List.of(new Pig(), new Cow(), new Cat(), new Dog());
    for (Object o : anything) {
      if (o instanceof Dog) {
        Dog d = (Dog) o;
        System.out.println(d.says());
      }
      if (o instanceof Pig) {
        Pig p = (Pig) o;
        System.out.println(p.says());
      }
      if (o instanceof Cow) {
        Cow c = (Cow) o;
        System.out.println(c.says());
      }
      if (o instanceof Cat) {
        Cat s = (Cat) o;
        System.out.println(s.says());
      }
    }
  }

  public static void main(String[] args) {
    List<Object> anything = List.of(123, new Pig(), new Cow(), new Cat(), new Dog());
    for (Object g : anything) {
      // Is g an animal?
      if (g instanceof Animal) {
        // Casting: "promise" to Java that whatever is really an Animal.
        // crashes if not true
        Animal animal = (Animal) g;
        System.out.println(animal.says());
      } else {
        System.out.println(g + " is not an Animal.");
      }
    }

  }

}