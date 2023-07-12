public class testFuncionario {

    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumento("4455667");
        diego.setSalario(2000);
        diego.setTipo(0);

        System.out.println(diego.getBonificacion());

    }

}
