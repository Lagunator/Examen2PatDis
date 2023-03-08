package EjerciciosExamen.ejercicio2;

public abstract class Jugador {

    private String alias;
    private String nombre;
    private String ranking;
    protected IChat chatJuego;

    public Jugador(IChat chatJuego, String alias, String nombre, String ranking) {
        this.chatJuego = chatJuego;
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
    public IChat getChatJuego() {
        return chatJuego;
    }
    public void setChatJuego(IChat chatJuego) {
        this.chatJuego = chatJuego;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
