package br.com.chronosacademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {


    @Test
    public void validaAprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(6.0, 5.0);
        assertEquals("Aprovado",resultado);

    }

    @Test
    public void validaReprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(2.3, 5.0);
        assertEquals("Reprovado",resultado);


    }

}