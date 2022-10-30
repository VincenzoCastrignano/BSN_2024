# Tuto Kotlin version BSN

## Partie Syntaxe

> Les fichiers Kotlin sont en `.kt` </br>
    Pas de `;` pour un retour à la ligne </br>
    Pas besoin de `new` pour créer un constructeur </br>
    Utiliser `$` pour appeler une variable

### *Pour commenter*

```kotlin
// Une seule ligne
/* Plusieurs
   Lignes */
```
### *Afficher une sortie dans la console*
```kotlin
print('Quelque chose')
println('Quelque chose avec un saut de ligne après')
```
---
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
---
## Partie Fonction ...

1. *Déclarer une fonction*
    ```kotlin
    fun non(arg1:Type, arg2:Type...) {
        Contenu de la fonc
    }
    ```
---
## Partie Déclaration (var etc...)

### Déclaration de variables

---

**Variable simple :**
```kotlin
var nom:type = valeur
``` 
---
**Variable constante :** 
```kotlin
val nom:type = valeur
```
## Partie condition
---
### *Exemple syntaxe du if*

```kotlin
if(condition) {
    //Ici si la condition est valide
    }
    else {
        // Sinon ici
    }
```
### *Exemple syntaxe du when*
```kotlin
when(condition) {
    // On passe ici
}
```
### *Exemple syntaxe du Do while*
```kotlin
Do{

}
while(condition)
```
---
## **A savoir**

La syntaxe pour les boucles *while* et *for* sont la même que pour le when

---
## Primitives utiles
### *`Readline()`*
*Explication* : A faire

## Changer le type d'une variable
    var nom_v = readline()!!.totypevariable()
# Conditions
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