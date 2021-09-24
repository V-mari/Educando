public class Provedoor {
    public Provedoor(int codFactura, String bienes) {
        this.codFactura = codFactura;
        this.bienes = bienes;
    }

    @Override
    public String toString() {
        return "Provedor =>" +
                "cod Factura=>" + codFactura +
                ", bienes=>" + bienes + '\'' +
                '}';
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public String getBienes() {
        return bienes;
    }

    public void setBienes(String bienes) {
        this.bienes = bienes;
    }

    int codFactura;
    String bienes;
}
