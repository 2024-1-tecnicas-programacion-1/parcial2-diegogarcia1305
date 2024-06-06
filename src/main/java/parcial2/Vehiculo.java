package parcial2;
/* Complejidad: 0(1) complejidad constante*/
public class Vehiculo {
private String marca;
private String modelo;
private int año;

public Vehiculo(String marca, String modelo, int año) {
this.marca = marca;
this.modelo = modelo;
this.año = año;
}

public String imprimirInformacion() {
return marca + " " + modelo + " " + año;
}
public String getMarca() {
return marca;
}
public String getModelo() {
return modelo;    
}
public int getAño() {
return año;
}
public void setAño(int año){
this.año=año;
}
 public void setMarca(String marca) {
this.marca = marca;
 }
public void setModelo(String modelo) {
this.modelo = modelo;
}

}