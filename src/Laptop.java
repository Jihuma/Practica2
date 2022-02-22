public class Laptop {

    public int tamaño;
    public String marca;
    public int almacenamiento;
    public String color;
    public int ram;

    public Laptop(){
        this.tamaño = 0;
        this.marca = "";
        this.almacenamiento = 0;
        this.color = "";
        this.ram = 0;
    }

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

    public int getAlmacenamiento(){
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }
}