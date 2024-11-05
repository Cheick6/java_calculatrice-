import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatriceSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Entrez le premier nombre : ");
            int valeur1 = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int valeur2 = scanner.nextInt();

            Nombre operande1 = new Nombre(valeur1);
            Nombre operande2 = new Nombre(valeur2);

            // Addition
            Operation addition = new Addition(operande1, operande2);
            System.out.println(addition + " = " + addition.valeur());

            // Soustraction
            Operation soustraction = new Soustraction(operande1, operande2);
            System.out.println(soustraction + " = " + soustraction.valeur());

            // Multiplication
            Operation multiplication = new Multiplication(operande1, operande2);
            System.out.println(multiplication + " = " + multiplication.valeur());

            // Division
            Operation division = new Division(operande1, operande2);
            System.out.println(division + " = " + division.valeur());

        } catch (InputMismatchException e) {
            System.out.println("Erreur : vous devez entrer un nombre entier valide.");
        
        } catch (ArithmeticException e) {
            // Gestion d'une erreur arithmétique, comme une division par zéro
            System.out.println("Erreur arithmétique lors de l'opération : " + e.getMessage());
        
        } catch (NullPointerException e) {
            // Gestion d'une erreur de pointeur null, au cas où un des objets soit null
            System.out.println("Erreur : une des valeurs est null. Détail : " + e.getMessage());
        
        } catch (Exception e) {
            // Gestion des autres erreurs générales
            System.out.println("Erreur inattendue : " + e.getMessage());
        
        } finally {
            scanner.close();
        }
    }
}