public class Jogo {
    String titulo;
    double preco;

    Jogo(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }

    public double getPreco(){
        return preco;
    }

    public void exibirJogo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Preço: "+preco);
    }
}
