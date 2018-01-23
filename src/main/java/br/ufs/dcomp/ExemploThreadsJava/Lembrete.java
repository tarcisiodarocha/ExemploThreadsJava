package br.ufs.dcomp.ExemploThreadsJava;

/**
 * 
 *
 */
public class Lembrete extends Thread 
{
    private String nome;
    private int intervalo;
    private int total;
    
    public Lembrete(String nome, int intervalo, int total)
    {
        this.nome = nome;
        this.intervalo = intervalo;
        this.total = total;
    }
    
    public void run(){
        try{
        for (int i = 1; i <= total; i++){
            System.out.println("Tomar "+ nome + " "+i);
            Thread.sleep(1000*intervalo);
        }
        } catch (Exception e){
            
        }
    }
}
