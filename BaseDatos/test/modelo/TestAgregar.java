package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Dato dato= new Dato("001", this);
        BaseDeDatos instancia = new BaseDeDatos();
        boolean esperado=true;
        boolean obtenido = instancia.Agregar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
