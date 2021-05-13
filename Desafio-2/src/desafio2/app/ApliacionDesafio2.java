package desafio2.app;

import desafio2.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class ApliacionDesafio2 {

    public static void main(String[] args) {
        List<Empleado> listaempleado = new ArrayList<>();
        Nomina nomina = new Nomina();

        Empleado freelancer = new Freelance("Johanna",76000,85);
        Empleado freelancer1 = new Freelance("Gustavo",52500,60);
        Empleado directo = new Directo("David",289500);
        Empleado promotor = new Promotor("Pedro",1500,250,48);
        Empleado vendedor = new Vendedor("Julian",245000,55510000);
        Empleado directo1 = new Directo("Juan",5360000);
        Empleado vendedor1= new Vendedor("Carolina",990000,62487000);

        listaempleado.add(freelancer);
        listaempleado.add(freelancer1);
        listaempleado.add(directo);
        listaempleado.add(promotor);
        listaempleado.add(vendedor);
        listaempleado.add(directo1);
        listaempleado.add(vendedor1);

        nomina.setEmpleadolis(listaempleado);
        nomina.listarDirectos();
        System.out.println("");
        nomina.listarFreelancer();
        System.out.println("");
        nomina.listarPromotores();
        System.out.println("");
        nomina.calcularNomina();




    }


}
