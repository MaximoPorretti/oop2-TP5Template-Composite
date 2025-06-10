package template1;

public abstract class CuentaBancaria {
protected float saldo;

    public CuentaBancaria(float saldo) {
        this.saldo = saldo;
    }

    public float saldo() {
        return this.saldo;
    }

    public void extraer(float saldoARetirar){

        if (puedoExtraer(saldoARetirar)) {
            this.saldo -= saldoARetirar;
        }
    }

    protected abstract boolean puedoExtraer(float saldoARetirar);



}