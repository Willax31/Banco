public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;


    public Cuenta(int agencia, int numero) {
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }

    public abstract void depositar(double saldo);

    public boolean retirar(double valor){

        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta){

        if (this.saldo >= saldo){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        } else{
            return false;
        }
    }

    public double getsaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}


