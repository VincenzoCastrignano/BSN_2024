## Créer un string:

#### Dans chaque projet d'android studio, il y aura un répertoire "xml" dans "values" qui contient toute les variables déclarées

#### On peut declarér un string dans un ficher "strings.xml" qui aura tous les identifiant plus les valeurs de ces strings 
    
    <resources>
    <string name="hello_first_fragment">0</string>
    <string name="random_heading">Here is a random number between 0 and %d</string>
    <string name="toast_button_text">Toast</string>
    <string name="count_button_text">Count</string>
    </resources>

#### On peut donc les utiliser dans autre fichiers

    <TextView
        android:id="@+id/textview_header"
        android:text="@string/random_heading" ----
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:textColor="@android:color/black"
        android:textSize="24sp"
    />

#### Ce n'est pas que des string qu'on peut stocker, même des couleurs

    <resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="screenBackground">#2196F3</color>
    <color name="button_background">#BBDEFB</color>
    </resources>



