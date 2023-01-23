package Executora;

import Banco.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe de testes para a pagina inicial")
public class PaginaInicialTest {
    //anotações @test da super poder para metodo para testa
    //anotações @DisplayName da poder para escreve no da classe ou do método

    @Test
    @DisplayName("Validando se o titulo da pagina esta correto")
    public void validarTituloDaPagina(){
        Pessoa daniTest = new Pessoa();
        daniTest.acessarUmSiteChamado("http://www.google.com.br");

        String tituloDaPaginaDaPagina = daniTest.pegarTituloDaPagina();// daniTest pega titulo da pagina ela devolver para uma variavel titulaDaPagina

        Assertions.assertEquals("Google", tituloDaPaginaDaPagina);
    }
}
