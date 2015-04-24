import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aline Santos on 24/04/2015.
 */
public class testeTest {
    int parametro1 = 2;

    @Test
    public void addition_withValidParameters_shouldReturnCorrectResponse() {
        teste tst = new teste();
        assertEquals("A soma de 2 e 3 deve ser 5", 5, tst.addition(parametro1, 3));
    }

    @Test
    public void validaEmail_withValidParameters_shouldReturnCorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", true, tst.validaEmail("aline.santos@sofist.com.br"));
    }

    @Test
    public void validaEmail_withoutAt_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("aline.santossofist.com.br"));
    }

    @Test
    public void validaEmail_withoutDotCom_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("aline.santos@sofist.br"));
    }

    @Test
    public void validaEmail_withoutDotBr_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("aline.santos@sofist.com"));
    }

    @Test
    public void validaEmail_withoutUserName_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("@sofist.com.br"));
    }

    @Test
    public void validaEmail_withoutDomain_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("aline.santos@"));
    }

    @Test
    public void validaEmail_withoutCompanyName_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("aline.santos@com.br"));
    }

    @Test
    public void validaEmail_withSpecialCharacters_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("O valor inserido não é um e-mail válido", false, tst.validaEmail("aline.%$@com.br"));
    }

    @Test
    public void maiorIdade_withLimitValidAge_shouldReturnCorrectResponse() {
        teste tst = new teste();
        assertEquals("A idade inserida é menor que 18 anos", true, tst.maiorIdade(18));
    }

    @Test
    public void maiorIdade_withValidAge_shouldReturnCorrectResponse() {
        teste tst = new teste();
        assertEquals("A idade inserida é menor que 18 anos", true, tst.maiorIdade(19));
    }

    @Test
    public void maiorIdade_withLowerAge_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("A idade inserida é menor que 18 anos", false, tst.maiorIdade(17));
    }

    @Test
    public void maiorIdade_withZero_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("A idade inserida é menor que 18 anos", false, tst.maiorIdade(0));
    }

    @Test
    public void maiorIdade_withNegativeNumber_shouldReturnIncorrectResponse() {
        teste tst = new teste();
        assertEquals("A idade inserida é menor que 18 anos", false, tst.maiorIdade(-17));
    }

}