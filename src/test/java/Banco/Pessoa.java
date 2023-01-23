package Banco;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pessoa {
    private ChromeDriver navegador; // propriedade qualquer método

    //construtor é usado pra executar alguns comandos assim alguem fizer um new da classe ou seja instanciou a classe

    public Pessoa() {
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
    }
    //public void abrirChorme(){
    //ChromeDriver navegador = new ChromeDriver(); é uma variavel}

   /* public void acessarSite(){ //esta cinza dizer método não foi utilizado
        navegador.get("https://www.magazineluiza.com.br/");
    }*/

    /*parametros do mundo exterior passa dentro de um deteminado metodo de uma classe
    metodo mais generico ou seja metodo cita somente uma vez dentro dele consiga manipular informações diferentes
    com base da entrada é assim se faz!
     */
    public void acessarUmSiteChamado(String urlDoSite){  //pode utilizar varios site neste comando
        navegador.get(urlDoSite);
    }

    public String pegarTituloDaPagina(){
        return navegador.getTitle(); // vai la pega titulo e devolver. devolver pra que chamou
    }


}
