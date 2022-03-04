package desafioCap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DesafioTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void gerarEscada() {

        Escada escada = new Escada();

        escada.gerarEscada(6);

        assertEquals("     *\n    **\n   ***\n  ****\n *****\n******\n", outContent.toString());

    }

    @Test
    void contarAnagramas() {

        Anagramas anagramas = new Anagramas();

        assertEquals(2, anagramas.contarAnagramas("ovo"));
        assertEquals(3, anagramas.contarAnagramas("ifailuhkqq"));
    }

    @Test
    void validaSenha() {

        TestaSenha testaSenha = new TestaSenha();

        assertEquals("Senha precisa conter no minimo um digito\n", testaSenha.validaSenha("o"));
        assertEquals("Senha precisa conter no minimo uma letra maiúscula\n", testaSenha.validaSenha("o1"));
        assertEquals("Senha precisa conter no minimo uma letra minúscula\n", testaSenha.validaSenha("1O"));
        assertEquals("Senha precisa conter no minimo um caractere especial\n", testaSenha.validaSenha("o1O"));
        assertEquals("2", testaSenha.validaSenha("o1O$"));

    }

}