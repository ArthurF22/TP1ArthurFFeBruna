/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquejava;

/**
 *
 * @author aluno
 */
class GatoJava {
    String raça;
    String name;
    int idade;
    boolean female;
    public GatoJava(String g) {
        this.name = g;
    }

    public void miau() {
        if (idade >= 3) {
            System.out.println("Miau");
        } else {
            System.out.println("niau");

        }

    }

    
}