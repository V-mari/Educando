public class Factura {
    public Factura(int codFactura, int numFactura, String fecha, String provedoor, float totalBienes, float valorTotal) {
        this.codFactura = codFactura;
        this.numFactura = numFactura;
        this.fecha = fecha;
        Provedoor = provedoor;
        this.totalBienes = totalBienes;
        ValorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "> Factura < " +
                "> codigo Factura <=" + codFactura +
                "> num Factura <" + numFactura +
                "> fecha <" + fecha + '\'' +
                "> Provedoor <" + Provedoor + '\'' +
                "> total Bienes <" + totalBienes +
                "> ValorTotal <" + ValorTotal +
                '}';
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProvedoor() {
        return Provedoor;
    }

    public void setProvedoor(String provedoor) {
        Provedoor = provedoor;
    }

    public float getTotalBienes() {
        return totalBienes;
    }

    public void setTotalBienes(float totalBienes) {
        this.totalBienes = totalBienes;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }

    int codFactura;
    int numFactura;
    String fecha;
    String Provedoor;
    float totalBienes;
    float ValorTotal;
}
