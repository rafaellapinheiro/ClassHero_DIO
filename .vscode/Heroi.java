

public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    // Construtor
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método para o ataque
    public void atacar() {
        if (tipo.equalsIgnoreCase("ninja")) {
            System.out.println("O " + tipo + " atacou usando shuriken");
        } else {
            System.out.println("O " + tipo + " atacou usando um ataque desconhecido");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}




