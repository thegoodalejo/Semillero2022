public class Cafe {
    public int agua;
    public int leche;
    public String vaso;
    public int precio;
    public String tipo;
    public String tamaño;

    //DEFINO EL CONSTRUCTOR
       public Cafe(int agua, int leche, int precio, String tipo, String tamaño){
            this.agua = agua;
            this.leche = leche;
            this.precio = precio;
            this.tipo = tipo;
            this.tamaño = tamaño;
       }
       @Override
       public String toString() {
           return "agua:"+ agua + " ml" + ", leche: "+ leche +" ml"+ ", vaso: " + vaso  +
                ",precio: "+"$" + precio + ", tipo: " + tipo  + ", tamaño: " + tamaño;
       }
}



