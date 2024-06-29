
public class Cliente {
    
    private String nome;
    private String cpf;
    private String endereco;
    private double rendimentosMensais;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setRendimentosMensais(double rendimentosMensais) {
        this.rendimentosMensais = rendimentosMensais;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    // Construtor
    public Cliente(String nome, String cpf, String endereco, double rendimentosMensais, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.rendimentosMensais = rendimentosMensais;
        this.senha = senha;
    }
    // Criando um novo cliente



    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getRendimentosMensais() {
        return rendimentosMensais;
    }

    public String getSenha() {
        return senha;
    }
}





