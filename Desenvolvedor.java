class Desenvolvedor extends Funcionario {
    private double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.20); 
    }

    @Override
    public String descreverResponsabilidades() {
        return "Desenvolver Softwares.";
    }
}
