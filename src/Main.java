
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*List MyList= new ArrayList();
        MyList.add(10.5);
        MyList.add(5);
        MyList.add("HOLA MUNDO");
        MyList.add(true);
        System.out.println(MyList);
        System.out.println("---------Otra forma de recorrerlo---------");
        MyList.forEach(dato -> {
            System.out.println(dato);
        });
        System.out.println("---------Otra otra forma de recorrerlo---------");
        for (Object ListaDatos: MyList) {
           System.out.println(ListaDatos); 
        }*/
        
        
        /*HashSet ListaNormal = new HashSet();
        ListaNormal.add("Lunes");
        ListaNormal.add("Martes");
        ListaNormal.add("Miercoles");
        ListaNormal.add("Jueves");
        ListaNormal.add("Viernes");
        System.out.println(ListaNormal);
        System.out.println("---------Otra forma de recorrerlo---------");
        ListaNormal.forEach(dato-> {
            System.out.println(dato);
        });
        ListaNormal.clear();
        System.out.println("---------Otra otra forma de recorrerlo---------");
        for (Object ListaDatos: ListaNormal) {
           System.out.println(ListaDatos); 
        }*/
        
        HashMap MiLista = new HashMap();
        MiLista.put(502, "Guatemala");
        MiLista.put(503, "El Salvador");
        MiLista.put(504, "Honduras");
        MiLista.put(505, "Nicaragua");
        MiLista.put(506, "Costa Rica");
        MiLista.put(507, "Panama");
        System.out.println(MiLista);
        MiLista.put(507, "USA");
        System.out.println(MiLista);
        MiLista.remove(507);
        System.out.println(MiLista);
        System.out.println("---------Otra forma de recorrerlo---------");
        MiLista.forEach((clave, valor)-> {
            System.out.println(clave+" "+valor);
        });
    }
    
}
