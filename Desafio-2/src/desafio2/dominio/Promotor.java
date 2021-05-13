package desafio2.dominio;

public class Promotor extends Empleado {
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    protected long calcularSalario() {
        return this.valorVolante*this.volantesRepartidos+comprasVolante* 17000L;
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }


}
