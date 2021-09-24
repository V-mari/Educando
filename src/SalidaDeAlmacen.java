public class SalidaDeAlmacen {
    public SalidaDeAlmacen(int numsalida, String empleadoResponsable, String fechaSalida, String fechaEntregada) {
        this.numsalida = numsalida;
        EmpleadoResponsable = empleadoResponsable;
        FechaSalida = fechaSalida;
        FechaEntregada = fechaEntregada;
    }

    public int getNumsalida() {
        return numsalida;
    }

    @Override
    public String toString() {
        return "SalidaDeAlmacen{" +
                "numsalida=" + numsalida +
                ", EmpleadoResponsable='" + EmpleadoResponsable + '\'' +
                ", FechaSalida='" + FechaSalida + '\'' +
                ", FechaEntregada='" + FechaEntregada + '\'' +
                '}';
    }

    public void setNumsalida(int numsalida) {
        this.numsalida = numsalida;
    }

    public String getEmpleadoResponsable() {
        return EmpleadoResponsable;
    }

    public void setEmpleadoResponsable(String empleadoResponsable) {
        EmpleadoResponsable = empleadoResponsable;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        FechaSalida = fechaSalida;
    }

    public String getFechaEntregada() {
        return FechaEntregada;
    }

    public void setFechaEntregada(String fechaEntregada) {
        FechaEntregada = fechaEntregada;
    }

    int numsalida;
    String EmpleadoResponsable;
    String FechaSalida;
    String FechaEntregada;
}
