package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "http://www.omdbapi.com/?t=";

    private final String API_KEY = "&apikey=127d4ce7";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
    }
}
