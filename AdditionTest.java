import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Classe de test pour Addition
public class AdditionTest {

    private Nombre operande1;
    private Nombre operande2;
    private Addition addition;

    @BeforeEach
    public void setUp() {
        operande1 = new Nombre(3); // On suppose que Nombre a un constructeur qui prend un entier
        operande2 = new Nombre(5);
        addition = new Addition(operande1, operande2);
    }

    @Test
    public void testConstructeur() {
        // Test si le constructeur initialise correctement les opérandes
        assertEquals(operande1, addition.getOperande1(), "L'opérande 1 n'est pas initialisé correctement.");
        assertEquals(operande2, addition.getOperande2(), "L'opérande 2 n'est pas initialisé correctement.");
    }

    @Test
    public void testValeur() {
        // Test de la méthode valeur
        int resultatAttendu = 3 + 5;
        assertEquals(resultatAttendu, addition.valeur(), "La méthode valeur ne retourne pas la somme correcte des opérandes.");
    }

    @Test
    public void testToString() {
        // Test de la méthode toString
        String resultatAttendu = operande1 + "+" + operande2;
        assertEquals(resultatAttendu, addition.toString(), "La méthode toString ne retourne pas la chaîne correcte.");
    }
}
