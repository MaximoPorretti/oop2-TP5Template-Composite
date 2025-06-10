package template1;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(float saldo) {
        super(saldo);
    }

    @Override
    protected boolean puedoExtraer(float saldoARetirar) {
        return true;
    }


}
