public class TestProfesor {
    public static void main(String[] args){
        try{
            //Información del profesor sin errores.
            Profesor profesorJuan=new Profesor("Juan", 200, "Informática");
            System.out.println(profesorJuan);
            System.out.println("---------");
            profesorJuan.mostrarInformacion();
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("/////");

        try{
            //Información del profesor con salario 0.
            Profesor profesorPedro=new Profesor("Pedro", 0, "Informatica");
            System.out.println(profesorPedro);
            System.out.println("---------");
            profesorPedro.mostrarInformacion();
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("/////");

        try{
            //Informacion profesor con salario nogativo.
            Profesor profesorCarlos=new Profesor("Carlos", -144.45,"Informatica");
            System.out.println(profesorCarlos);
            System.out.println("---------");
            profesorCarlos.mostrarInformacion();
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
