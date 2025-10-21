/*
*  Todo construtor deve ser sempre public.
*  Todo construtor terá o nome da classe.
*/

package _11construtor;

public class Media {

    // Primeiro Construtor
    public Media(){
        System.out.println("Olá Média!");
    }

    // Segundo Construtor
    public Media(double n1, double n2){
        System.out.println("A média é: " + (n1 + n2) / 2);
    }
}
