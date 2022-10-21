public class Produto {
    private String nome;
    private float valor;
    private int quantidade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean verificarQuantidade(int quantidade){
        return this.quantidade >= quantidade;
    }
    public void adicionarUnidades(int quantidade){
        this.quantidade = this.quantidade + quantidade;
    }
    public boolean removerUnidades(int quantidade){
        boolean estoque = verificarQuantidade(quantidade);
        if(estoque == true){
            this.quantidade = this.quantidade - quantidade;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + " valor: " + this.valor + " quantidade " + this.quantidade;
    }
}
