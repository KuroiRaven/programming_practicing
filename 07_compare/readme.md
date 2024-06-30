#### CompareTo
Ce TP, a pour but de bien comprendre le fonctionnement de la méthode `compareTo` et comment elle peut être utilisée pour trier une liste, par exemple. \

##### Théorie
La méthode `compareTo(...)` retourne un `int`. Cet int va déterminer l'ordre dans lequel les deux éléments comparés doivent être mis.\
###### Exemple:
- `cardA.compareTo(cardB)` *retourne* `-1` => La carte A doit venir **avant** la carte B
- `cardA.compareTo(cardB)` *retourne* `0` => La carte A et la carte B on **un niveau d'ordre équivalent**
- `cardA.compareTo(cardB)` *retourne* `1` => La carte A doit venir **après** la carte B

##### Informations
Pour une collection de cartes, on peut la trier selon plusieurs critères: `Rareté`, `Coûts`, etc. \
Pour ce TP, nous décidons de trier nos carte d'une seule manière: Selon l'identifiant unique de la carte.
Pour cela, la classe `TradingCard` a déjà été créée et il ne vous reste qu'à y **implémenter** la méthode `compareTo` afin que les tests correspondants passent.

##### Règles de gestion
L'ordre de base des cartes doit être selon leur id, du plus petit au plus grand.

##### À faire
- Implémenter la méthode `compareTo` dans la classe `TradingCard`
- Compléter le code du test "should be sorted" pour que la liste de carte soit remplie
- Trier la liste selon la règle de gestion ci-dessus.

##### Bonus
Comme des éléments peuvent être triés selon différents critères, il peut être intéressant de proposer plusieurs tris et donc d'implémenter différentes façons de trier. \
Ce que vous pouvez faire, c'est de commenter votre première méthode de comparaison et d'en créer une nouvelle qui suivra la règle de gestion suivante: \
- Les cartes doivent être triées selon leur rareté. De la moin rare à la plus rare.
- Pour l'exemple, les raretés possible sont les suivantes:
  - Common
  - Rare
  - Epic

Comme pour l'exercice de base, la classe `BonusComparisonTest` a déjà les tests implémentés et vous n'avez plus qu'à les jouer pour vérifier que votre algorithme est fonctionnel.