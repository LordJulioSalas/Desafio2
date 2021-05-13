package desafio2.dominio;

import java.util.List;

public class Nomina {
    private List<Empleado> empleadolis;

    public void setEmpleadolis(List<Empleado> empleadolis) {
        this.empleadolis = empleadolis;
    }

    public List<Empleado> getEmpleadolis() {
        return empleadolis;

    }
    public void calcularNomina(){
        empleadolis.forEach(empleado -> {
            System.out.println("salario"+empleado.getNombre()+empleado.calcularSalario());
        });

    }
    public void  listarDirectos(){
        for (Empleado empleado: this.empleadolis){
            if (empleado instanceof Directo){
                System.out.println(empleado.getNombre());
            }
        }

    }
    public void listarFreelancer(){
        for (Empleado empleado: this.empleadolis){
            if (empleado instanceof Freelance){
                System.out.println(empleado.getNombre());
            }
        }

    }
    public void listarPromotores(){
        for (Empleado empleado:this.empleadolis){
            if (empleado instanceof Promotor){
                System.out.println(empleado.getNombre());
            }
        }

    }


}
