public class ItemRecibido {
    public ItemRecibido(String nombre, int cantidadEntrega) {
        this.nombre = nombre;
        CantidadEntrega = cantidadEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Item Recibido{" +
                "nombre='" + nombre + '\'' +
                ", CantidadEntrega=" + CantidadEntrega +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEntrega() {
        return CantidadEntrega;
    }

    public void setCantidadEntrega(int cantidadEntrega) {
        CantidadEntrega = cantidadEntrega;
    }

    String nombre;
    int CantidadEntrega;
}
