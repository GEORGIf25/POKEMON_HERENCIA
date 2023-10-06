/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Alumno-87
 */
public class HERENCIA {
    private int HP;
    private int nivel;
    private String nombre;
    private String tipo;
    

    @Override
    public String toString() {
        return "HERENCIA{" + "HP=" + HP + ", nivel=" + nivel + ", nombre=" + nombre + ", tipo=" + tipo + '}';
        
    }

    public int getHP() {
        return HP;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

    public HERENCIA(int nivel, String nombre, String tipo) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.tipo = tipo;

    }
    private void calculaDanio(int danio) {
this.HP -= danio;
System.out.printf("%s recibe %d puntos de danio\n",
this.getNombre(), danio);
}
    public void recibirAtaque(String movimiento) {
System.out.printf("%s recibe ATK %s\n", this.getNombre(),
movimiento);
calculaDanio((int) Math.random() * 10 + 1);
}
    public void atacar(String movimiento, Pokemon pokemon) {
System.out.printf("%s ataca a %s con %s\n", this.getNombre(),
pokemon.getNombre(), movimiento);
pokemon.recibirAtaque(movimiento);
}
}


