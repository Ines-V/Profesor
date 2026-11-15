public class TestProfesor {
    public static void main(String[] args){
        //Información del profesor sin errores.
        Profesor profesorJuan=new Profesor("Juan", 200, "Informática");
        System.out.println(profesorJuan);

        //Información del profesor con salario 0.
        Profesor profesorPedro=new Profesor("Pedro", 0, "Informatica");
        System.out.println(profesorPedro);

        //Informacion profesor con salario nogativo.
        Profesor profesorCarlos=new Profesor("Carlos", -144.45,"Informatica");
    }
}
