package sieubo;

public class KySu extends SieuBo{
    private String nganhdaotao;

    public KySu() {
    }

    public KySu(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    public KySu(String name, String date, String sex, String address, String nganhdaotao) {
        super(name, date, sex, address);
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nganhdaotao='" + nganhdaotao;
    }
}
