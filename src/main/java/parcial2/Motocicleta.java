package parcial2;

 /*Complejidad: 0(1) complejidad constante*/
public class Motocicleta extends Vehiculo {
private TipoMotocicleta tipoMotocicleta;

public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
super(marca, modelo, año);
this.tipoMotocicleta = tipoMotocicleta;
}

@Override
public String imprimirInformacion() {
return super.imprimirInformacion() + ", tipo de motocicleta: " + tipoMotocicleta;
}

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

}