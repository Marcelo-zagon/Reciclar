import java.util.ArrayList;
import java.util.List;

public  class Coleta {
final List<Item> itens = new ArrayList<>();
final List<Catadores> catador = new ArrayList<>();

// Metodo
void adicionarItem(Produtos p, int qtde ) {
   this.itens.add(new Item(p, qtde));
}

 

// Metodo
void adicionarItem(String nomeProduto, String unidadeMedida, double valorUn,int qtdeUnidadeMedida) {
     var produto = new Produtos(nomeProduto, unidadeMedida,valorUn );
     this.itens.add(new Item(produto, qtdeUnidadeMedida));
}

void adicionarCatador(Catadores nomeCatador) {
    this.catador.add(nomeCatador);
}

double obterValor() {
    double total = 0;
    for (Item item : itens) {
        total += item.qtdeUnidadeMedida * item.produto.valorUnidadeMedida;
    }
    return total;
}
}
