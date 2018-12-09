package Codigos;

public class Registrador {
    private Integer valor;
    private String nome;
    
    public Registrador() {};
    
    public Registrador(String nome){
        this.nome = nome;
    }
    
    
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
