package taller3.televisores;

public class TV {
    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;
    static  int numTV;

    TV(Marca marca, boolean estado){
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        this.marca = marca;
        this.estado = estado;
    }
    /*Marca*/
    String getMarca(){
        return this.marca.getNombre();
    }
    void setMarca(Marca marca){
        this.marca = marca;
    }
    /*Control*/
    Control getControl(){
        return this.control;
    }
    void setControl(Control control){
        this.control = control;
    }
    /*Precio*/
    int getPrecio(){
        return this.precio;
    }
    void setPrecio(int precio) {
        this.precio = precio;
    }
    /*Voulmen*/
    int getVolumen() {
        return volumen;
    }
    void setVolumen(int volumen) {
        if (this.estado){
            if (volumen >= 0 && volumen <= 7){
                this.volumen = volumen;
            }
        }
    }
    void volumenUp(){
        if (this.estado){
            if (volumen < 7){
                this.volumen++;
            }
        }
    }
    void volumenlDown(){
        if (this.estado){
            if (volumen > 0){
                this.volumen--;
            }
        }
    }
    /*Canal*/
    int getCanal() {
        return canal;
    }
    void setCanal(int canal) {
        if (this.estado){
            if(canal >= 1 && canal <= 120){
                this.canal = canal;
            }
        }
    }
    void canalUp(){
        if (this.estado){
            if(this.canal < 120){
                this.canal++;
            }
        }
    }
    void canalDown(){
        if (this.estado){
            if (this.canal > 1){
                this.canal--;
            }
        }
    }
    /*Contador*/
    static int getNumTV() {
        return numTV;
    }
    /*Estado*/
    void turnOn() {
        this.estado = true;
    }
    void turnOff() {
        this.estado = false;
    }
    boolean getEstado(){
        return this.estado;
    }
}
