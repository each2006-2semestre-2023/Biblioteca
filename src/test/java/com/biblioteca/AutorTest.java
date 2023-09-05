package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AutorTest {
        /**
         * Test do construtor com parâmetros
         */
        @Test
        public void testConstrutorComParametros() {
                String nome = "João";
                String sobrenome = "Silva";
                Autor autor = new Autor(nome, sobrenome);
                Assert.assertNotNull(autor.nome);
                Assert.assertNotNull(autor.sobrenome);
                Assert.assertEquals(autor.nome, nome);
                Assert.assertEquals(autor.sobrenome, sobrenome);
        }

        /**
         * Test do construtor sem parâmetros
         */
        @Test
        public void testConstrutorSemParametros() {
                Autor autor = new Autor();
                Assert.assertNull(autor.nome);
                Assert.assertNull(autor.sobrenome);
        }

}