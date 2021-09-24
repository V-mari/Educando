public class Inventario {
    public Inventario(int codInv, String bienesRecibidos, String responsable, String fechaentregada, String ubicacion) {
        CodInv = codInv;
        BienesRecibidos = bienesRecibidos;
        Responsable = responsable;
        Fechaentregada = fechaentregada;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "> Inventario < " +
                ">Cod Inv <" + CodInv +
                " >BienesRecibidos<" + BienesRecibidos + '\'' +
                ">Responsable<" + Responsable + '\'' +
                ">Fechaentregada<" + Fechaentregada + '\'' +
                ">ubicacion<" + ubicacion + '\'' +
                '}';
    }

    int CodInv;

    public int getCodInv() {
        return CodInv;
    }

    public void setCodInv(int codInv) {
        CodInv = codInv;
    }

    public String getBienesRecibidos() {
        return BienesRecibidos;
    }

    public void setBienesRecibidos(String bienesRecibidos) {
        BienesRecibidos = bienesRecibidos;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public String getFechaentregada() {
        return Fechaentregada;
    }

    public void setFechaentregada(String fechaentregada) {
        Fechaentregada = fechaentregada;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    String BienesRecibidos;
    String Responsable;
    String Fechaentregada;
    String ubicacion;
}
