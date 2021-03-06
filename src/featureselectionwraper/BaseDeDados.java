package featureselectionwraper;

/**
 *
 * @author Laura Emmanuella <lauraemmanuella at eaj.ufrn.br>
 */

public enum BaseDeDados {
    GREYC("greyc", 7548, 60, 2),
    KEYSTROKE("keystroke", 231, 43, 2);

    public final String NOMEBASE;

    public final int QTDPADROES;

    public final int QTDATRIBUTOS;

    public final int QTDCLASSES;

    private BaseDeDados(String nomeBase, int qtdPadroes, int qtdAtributos, int qtdClasses) {
        this.NOMEBASE = nomeBase;
        this.QTDPADROES = qtdPadroes;
        this.QTDATRIBUTOS = qtdAtributos;
        this.QTDCLASSES = qtdClasses;
    }
}
