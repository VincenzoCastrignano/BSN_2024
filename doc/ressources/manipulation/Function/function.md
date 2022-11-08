## Function

### On peut créer une function qui cherche une ID et ajoute un écouter de clic donc chaque fois qu'on clique sur le button toast, un bulle de texte qui contient "Hello Toast!" va s'afficher

#### FindViewById<interface: button, text etcc..>(R.id.'id de l'interface') est utilisé pour rechercher spécifiquement un identifiant de quelque chose sur l'interface

    view.findViewById<Button>(R.id.toast_button)
    
##### .setOnClickListerner est utiliser pour verifier s'il a été cliqué sur l'écran

     view.findViewById<Button>(R.id.toast_button).setOnClickListener
     
#### makeText(context, 'contenu', nom_du_text.LENGTH_SHORT) est pour créer du text
    val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)

#### Voiçi le résultat final
    view.findViewById<Button>(R.id.toast_button).setOnClickListener {
    val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
    myToast.show()
    }

## Pour créer une button qui va augmenter notre compteur par 1 à chaque fois qu'on le clique. 

### On commence en ajoutant un setOnClickListener
    view.findViewById<Buton>(R.id.count_button).setOnClickListener{
        countMe(view)
    }

### Ensuite on créer une function qui prends 'view' comme argument et s'est appeler quand on clique sur Count
    private fun countMe(view: View) {

    }
    
### On utilise 'findViewById()' pour prendre le text view qui affichera notre compteur, en suite on récupère la valeur du text view et on le converti en int plus on l'incrémente
#### variable.text.toString() pour convertir la valeur du text en string
#### variableString.toInt() pour convertir string en int
    val showCountTextView = view.findViewById<TextView>(R.id.textview_first)
    val countString = showCountTextView.text.toString()
    var count = countString.toInt()
    count++
    
### On affiche la nouvelle valeur en définissant la propriété de 'text' dans TextView
    showCountTextView.text = count.toString()
    
### La function entière devrait rensemblait à ceci
    private fun countMe(view: View) {
        val showCountTextView = view.findViewById<TextView>(R.id.textview_first)

        val countString = showCountTextView.text.toString()

        var count = countString.toInt()
        count++

        showCountTextView.text = count.toString()
    }

