### Listes
Les listes nous permettent d'avoir un "conteneur" d'éléments qu'on peut facilement accéder.
Il en existe plusieurs types que vous verrez/utiliserez en temps et en heure. Leur comportement est très similaire.
Pour l'instant, nous allons nous intéresser plus particulièrement à l'`ArrayList` qui nous permet facilement de grouper des éléments.

##### Théorie
La différence entre un tableau (`Array`) et une `List`.
L'utilisation d'un tableau ou d'une liste, en java diffère beaucoup. Un tableau doit être instancié avec une taille maximale alors qu'une liste peut être créée sans en connaitre la taille finale. Cela nous permet plus de flexibilité lorsque nous n'avons pas l'information du nombre d'éléments à insérer.
Ceci dit, la `List` `ArrayList`, se base, comme son nom l'indique sur un tableau. C'est à dire qu'elle crée, sans qu'on le sache un tableau d'une taille fixe. Lorsque ce tableau atteint sa taille maximale et qu'on souhaite y ajouter un nouvel élément, la liste crée un nouveau tableau qui aura une plus grande taille et y copiera les valeurs de son précédent tableau. Cela pour que nous puissions continuer à y ajouter des éléments sans se poser de question.

Les ids d'une liste, comme ceux d'un `Array`, commencent à 0.

La classe `ArrayList` est une classe dites `Générique`. C'est à dire que nous pouvons lui spécifier le type des éléments qu'elle va contenir.
Par exemple, si on crée une `ArrayList` et qu'on veut qu'elle ne puisse contenir que des `int`, on le spécifiera ainsi: `ArrayList<int>`. De cette manière, à l'utilisation, on ne pourra pas y ajouter autre chose que des int. (l'IDE et le compilateur ne vont pas nous laisser faire).

La classe `ArrayList` contient beaucoup de méthodes utiles mais celles que vous serez le plus amener à utiliser sont les suivantes:
- `get(id)` permet de récupérer l'élément à l'id qu'on passe en paramètre.
- `add()` / `add(id, element)` permet d'ajouter un élément à la fin ou à l'id qu'on souhaite.
- `addAll()` Ajoute tous les élément d'une autre liste à celle-ci.
- `remove()` Enlève un élément passé en paramètre.
- `clear()` Vide complètement la liste.
- `contains()` Vérifie si l'élément passé en paramètre existe dans la liste.
- `sort()` Trie la liste selon l'ordre de base.
- `size()` Retourne le nombre d'éléments dans une liste
- `isEmpty()` Retourne `true` si la liste est vide, `false` sinon.
- `forEach()` Permet de boucler sur tous les éléments de la liste.

##### À faire
La classe `src/test/ListTest.java` contient quelques tests, vous devez faire compiler la classe, pour cela, vous pouvez procéder par étape. \
Premièrement, commentez tous les tests sauf le premier, faites le fonctionner, puis procédez de manière identique pour les suivants. \
Ce sont des exercices simple pour comprendre le fonctionnement basique des listes.
