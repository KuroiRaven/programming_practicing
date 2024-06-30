### Boucles
##### Théorie
Les boucles nous permettent d'effectuer des comportements plusieurs fois. Par exemple, on peut vouloir parcourir l'entièreté d'une liste et effectuer un bout de code pour chacun des éléments présents.

Pour cela, nous avons plusieurs options
- `for()` la boucle la plus simple et qui a le moins de risque de tourner à l'infini.
  Elle se divise en trois partie `for(déclaration; condition de continuation; incrément)`
  ```Java
  for(int i=0; i<5; i++) {
    System.out.println("Nous en sommes au tour de boucle: " + i);
  }
  /* Expected output
    Nous en sommes au tour de boucle: 0
    Nous en sommes au tour de boucle: 1
    Nous en sommes au tour de boucle: 2
    Nous en sommes au tour de boucle: 3
    Nous en sommes au tour de boucle: 4
  */
  ```
  Pour l'exemple, on démarre toujours à 0 mais on pourrait très bien commencer à 3.
- `while()` une boucle un poil plus compliquée puisqu'elle demande à l'utilisateur de bien contrôler son flux, au risque de tourner indéfiniement.
  Elle se déclare comme suit `while(condition de continuation)` pour l'utiliser, il nous faut donc ajouter la déclaration de notre variable en dessus et ne pas oublier de l'incrémenter dans la boucle.
  ```Java
  int i = 0;
  while(i<5) {
    System.out.println("Nous en sommes au tour de boucle: " + i);
    i = i-1;
  }
  /* Expected result is the same as for */
  ```
- `do{...}while()` Même principe que le while mais avec une syntaxe légèrement différente. Elle est très peu utilisée.
  ```Java
  int i = 0;
  do {
    System.out.println("Nous en sommes au tour de boucle: " + i);
    i = i-1;
  } while(i < 5);
  ```
- `iterator` les itérateurs permettent de faire des boucles beaucoup plus simple. Ce sont des éléments qui ont une méthode `hasNext()` et une méthode `next()` qui permettent d'être utilisés en conjonction avec la boucle `while`.
    ```Java
    Iterator<int> elements;
    while(elements.hasNext()) {
        String element = elements.next();
        System.out.println(element);
    }
    ```
  Cette boucle utilise donc le while tout en restant très safe puisqu'on se base sur la méthode `hasNext()` de notre itérateur qui nous retournera toujours `false`un jour et nous permettra donc de sortir de la boucle et continuer le fonctionnement normal de notre programme.
- `for-Each()` Cette boucle, est souvent utilisée en conjonction avec une liste. Elle permet d'en parcourir tous les éléments sans avoir besoin de spécifier une variable qui nous servira d'id.
  ```Java
  ArrayList<int> numbers = new ArrayList<>();
  numbers.add(1);
  numbers.add(2);
  numbers.add(3);
  numbers.add(4);
  numbers.add(5);

  for(int number: numbers) {
    System.out.println(number);
  }

  /* Expected output :
  1
  2
  3
  4
  5
  */
  ```
  Une liste contient d'ailleurs un équivalent à cette manière de faire : `myList.forEach()`.
  L'utilisation est la suivante
  ```Java
  ArrayList<int> numbers = new ArrayList<>();
  numbers.add(1);
  numbers.add(2);
  numbers.add(3);
  numbers.add(4);
  numbers.add(5);

  numbers.forEach(number -> {
    System.out.println(number);
  });

  /*Expected output -> Same as previous*/
  ```