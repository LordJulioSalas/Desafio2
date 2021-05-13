package desafio2.dominio;

public class Directo extends Empleado {
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    protected long calcularSalario() {
        this.salario = (this.salario)-calcularSalud()-calcularPension();
        return salario;
    }
    public long calcularSalud(){
        this.salario = (long) (salario*0.07);
        return salario;
    }
    public long calcularPension(){
       return (long) (this.salario*0.065);

    }


    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }


}
