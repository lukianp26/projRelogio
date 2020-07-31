package projetoLuciano;

public class Relogio {

    public static void main(String[] args) {}

    private int hora, minuto, segundo;

    public Relogio(int h, int m, int s) {
        acertaHora(h, m, s);
    }

    public void incrementa()
   
     if(++segundo>59)
     {
        segundo = 0;
        if(++minuto>59)
        {
          minuto = 0;
          if(++hora>23)
            hora = 0;
        }
     }
   }

    public void decrementa() {
        if (--segundo < 0) {
            segundo = 59;
            if (--minuto < 0) {
                minuto = 59;
                if (--hora < 0)
                    hora = 23;
            }
        }
    }

    public void acertaHora(int h, int m, int s) {
        if (h >= 0 && h <= 23)
            hora = h;
        else
            hora = 0;
        if (m >= 0 && m <= 59)
            minuto = m;
        else
            minuto = 0;
        if (s >= 0 && s <= 59)
            segundo = s;
        else
            segundo = 0;
    }

    public String toString() {
        String str = "Hora atual: " + hora + ":" + minuto + ":" + segundo;
        return str;
    }

}

