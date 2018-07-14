public class niveles {
    public String nivel;

    public String getNombre_nivel() {
        return nivel;
    }

    public void setNombre_nivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "niveles{" +
                "nivel='" + nivel + '\'' +
                '}';
    }
}
