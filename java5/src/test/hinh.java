package test;

public abstract class hinh {
    protected toado toado;

    public hinh(test.toado toado) {
        this.toado = toado;
    }

    public test.toado getToado() {
        return toado;
    }

    public void setToado(test.toado toado) {
        this.toado = toado;
    }
    public abstract double tinhdientich();
}
