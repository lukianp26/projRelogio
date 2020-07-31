package projetoLuciano;

public class Relogio {

        private int hora, minuto, segundo;

        public Relogio(int hora, int minuto, int segundo)
        {

            this.hora    = hora;
            this.minuto  = minuto;
            this.segundo = segundo;
        }

        public String exibir(){
            return hora + ":" + minuto + ":" + segundo;
         }
        public int getHora(){
            return hora;

        }
        public int getMinuto(){
             return minuto;

    }
         public int getSegundo(){
             return segundo;
         }
        }
        
   