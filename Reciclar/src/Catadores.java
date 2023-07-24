import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Catadores extends Pagamentos {
    String nome;
    int    cpf;
    LocalDateTime nascimento; // = LocalDateTime.now();
    final List<Produtos> listaprodutos = new ArrayList<>();

// Construtor
    public Catadores(String nome, int cpf, LocalDateTime nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }



}
