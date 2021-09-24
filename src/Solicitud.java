public class Solicitud {
    public Solicitud(String responsable, boolean autorisado, int numSoli, String fecha, String centroCosto, String rubro) {
        this.responsable = responsable;
        this.autorisado = autorisado;
        this.numSoli = numSoli;
        this.fecha = fecha;
        CentroCosto = centroCosto;
        Rubro = rubro;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "responsable='" + responsable + '\'' +
                ", autorisado=" + autorisado +
                ", numSoli=" + numSoli +
                ", fecha='" + fecha + '\'' +
                ", CentroCosto='" + CentroCosto + '\'' +
                ", Rubro='" + Rubro + '\'' +
                '}';
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isAutorisado() {
        return autorisado;
    }

    public void setAutorisado(boolean autorisado) {
        this.autorisado = autorisado;
    }

    public int getNumSoli() {
        return numSoli;
    }

    public void setNumSoli(int numSoli) {
        this.numSoli = numSoli;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCentroCosto() {
        return CentroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        CentroCosto = centroCosto;
    }

    public String getRubro() {
        return Rubro;
    }

    public void setRubro(String rubro) {
        Rubro = rubro;
    }

    String responsable;
    boolean autorisado;
    int numSoli;
    String fecha;
    String CentroCosto;
    String Rubro;
}
