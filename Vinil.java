import java.util.ArrayList;
import java.util.List;

// Representa um disco de vinil vendido/locado na loja.
public class Vinil {
    // Atributos simples do vinil
    private int codigo;
    private String titulo;
    private String artista;
    private double precoVenda;
    private String genero;
    private int qtdDisponivel;
    // Relação direta com ItemCompra - lista de itens de compra que contêm este vinil
    private List<ItemCompra> itensCompra;

    public Vinil(int codigo, String titulo, String artista,
                 double precoVenda, int qtdDisponivel,
                 String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.artista = artista;
        this.precoVenda = precoVenda;
       
        this.qtdDisponivel = qtdDisponivel;
        this.genero = genero;
        this.itensCompra = new ArrayList<>();
    }

    public int getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getArtista() { return artista; }
    public double getPrecoVenda() { return precoVenda; }

    public String getGenero() { return genero; }
    public int getQtdDisponivel() { return qtdDisponivel; }
    public List<ItemCompra> getItensCompra() { return itensCompra; }

    // Adiciona um ItemCompra à lista (chamado automaticamente pelo ItemCompra)
    public void adicionarItemCompra(ItemCompra itemCompra) {
        if (itemCompra != null && !itensCompra.contains(itemCompra)) {
            itensCompra.add(itemCompra);
        }
    }

    // Baixa a quantidade do estoque deste vinil (evita negativo)
    public void diminuirEstoque(int quantidade) {
        if (quantidade <= 0) return;
        if (qtdDisponivel >= quantidade) {
            qtdDisponivel -= quantidade;
        }
    }

    @Override
    public String toString() {
        return "Vinil{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", precoVenda=" + precoVenda +
                ", qtdDisponivel=" + qtdDisponivel +
                '}';
    }
}