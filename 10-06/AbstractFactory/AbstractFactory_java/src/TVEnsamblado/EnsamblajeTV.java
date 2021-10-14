package TVEnsamblado;

public class EnsamblajeTV {
    public EnsamblajeTV() {
    }

    public EnsamblajeTV(TvAbstractFactory factory) {
        Color color = factory.createColor();
        TV tv=factory.createTV();
        color.colorea(tv);
    }
}
