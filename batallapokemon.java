package herencia;

/**
 *
 * @author Alumno-87
 */
public class Batallapokemon {
    public static main(String[]args){

        pokemonElectrico pokemon1 = new pokemonpsiquico("Raikou", 10, "Electrico");
        pokemonPsiquico pokemon2 = new pokemonPsiquico("MewTwo", 10, "Psiquico");
        
        Ataque(pokemon1, pokemon2, "Discharge");
        Ataque(pokemon2, pokemon1, "Onda mental");
        
        System.out.println(pokemon1.getNombre()+ "vida" + pokemon1.getHP() + "vida restante");
         System.out.println(pokemon2.getNombre()+ "vida" + pokemon2.getHP() + "vida restante");     
    }
    
}
