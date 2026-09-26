/**
 * @author jawc
 */
package hashtable;

import model.Pergaminho;

public class NoHash {
    private Pergaminho pergaminho;
    private NoHash proximo;

    public NoHash(Pergaminho pergaminho) {
        this.pergaminho = pergaminho;
        this.proximo = null;
    }

    public Pergaminho getPergaminho() {
        return pergaminho;
    }

    public void setPergaminho(Pergaminho pergaminho) {
        this.pergaminho = pergaminho;
    }

    public NoHash getProximo() {
        return proximo;
    }

    public void setProximo(NoHash proximo) {
        this.proximo = proximo;
    }
}
