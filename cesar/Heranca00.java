public class Heranca00 {
    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro("Afonso", "Vira lata", "Caramelo", 2);
        Cachorro cao2 = new Cachorro("Clóvis", "Shitzu", "Marrom", 4);
        Cachorro cao3 = new Cachorro("Juca", "Pastor Alemao", "Preto", 3);

        Gato gat1 = new Gato("Puma", "Persa", "Preto", 2);

        Cavalo cav1 = new Cavalo("Pé de pano", "Criolo", "Preto", 10);

        cao1.atraphalharSono();
        System.out.println(cao1);
        cao2.atraphalharSono();
        System.out.println(cao2);
        cao3.atraphalharSono();
        System.out.println(cao3);

        gat1.atraphalharSono();
        System.out.println(gat1);

        cav1.atraphalharSono();
        System.out.println(cav1);
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
    public Cachorro(String nome, String raca, String cor, int idade){ // metodo construtor, o que define o cão
        this.som = "au au au";
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
}
class Gato extends Animal{
    public Gato(String nome, String raca, String cor, int idade){ // metodo construtor, o que define o gato
        this.som = "miau miau";
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
}
class Cavalo extends Animal{
    public Cavalo(String nome, String raca, String cor, int idade){
        this.som = "ihohoho";
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }
}
