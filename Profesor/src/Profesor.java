public class Profesor{
    //Las variables que se van ausar poner con private.
    private String nombre;
    private double salario;
    private String departamento;

    //Constructor.
    public Profesor(String nombre, double salario, String departamento) {
        if(salario<0){
            throw new IllegalArgumentException("El salario debe de ser psoitivo");
        }

        if(nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de introducrise el nombre del profesor.");
        }

        if(departamento==null || departamento.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de introducirse el departamento");
        }

        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //toString()

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
