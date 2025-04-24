package com.practica.genericas;


public class PosicionPersona {
    private Coordenada coordenada;
    private String documento;
    private FechaHora fechaPosicion;

    public PosicionPersona(String[] data) {
        this.documento = data[1];
        this.fechaPosicion = new FechaHora(data[2], data[3]);
        this.coordenada = new Coordenada(data[4],data[5]);
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public FechaHora getFechaPosicion() {
        return fechaPosicion;
    }

    public void setFechaPosicion(FechaHora fechaPosicion) {
        this.fechaPosicion = fechaPosicion;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += String.format("%s;", getDocumento());
        FechaHora fecha = getFechaPosicion();
        cadena += String.format("%02d/%02d/%04d;%02d:%02d;",
                fecha.getFecha().getDia(),
                fecha.getFecha().getMes(),
                fecha.getFecha().getAnio(),
                fecha.getHora().getHora(),
                fecha.getHora().getMinuto());
        cadena += String.format("%.4f;%.4f\n", getCoordenada().getLatitud(),
                getCoordenada().getLongitud());

        return cadena;
    }

}
