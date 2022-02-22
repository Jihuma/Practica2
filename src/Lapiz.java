public class Lapiz {

    public String color;
    public String marca;
    public String tipo;
    public String material;
    public int peso;

    public Lapiz(){
        this.color = "";
        this.marca = "";
        this.tipo = "";
        this.material = "";
        this.peso = 0;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
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

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }
}