# Notre Tuto Kotlin version BSN

## Partie Syntaxe ...

> Les fichiers Kotlin sont en `.kt` </br>
    Pas de `;` pour un retour à la ligne </br>
    Pas besoin de `new` pour créer un constructeur

## Liste des types de variable

* `Int` -> 12  
* `Double` -> 1,2  
* `Float` -> 1,2
* `Boolean` -> `True` ou `False`
* `Unit` -> Equivalent fonction void java
* `Long` -> Entier 64bits
* `Byte` -> Entier 8bits
* `String` -> "12"
* `Any` -> N'importe quelle valeur

## Partie Fonction ...

1. Déclarer une fonction
    ```kotlin
    fun non(arg1:Type, arg2:Type...) {
        Contenu de la fonc
    }
    ```

## Partie Déclaration (var etc...)

### Déclaration de variables

> Variable simple : 
```kotlin
var nom:type = valeur
``` 
> Variable constante : 
```kotlin
val nom:type = valeur
```

## Partie condition

# Affichage de texte
    println(""texte....")
# Changer le type d'une variable
    var nom_v = readline()!!.totypevariable()
# Conditions
    if(condition)
    {truc à faire...} 
        else 
            {autre truc...}

    when(condition){
        truc à faire}

    -While
    -Do{....}while(conditon)
    -for(compteur in 1..5) compteur de 1 à 5
    -for(compteur in 5 downTo 1) compteur de 5 a 1
    -for(compteur in 1..5 step 2) compteur de 1 à 5 mais en faisant +2 donc 1 3 5
# Entrer une donnée manuellement
    println("entrer votre nom:")
    val nom_v = readline()
    println("$nom_v")

# commenter
    //une ligne
    /*plusieurs lignes*/

# Fonctions
    fun nom_fonction() {
        traitement

    {
