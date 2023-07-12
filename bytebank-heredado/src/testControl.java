public class testControl {

    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente ximena = new Gerente();
        ximena.setSalario(10000);

        Contador alex = new Contador();
        alex.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(ximena);
        controlBonificacion.registrarSalario(alex);

    }

}
