## Instanciation
### À faire
* La classe `InstanciationTest` est fournie et permet de tester le résultat attendu.
    * Les assertions `AssertThat(...).[...]` ne doivent pas être modifiées et le code doit se trouver avant ou après, en fonction de ce qui est demandé dans le TP.
* Créer une classe Card avec 4 attributs
  ```mermaid
  classDiagram
  class TradingCard {
    +String name
    +String type
    +String description
    +int damage
    +int healthPoints
    +int cost
  }
  ```
* Instancier 3 cartes différentes
    * Référencer carte magic
* Le test doit passer et