package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {
     @Test
    public void testModificar(){
        System.out.println("Modificar");
        Dato dato= new Dato("001",this);
        BaseDeDatos instancia = new BaseDeDatos();
        instancia.Agregar(dato);
        boolean esperado=true;
        dato = new Dato("001", this);
        boolean obtenido = instancia.Modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}

