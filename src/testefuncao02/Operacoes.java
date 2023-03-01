/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author eduar
 */
public class Operacoes {
    //Se quiser o metodo main, é so apertar psvm e tab
     //criando um método.
    //posso deixar publico (public) ou private (privado) ou protegido (protected).
    //Quando usamos privete, podemos bloquear a execução do metodo.
    public static String contador(int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
    
    
}
