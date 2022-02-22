public class Televisor {

    public int tamaño;
    public String marca;
    public String tipo;
    public String color;
    public String resolucion;

    public Televisor(){
        this.tamaño = 0;
        this.marca = "";
        this.tipo = "";
        this.color = "";
        this.resolucion = "";
    }

    //public Televisor(int tamaño, String marca, String tipo, String color, String resolucion) {
    //    this.tamaño = tamaño;
    //    this.marca = marca;
    //    this.tipo = tipo;
    //    this.color = color;
    //    this.resolucion = resolucion;
    //}

    public int getTamaño(){
        return tamaño;
    }

    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getResolucion(){
        return resolucion;
    }

    public void setResolucion(String resolucion){
        this.resolucion = resolucion;
    }
}