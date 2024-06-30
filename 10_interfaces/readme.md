#### Interface
Ce TP permet de se rendre compte de l'utilité des interface dans la programmation moderne.

##### Théorie
Une interface est un "modèle" dans lequel nous définissons les méthodes que nous voulons voir disponible sur un objet. Les méthodes sont de base définies comme étant `public` et nous n'avons donc pas besoin de le re-préciser lorsque nous déclarons une interface.
```Java
public interface CanMakeSound {
    void makeSound();
}
```
Une interface n'est utile que si elle est `implémentée` par une classe. Elle nous permet de créer des algorithme qui ne se reposent pas uniquement sur des objets mais plus sur des mécanismes (CanMakeSound, CanWalk, etc.).

L'interface présentée ci-dessus nous permet de nous abstraire complètement de la d'héritage.
Par exemple, dans la vie de tous les jours, nous savons qu'un téléphone peut faire un bruit mais qu'un chat ou encore une voiture peuvent, eux-aussi, faire un bruit.

En suivant cette logique, on peut donc facilement faire "faire un bruit" à différents objets.
Exemple:
```Java
public class Cat implements CanMakeSound {
    // Contenu propre au chat
    // ...
    public void makeSound() {
        System.out.printLn("Meow");
    }
}

public class Car implements CanMakeSound {
    // Contenu propre à la voiture
    // ...
    public void makeSound() {
        System.out.printLn("Vroom");
    }
}

public class Phone implements CanMakeSound {
    // Contenu propre à l'animal
    // ...
    public void makeSound() {
        System.out.printLn("Ring ring...");
    }
}

```

Cela nous permet donc d'avoir une `List<CanMakeSound>` et de la parcourir en sachant que nous pourrons, sans problème, accéder à la méthode `makeSound()` pour chaque élément présent dans cette liste.

```Java
List<CanMakeSound> noisy = new ArrayList<>();

noisy.add(new Cat());
noisy.add(new Car());
noisy.add(new Phone());

noisy.forEach(element -> element.canMakeSound());

// Expected output:
// Meow
// Vroom
// Ring ring...
```

##### À faire
- Créer l'interface `Alive`
- Créer l'interface `CanDamage`
- Créer la classe `Player` qui doit `implémenter` l'interface `Alive`
- Créer la classe `TradingCard` qui doit `implémenter` `Alive` ainsi que `CanDamage`
- Créer la classe `PlayerSpell` qui doit implémenter `CanDamage`
  ```mermaid
  classDiagram
  Player <|-- Alive
  TradingCard <|-- Alive
  TradingCard <|-- CanDamage
  PlayerSpell <|-- CanDamage

  class CanDamage
  <<Interface>> CanDamage
  CanDamage : damage(Player target, int damage)

  class Alive
  <<Interface>> Alive
  Alive : takeDamage(int damage)

  class Player {
    - int currentHealthPoint
    - int maxHealthPoint
  }

  class TradingCard {
    - int currentHealthPoint
    - int maxHealthPoint
    - int damage
  }

  class PlayerSpell {
    - int damage
  }
  ```
- Compléter la classe `InterfaceTest` pour la faire compiler et que les tests qu'elle comprends passent tous.

