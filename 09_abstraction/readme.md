#### Abstraction
Cette section est plus une théorie qu'un TP.
Dans le TP précédent (Héritage), vous vous êtes peut-être rendu compte qu'on pouvait, selon le diagramme, instancier une TradingCard.
Dans notre exemple, cela ne fait que peu de sens. On voudrait toujours avoir un type spécifique (Spell, Creature, etc.)
De fait, nous pouvons utiliser le mot clef `abstract` pour informer l'utilisateur de notre code qu'il n'est pas possible d'`instancier` une `TradingCard`.

Que nous permet le mot clef `abstract` ?
- Sur une classe, il nous permet d'empêcher l'instanciation de la classe celle-ci.
- Définir un nombre de comportement par défaut et comme une `Interface`, des méthode qui doivent être implémentées par les classe héritant de notre classe abstraite. \
  Par exemple, notre `TradingCard` pourrait avoir une méthode `playCard()` qu'on veut retrouver dans les classe "enfant".
  Pour cela, on déclare notre classe comme suit : `public abstract TradingCard` et on marque la méthode comme étant abstraite. `public abstract void playCard();`
  Cela va indiquer à l'IDE ou au compilateur que les enfants de cette classe se doivent de définir le comportement de la méthode abstraite.