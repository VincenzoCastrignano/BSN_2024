## Function

### On peut créer une function qui cherche une ID et ajoute un écouter de clic donc chaque fois qu'on clique sur le button toast, un bulle de texte qui contient "Hello Toast!" va s'afficher

    view.findViewById<Button>(R.id.toast_button).setOnClickListener {
    val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
    myToast.show()
    }

<img src="https://user-images.githubusercontent.com/91130202/197954833-5ff29d4b-12ef-49a2-86a0-e5b7664cf099.png" width = 200 length=150>

## Pour créer une button qui va augmenter notre compteur par 1 à chaque fois qu'on le clique. 

### On commence en ajoutant un setOnClickListener
    view.findViewById<Buton>(R.id.count_button).setOnClickListener{
        countMe(view)
    }

### Ensuite on créer une function qui prends 'view' comme argument et s'est appeler qand on clique sur Count
    private fun countMe(view: View) {

    }
    
### On utilise 'findViewById()' pour prendre le text view qui affichera notre compteur, en suite on récupère la valeur du text view et on le converti en int plus on l'incrémente
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
<img src="https://user-images.githubusercontent.com/91130202/197971939-9d4c68d1-37a8-4826-ba90-e1ccbee2631f.png" length=300 width=300>
