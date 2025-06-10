package template1;

public class CajaDeAhorro extends CuentaBancaria {
    public CajaDeAhorro(float saldo) {
        super(saldo);
    }

    @Override
    protected boolean puedoExtraer(float saldoARetirar) {
        return this.saldo >= saldoARetirar;
    }

}
