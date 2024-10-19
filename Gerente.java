class Gerente extends Funcionario {
    private double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.10); 
    }

    @Override
    public String descreverResponsabilidades() {
        return "Gerenciar equipes.";
    }
}
