## Function

### On peut créer une function qui cherche une ID et ajoute un écouter de clic donc chaque fois qu'on clique sur le button toast, un bulle de texte qui contient "Hello Toast!" va s'afficher

    view.findViewById<Button>(R.id.toast_button).setOnClickListener {
    val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
    myToast.show()
    }

