public class Produtos   {
    String nomeProduto;
    String unidadeMedida;
    double valor;
  
     Produtos (String nomeProduto, String unidadeMedida, double valor) {
        this.nomeProduto   = nomeProduto;
        this.unidadeMedida = unidadeMedida;
        this.valor         = valor;
    }

 


 
    @Override
    public String toString() {
        return " nome Produto=" + nomeProduto + ", unidade Medida=" + unidadeMedida + ", valor=" + valor ;
    }

    
}
