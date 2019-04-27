public class Cliente {
    private String Titular;
    private String CPF;
    private String DataNasc;
    private String NomeMae;

    public void setTitular(String titular) {
        Titular = titular;
    }

    public String getTitular() {
        return Titular;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setDataNasc(String dataNasc) {
        DataNasc = dataNasc;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public String getNomeMae() {
        return NomeMae;
    }
}
