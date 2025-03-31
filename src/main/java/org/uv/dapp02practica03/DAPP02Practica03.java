package org.uv.dapp02practica03;

import java.util.List;

public class DAPP02Practica03 {

    public static void main(String[] args) {
        EmpleadoDAO dao = new EmpleadoDAO();

//        // Crear un nuevo empleado
//        EmpleadoPojo pojo = new EmpleadoPojo();
//        pojo.setNombre("Isaias");
//        pojo.setDireccion("Calle 199");
//        pojo.setTelefono("2722328313");
//
//        pojo = dao.guardar(pojo);
//        Long clave = pojo.getClave(); // Obtener la clave del empleado guardado
//        System.out.println("Se guardó el empleado con ID: " + clave);

//        // Modificar un empleado existente pasando la clave como parámetro
//        EmpleadoPojo pojoModificado = new EmpleadoPojo();
//        pojoModificado.setNombre("Mario Gómez");
//        pojoModificado.setDireccion("Calle 21");
//        pojoModificado.setTelefono("2721112233");
//
//        EmpleadoPojo actualizado = dao.modificar(pojoModificado, 4L);
//        if (actualizado != null) {
//            System.out.println("Empleado modificado con éxito: " + actualizado.getNombre());
//        } else {
//            System.out.println("No se encontró el empleado con ID");
//        }
//v2
          

//        // Buscar un empleado por ID pasando la clave como parámetro
//          EmpleadoPojo pojo = dao.buscarById(8L);
//          System.out.println(" Clave: " + pojo.getClave() + "Nombre: " + pojo.getNombre());
//          System.out.println("Se guardo");
//          

//        // Mostrar todos los empleados
//          List<EmpleadoPojo> lstEmpleados= dao.buscarAll();
//          for(EmpleadoPojo emp : lstEmpleados){
//              System.out.println(" Clave: "+ emp.getClave()+" Nombre: "+ emp.getNombre());
//          }

//
//        //Eliminar un empleado por ID pasando la clave como parámetro
//          dao.eliminar(7L);
//          System.out.println("Se elimino");
    }
}
