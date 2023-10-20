package Ex_8;

public class Prog {
    Double salario;
    Double horasExtras;
    
    Prog(){
        salario = 0.0;
        horasExtras = 0.0;
    }
    
    Prog (Double salario, Double horasExtras){
        this.horasExtras = horasExtras;
        this.salario = salario;
    }
    
    //sobrecarga
    /* Quando um método não recebe parametros ou menos parametros que o outro metodo com o mesmo nome dele. */ 
    Double calcularSalario(){
        return salario;
    }

    Double calcularSalario(Double valorHoraExtra){
        Double valor = salario + (horasExtras * valorHoraExtra);
        return valor;
    }
}
