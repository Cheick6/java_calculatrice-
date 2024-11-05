/**classe addition qui hérite 
 * @author Cheick-Oumar
 */

public class Addition extends Operation{
/** 
 * C'est un constructeur qui permet d'initialiser les operandes 
 * @param operande1,operande2 : deux entiers
 * @return initialise les deux opérandes   
 */
    public Addition (Nombre operande1 , Nombre operande2){
        super (operande1, operande2);
    }

/** 
 * C'est une fonction qui permet de retourner la somme operandes mais elle n'a pas de param
 * @return getOperande1().valeur() + getOperande2().valeur();
 */
    public int valeur (){
         return getOperande1().valeur() + getOperande2().valeur();
    }
/** 
 * C'est une fonction qui retourne l'opération effectuée  
 * @return  getOperande1 ()+ "+" + getOperande2 ();
 */    
    public String toString (){
        return getOperande1 ()+ "+" + getOperande2 ();
    }
}