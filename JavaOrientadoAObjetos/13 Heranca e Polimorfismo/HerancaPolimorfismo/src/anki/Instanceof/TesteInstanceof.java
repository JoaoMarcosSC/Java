package anki.Instanceof;

public class TesteInstanceof {
    public static void main(String[] args) {

        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        // Verificando o tipo com instanceof
        if (animal1 instanceof Cachorro) {
            System.out.println("animal1 é um Cachorro");
            Cachorro c = (Cachorro) animal1;
            c.latir();
        }

        if (animal2 instanceof Gato) {
            System.out.println("animal2 é um Gato");
            Gato g = (Gato) animal2;
            g.miar();
        }

        // Exemplos adicionais
        System.out.println(animal1 instanceof Animal);   // true
        System.out.println(animal1 instanceof Gato);     // false
    }
}
