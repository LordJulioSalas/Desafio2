package desafio2.dominio;

public class Vendedor extends Directo {
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }


    public long calcularComision(){
        long comision = super.getSalario();
        if (super.getSalario()<999999){
           comision = (long) (comision+comision*0.05);

        }else if( super.getSalario()>999999){
            comision =(long) (comision+comision*0.045);
        }
        return comision;

    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }


}

