package obchodik2;

/**
 *
 * @author PC
 */
public class kosikk {

    public String getNazovProduktu() {
        return NazovProduktu;
    }

    public int getIDProduktu() {
        return IDProduktu;
    }

    public int getCenaProduktu() {
        return CenaProduktu;
    }

    public int getPocet() {
        return Pocet;
    }

    public int getCenaCelkovo() {
        return CenaCelkovo;
    }

    public void setNazovProduktu(String NazovProduktu) {
        this.NazovProduktu = NazovProduktu;
    }

    public void setIDProduktu(int IDProduktu) {
        this.IDProduktu = IDProduktu;
    }

    public void setCenaProduktu(int CenaProduktu) {
        this.CenaProduktu = CenaProduktu;
    }

    public void setPocet(int Pocet) {
        this.Pocet = Pocet;
    }

    public void setCenaCelkovo(int CenaCelkovo) {
        this.CenaCelkovo = CenaCelkovo;
    }

    String NazovProduktu;
    int IDProduktu;
    int CenaProduktu;
    int Pocet;
    int CenaCelkovo;

}
