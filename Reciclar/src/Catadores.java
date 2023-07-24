import java.util.ArrayList;
import java.util.List;

public class Catadores {
    final String nomeCatador;

    final List<Coleta> coleta = new ArrayList<>();

 // construtor

 Catadores (String nomeCatador) {
    this.nomeCatador = nomeCatador;
}

 void adicionarColetas(Coleta coleta) {
    this.coleta.add(coleta);
    coleta.catador.add(this);
 }

 double obterValor() {
    double total = 0;
    for (Coleta coletas: coleta  ) {
        total += coletas.obterValor();
    }
    return total;

  }

}