package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    boolean estado;
    private int volumen;
    private Control control;
    private static  int numTV;

    public TV(Marca marca, boolean estado){
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }
    /*Marca*/
    public Marca getMarca(){
        return this.marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    /*Control*/
    public Control getControl(){
        return this.control;
    }
    public void setControl(Control control){
        this.control = control;
    }
    /*Precio*/
    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /*Volumen*/
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        if (this.estado){
            if (volumen >= 0 && volumen <= 7){
                this.volumen = volumen;
            }
        }
    }
    public void volumenUp(){
        if (this.estado){
            if (this.volumen < 7){
                this.volumen++;
            }
        }
    }
    public void volumenDown(){
        if (this.estado){
            if (this.volumen > 0){
                this.volumen--;
            }
        }
    }
    /*Canal*/
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if (this.estado){
            if(canal >= 1 && canal <= 120){
                this.canal = canal;
            }
        }
    }
    public void canalUp(){
        if (this.estado){
            if(this.canal < 120){
                this.canal++;
            }
        }
    }
    public void canalDown(){
        if (this.estado){
            if (this.canal > 1){
                this.canal--;
            }
        }
    }
    /*Contador*/
    public static int getNumTV() {
        return numTV;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    /*Estado*/
    public void turnOn() {
        this.estado = true;
    }
    public void turnOff() {
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
}
