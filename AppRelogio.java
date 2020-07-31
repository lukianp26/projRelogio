package projetoLuciano;

public class AppRelogio {

    public static void main(String[] args) {
        
        Relogio relogio = new Relogio(5, 37, 12);

        System.out.println(relogio.exibir());

        System.out.println("Horal atiual: " + relogio.getHora());
    }
    
}