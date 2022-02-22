public class Bombilla {

    public String tamaño;
    public int potencia;
    public String tipo;
    public String color;
    public String estado;

    public Bombilla(){
        this.tamaño = "";
        this.potencia = 0;
        this.tipo = "";
        this.color = "";
        this.estado = "";
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
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

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
}