public class EjercicioIf {

    float salarioInicial;
    float porcentajeAumentado;
    float salarioFinal;
    public EjercicioIf(float salarioInicial, float porcentajeAumentado, float salarioFinal) {
        this.salarioInicial = salarioInicial;
        this.porcentajeAumentado = porcentajeAumentado;
        this.salarioFinal = salarioFinal;
    }
    public float calcularSalario(){ 

        if (salarioInicial<1300606) {

            salarioFinal=salarioInicial+(salarioInicial*porcentajeAumentado);
            } else { 
                salarioFinal=salarioInicial;
            
            }
        return salarioFinal;

    }


    
}
 