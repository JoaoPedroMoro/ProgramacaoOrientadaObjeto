package testadicionario;
/**
 * @author João Pedro Moro Bolognini
 * RA: 792185
 */
public class TestaDicionario {

    public static void main(String[] args) {
        Dicionario d1 = new Dicionario("portugues", 100);
        Dicionario d2 = new Dicionario("portugues");
        Dicionario d3 = new Dicionario("ingles", 100);
        d1.adicionarPalavra("paz", "substantivo", "sossego", "tranquilidade", 
                                              "ausência de guerra");
        d1.adicionarPalavra("ver", "verbo", "Olhar para", "enxergar");
        d1.imprimir("paz");
        d1.imprimir();
        d2.adicionarPalavra("andar", "verbo", "Mover-se, mudando de lugar");
        d3.adicionarPalavra("see", "verbo", "enxergar", "olhar", "observar");
        d3.adicionarPalavra("watch", "verbo", "assistir");
        d3.adicionarPalavra("beatiful", "adjetivo", "bonita", "gata");
        d3.adicionarPalavra("out", "advérbio", "fora", "externo");
        d3.adicionarPalavra("atention", "substantivo", "atenção", "cuidado");
        d3.imprimir();

    }
    
}
