public class Aula02 {
    public static void main(String[] args) {
        Caramelo Afonso = new Caramelo();
        Shitzu Lulu = new Shitzu();
        Pintcher Bafome = new Pintcher();

        Afonso.atraphalharSono();
        Afonso.descrever();
        Lulu.atraphalharSono();
        Lulu.descrever();
        Bafome.atraphalharSono();
        Bafome.descrever();
    }
}

abstract class Animal{
    String som;
    String nome;
    String raca;
    String cor;
    int idade;

    public void atraphalharSono(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.som);
        }
    }
    public void descrever(){
        System.out.println(
            "Nome: " +this.nome + "\n" + 
            "Raca: " +this.raca + "\n" +
            "Cor: " +this.cor + "\n" +
            "Idade: " +this.idade + "\n");
    }
}
abstract class Cachorro extends Animal{
    public Cachorro(){
        this.som = "au au au";
    }
}

class Caramelo extends Cachorro{
    public Caramelo(){
        this.nome = "Afonso";
        this.raca = "vira lata";
        this.cor = "caramelo";
        this.idade = 2;
    }
}
class Shitzu extends Cachorro{
    public Shitzu(){
        this.nome = "Lulu";
        this.raca = "Shitzu";
        this.cor = "Marrom";
        this.idade = 1;
    }
}
class Pintcher extends Cachorro{
    public Pintcher(){
        this.nome = "Bafome";
        this.raca = "Pintcher";
        this.cor = "Marrom";
        this.idade = 2;
    }
}
