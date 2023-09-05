package com.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class EditoraTest {
        /**
         * Test do construtor com parâmetros
         */
        @Test
        public void testConstrutorComParametros() {
                String nome = "MinhaEditora";
                Editora editora = new Editora(nome);
                Assert.assertNotNull(editora.nome);
                Assert.assertEquals(editora.nome, nome);
        }

        /*
         * Test do contrutor sem parâmetros
         */
        @Test
        public void testConstrutorSemParametros() {
                Editora editora = new Editora();
                Assert.assertNull(editora.nome);
        }
}