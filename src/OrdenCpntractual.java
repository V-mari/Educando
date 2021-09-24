public class OrdenCpntractual {
    int codigoContractual;
    int nit;

    @Override
    public String toString() {
        return "OrdenCpntractual{" +
                "codigoContractual=" + codigoContractual +
                ", nit=" + nit +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", monto=" + monto +
                '}';
    }

    public OrdenCpntractual(int codigoContractual, int nit, String nombre, String fecha, int monto) {
        this.codigoContractual = codigoContractual;
        this.nit = nit;
        this.nombre = nombre;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getCodigoContractual() {
        return codigoContractual;
    }

    public void setCodigoContractual(int codigoContractual) {
        this.codigoContractual = codigoContractual;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    String nombre;
    String fecha;
    int monto;
}
