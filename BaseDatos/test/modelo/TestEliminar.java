package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {
  @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String id="001";
        Dato dato= new Dato("001", this);
        BaseDeDatos instancia = new BaseDeDatos();
        instancia.Agregar(dato);
        boolean esperado=true;
        boolean obtenido = instancia.Eliminar(id);
        Assert.assertEquals(esperado, obtenido);
    }  
}
