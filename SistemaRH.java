public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Beatriz", 9000);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.calcularSalario());
        System.out.println("Responsabilidades: " + gerente.descreverResponsabilidades());

        System.out.println();

        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário: " + desenvolvedor.calcularSalario());
        System.out.println("Responsabilidades: " + desenvolvedor.descreverResponsabilidades());
    }
}
