package accesoaleatorio;

public class LugarTenerife {
    private String lugarTenerife;
    private StringBuilder formatearTexto;
    private int visitantes;
    private float capitalRecaudado;

    public LugarTenerife(String lugarTenerife, int visitantes, float capitalRecaudado) {
        this.formatearTexto = new StringBuilder(lugarTenerife);
        formatearTexto.setLength(10);
        lugarTenerife = formatearTexto.toString();
        this.visitantes = visitantes;
        this.capitalRecaudado = capitalRecaudado;
    }

    public String getLugarTenerife() {
        return lugarTenerife;
    }

    public void setLugarTenerife(String lugarTenerife) {
        this.lugarTenerife = lugarTenerife;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(int visitantes) {
        this.visitantes = visitantes;
    }

    public float getCapitalRecaudado() {
        return capitalRecaudado;
    }

    public void setCapitalRecaudado(float capitalRecaudado) {
        this.capitalRecaudado = capitalRecaudado;
    }
}
