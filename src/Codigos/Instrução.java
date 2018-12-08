package Pacote1;

import java.util.ArrayList;

public class Instrução {
    private Registrador registrador;
    private Integer numDeCiclos;

    
    public Instrução(){}
    
    public Instrução(Integer numDeCiclos){
        this.numDeCiclos = numDeCiclos;
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
    
    public void move(Registrador r1, Integer valor/*ArrayList<Registrador> listaRegistradores*/){
        //for(Registrador r : listaRegistradores){
           // if(r.getNome().equals(r1.getNome())){
               // r.setValor(valor);
               r1.setValor(valor);
               System.out.println("Valor setado");
            //}
        //}
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
    
    
}
