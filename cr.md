# Table unique (Single Table) :

Cette stratégie consiste à stocker toutes les données des classes héritées dans une seule table. Il y a généralement une colonne supplémentaire pour indiquer le type de chaque enregistrement.
## Avantages :
- Simple à mettre en œuvre.
- Performant pour les requêtes de sélection, car toutes les données sont dans une seule table.

## Inconvénients :
- Peut entraîner une surcharge de la table avec des colonnes spécifiques à une sous-classe, ce qui peut gaspiller de l'espace.
- Peut entraîner des problèmes de performances lorsque la table devient très grande.

# Table de jointure (Joined Table) :

Cette stratégie crée une table distincte pour chaque classe dans la hiérarchie d'héritage. Les données communes sont stockées dans la table parente, tandis que les données spécifiques à chaque sous-classe sont stockées dans des tables enfants.
## Avantages :
- Évite la redondance des données.
- Évite la surcharge des colonnes dans une seule table.

## Inconvénients :
- Peut entraîner des performances légèrement inférieures en raison de la nécessité de joindre plusieurs tables pour récupérer toutes les données.

# Une table par classe (Table per Class) :

Cette stratégie crée une table distincte pour chaque classe dans la hiérarchie d'héritage, et chaque table contient toutes les données de la classe correspondante.
## Avantages :
- Évite la redondance des données.
- Évite la surcharge des colonnes dans une seule table.

## Inconvénients :
- Peut entraîner une duplication des colonnes communes si les classes partagent des attributs.

# Exo 2
### Choix du mode:
Après hésitation entre une table jointure et une table par classe fille, mon choix s'est porté
sur:
* Une table par classe, car:
  * simplicité d'implémentation
  * les classes Manager et Developpeur ne partagent pas des attributs communs. 
  * Sans compter les avantages cités au-dessus.