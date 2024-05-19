import java.time.LocalDateTime;

public class Conversion {

    private String monedaBase;
    private String monedaObjetivo;
    private Double cantidadACambiar;
    private Double cantidadEnMonedaObjetivo;
    private LocalDateTime tiempo;


    public Conversion(String monedaObjetivo, String monedaBase, Double cantidadACambiar, Double cantidadEnMonedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
        this.monedaBase = monedaBase;
        this.cantidadACambiar = cantidadACambiar;
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
        this.tiempo = LocalDateTime.now();
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public Double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(String monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    public Double getCantidadEnMonedaObjetivo() {
        return cantidadEnMonedaObjetivo;
    }

    public void setCantidadEnMonedaObjetivo(Double cantidadEnMonedaObjetivo) {
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }
}
