public class ItemCompra {
    // Item que liga um vinil à compra, com quantidade e valor calculado
    // Relação direta com Vinil - o vinil é sempre o item da compra
    private Vinil vinil;
    private int quantidade;
    private double valorItem;

    public ItemCompra(Vinil vinil, int quantidade) {
        if (vinil == null) {
            throw new IllegalArgumentException("ItemCompra deve estar ligado a um Vinil");
        }
        this.vinil = vinil;
        this.quantidade = quantidade;
        this.valorItem = vinil.getPrecoVenda() * quantidade;
        // Registra este ItemCompra no Vinil para criar a relação bidirecional
        vinil.adicionarItemCompra(this);
    }

    public Vinil getVinil() {
        return vinil;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorItem() {
        return valorItem;
    }
}
