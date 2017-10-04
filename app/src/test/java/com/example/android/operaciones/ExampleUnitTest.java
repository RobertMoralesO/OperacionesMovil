package com.example.android.operaciones;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumaDeDosNumerosDeFormaCorrecta(){
        double ve=4.0;
        double vr = Metodos.sumar(2,2);

        assertEquals(ve,vr,0);
    }

    @Test
    public void sumaDeDosNumerosDeFormaIncorrecta(){
        double ve=4.0;
        double vr = Metodos.sumar(1,2);

        assertNotEquals(ve,vr,0);
    }

    @Test
    public void restaDeDosNumerosDeFormaCorrecta(){
        double ve=0;
        double vr = Metodos.restar(2,2);

        assertEquals(ve,vr,0);
    }

    @Test
    public void restaDeDosNumerosDeFormaIncorrecta(){
        double ve=1;
        double vr = Metodos.restar(2,2);

        assertNotEquals(ve,vr,0);
    }

    @Test
    public void pasoDeParametrosDeFormaIncorrecta(){
        double ve=1;
        double vr = Metodos.restar(2,2);

        assertNotEquals(ve,vr,0);
    }

  /*  @Test
    public void denominadorDivisionIgualCero(){
          boolean estado = Metodos.denominadorDivisionCero(0,3);
          assertTrue(estado);
    }*/


    @Test(expected =IllegalArgumentException.class)
    public void denominadorDivisionIgualCero(){
        boolean estado = Metodos.denominadorDivisionCero(0,3);
        assertTrue(estado);
    }

   /* @Test(timeout = 10)
    public void pruebaLoopInfinito(){
        boolean estado = Metodos.loppInfinito();
        assertTrue(estado);
    }*/




}