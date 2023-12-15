public class Heranca00 {
    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro("Afonso");
        Cachorro cao2 = new Cachorro("Juca");
        Cachorro cao3 = new Cachorro("Fausto");

        cao1.atraphalharSono();
        System.out.println(cao1);
        cao2.atraphalharSono();
        System.out.println(cao2);
        cao3.atraphalharSono();
        System.out.println(cao3);
    }
}

abstract class Animal{
    String som;
    String nome;
    String raca;
    String cor;
    int idade;

    public void atraphalharSono(){
        for (int i = 0; i < 3; i++) {
            System.out.println(this.som);
        }
    }
    public String toString(){ // representa a classe atual em forma de string
        return "Nome: " + this.nome + "\n" +
            "Raca: " + this.raca + "\n" +
            "Cor: " + this.cor + "\n" +
            "Idade: " + this.idade + " anos \n" +
            "Onomatopeia: " + this.som + "\n";
    }
}
class Cachorro extends Animal{
    public Cachorro(String nome){ // metodo construtor, o que define o cão
        this.som = "au au au";
        this.nome = nome;
        this.raca = "vira lata";
        this.cor = "caramelo";
        this.idade = 2;
    }
}
