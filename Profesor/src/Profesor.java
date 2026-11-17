public class Profesor{
    //Las variables que se van ausar poner con private.
    private String nombre;
    private double salario;
    private String departamento;

    //Constructor.
    public Profesor(String nombre, double salario, String departamento) {
        setDepartamento(departamento);
        setNombre(nombre);
        setSalario(salario);
    }

    //Getters y Setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de introducrise el nombre del profesor.");
        }
        this.nombre = nombre;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {
        if(salario<0){
            throw new IllegalArgumentException("El salario debe de ser psoitivo");
        }
        this.salario = salario;
    }

    public String getDepartamento() {

        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(departamento==null || departamento.trim().isEmpty()){
            throw new IllegalArgumentException("Debe de introducirse el departamento");
        }
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

    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Salario: "+ salario);
        System.out.println("Departamento: "+departamento);
    }
}
