package enumeracion;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(33),
    OCEANIA(15);

    private final int paises;

    Continentes(int paises){
        this.paises = paises;
    }

    public int getPaises(){
        return this.paises;
    }
}
