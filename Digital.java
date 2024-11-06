public class Digital extends Jogo {
    String codigo;

    Digital(String titulo, double preco, String codigo){
        super(titulo, preco);
        this.codigo = codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void exibirJogo(){
        super.exibirJogo();
        System.out.println("Codigo de Ativação: "+codigo);
    }
}
