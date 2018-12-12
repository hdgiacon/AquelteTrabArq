package Codigos;

import java.util.ArrayList;

public class Instrução {
    private String nome;
    private Registrador registrador;
    private Integer numDeCiclos;

    
    public Instrução(){}
    
    public Instrução(Integer numDeCiclos){
        this.numDeCiclos = numDeCiclos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public Registrador getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Registrador registrador) {
        this.registrador = registrador;
    }

    public Integer getNumDeCiclos() {
        return numDeCiclos;
    }

    public void setNumDeCiclos(Integer numDeCiclos) {
        this.numDeCiclos = numDeCiclos;
    }
    
    public void move(Registrador r1, Integer valor){
               r1.setValor(valor);
               
    }
    
    public void move(Registrador regOrigem,Registrador regDestino,ArrayList<Registrador> listaRegistradores){
        regDestino.setValor(regOrigem.getValor());
    }

    public void add(Registrador regDestino, Registrador regA,Registrador regB) {
        regDestino.setValor(regA.getValor() + regB.getValor());
    }
    
    public void addi(Registrador regDestino,Registrador regA,Integer imediato){
        int a = regA.getValor();
        a += imediato;
        regDestino.setValor(a);
    }
    
    public void sub(Registrador regDestino, Registrador regA,Registrador regB) {
        regDestino.setValor(regA.getValor() - regB.getValor());
    }
    
    public void subi(Registrador regDestino,Registrador regA,Integer imediato){
        int a = regA.getValor();
        a -= imediato;
        regDestino.setValor(a);
    }
    
    public int jump(String codigo, String label){
        int tam = codigo.length();
        int tamAux;
        int cont = 0, k = 0, i = 0;
        Integer posLabel = null;
        char inst;
        String aux;
        while(i != tam){    //laço que percorre o código escrito pelo usuário para encontrar o label
            aux = codigo.substring(i, codigo.indexOf(" "));     //ex: mov x1, x2 aux irá receber mov
            tamAux = aux.length();      //tamAux armazena o número de caracteres percorridos para atualizar i
            if(label.compareTo(aux) == 0){      //compara aux com label
                i = i + tamAux;                 // atualiza i
                System.out.println("Label encontrado.");
                posLabel = i;                   //posLabel recebe a posição da string para o jump avançar 
            }
            else{
                i = i + tamAux;                 //atualiza i
                aux = codigo.substring(i, codigo.indexOf('\n'));        //avança para a proxima linha
                tamAux = aux.length();          //armazena valor para atualizar i
                i = i + tamAux;                 //atualiza i para avançar até a proxima linha
                inst = codigo.charAt(i);
                i++;                            //incrementa o i para ignorar caracter em branco do final de linha
            }
            
        }
        return posLabel;    
    }    
    
}
