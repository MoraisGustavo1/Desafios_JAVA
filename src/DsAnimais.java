public class DsAnimais {
    public static void main(String[] args) {

        Animal animal = new Cachorro("dogao", 3, "golden");

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.abanarRabo();
            cachorro.latir();
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}

class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println("To fazendo barulho!");
    }

    public void mover() {
        System.out.println("Sou um animal e estou me movendo!");
    }
}

class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void abanarRabo() {
        System.out.println("To abanando o rabo!!");
    }

    public void latir() {
        System.out.println("To latindo!");
    }
}
