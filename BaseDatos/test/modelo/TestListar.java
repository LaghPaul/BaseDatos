package modelo;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {
     @Test
    public void testListar(){
        System.out.println("Listar");
        BaseDeDatos intance = new BaseDeDatos();
        ArrayList<Dato> esperado = new ArrayList<Dato>();
        ArrayList<Dato> obtenido = intance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
}
