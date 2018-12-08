package Pacote1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {        
	ArrayList<Registrador> listaRegistradores = new ArrayList<Registrador>();
        /*
        for(int k = 1; k <= 32; k++){
            Registrador r = new Registrador("R"+k);
            listaRegistradores.add(r);
        }
        faz isso e depois fazemos uma busca pelo nome dos registradores que queremos e damos o set desejado no valor
        */
        /*TESTES INDIVIDUAIS
        Registrador r = new Registrador();
        Registrador r2 = new Registrador();
        r.setNome("r1");
        r.setValor(10);
        System.out.println("Nome: "+r.getNome()+"\n"+"Valor: "+r.getValor());
        r2.setNome("r2");
        r2.setValor(50);
        System.out.println("Nome: "+r2.getNome()+"\n"+"Valor: "+r2.getValor());
        
        Registrador r3 = new Registrador("r3");
        Instrução i = new Instrução(1);
        i.move(r3, 30);
        System.out.println("Nome: "+r3.getNome()+"\n"+"Valor: "+r3.getValor());
        i.add(r3, r, r2);
        System.out.println("\n \n ADD: ");
        System.out.println("Nome: "+r3.getNome()+"\n"+"Valor: "+r3.getValor());
        System.out.println("\n\n ADDi: ");
        i.addi(r3, r,2);
        System.out.println("Nome: "+r3.getNome()+"\n"+"Valor: "+r3.getValor());
        
        System.out.println("\n\nSUB: ");
        i.sub(r3, r2, r);
        System.out.println("Nome: "+r3.getNome()+"\n"+"Valor: "+r3.getValor());
        
        System.out.println("\n \n SUBi: ");
        i.subi(r3, r2, 10);
        System.out.println("Nome: "+r3.getNome()+"\n"+"Valor: "+r3.getValor());
        */
    }
}
