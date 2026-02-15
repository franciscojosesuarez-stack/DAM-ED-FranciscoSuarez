package biblioteca;

/**
 * Clase Llibre y métodos para manipularla
 * 
 * @author - Francisco José Suárez Muñoz
 */
public class Llibre {
	/** Título del libro */
    private String titol;
    /** Autor del libro */
    private String autor;
    /** Cuántos ejemplares del libro tenemos */
    private int exemplars;
    /** Precio del libro */
    private float preu;

    /**
     *  Devuelve el precio del libro
     *  @return precio del libro 
     */
    float getPreu() {
		return preu;
	}

    /** 
     * Modifica el precio del libro
     * @param preu precio del libro
     */
	void setPreu(float preu) {
		this.preu = preu;
	}

	/** 
	 * Devuelve el número de ejemplares del libro
	 * @return número de ejemplares del libro
	 */
	int getExemplars() {
		return exemplars;
	}

	/** 
	 * Modifica el número de ejemplares del libro
	 * @param exemplars número de ejemplares del libro
	 */
	void setExemplars(int exemplars) {
		this.exemplars = exemplars;
	}

	/** 
	 * Devuelve el autor del libro
	 * @return autor del libro
	 */
	String getAutor() {
		return autor;
	}

	/** 
	 * Modifica el nombre del autor del libro
	 * @param autor autor del libro
	 */
	void setAutor(String autor) {
		this.autor = autor;
	}

	/** 
	 * Devuelve el título del libro
	 * @return título del libro
	 */
	String getTitol() {
		return titol;
	}

	/** 
	 * Modifica el título del libro
	 * @param titol título del libro */
	void setTitol(String titol) {
		this.titol = titol;
	}

	/** 
	 * Crea un libro e inicia todos los miembros
	 * 
	 * @param titol título del libro
	 * @param autor autor del libro
	 * @param exemplars número de ejemplares del libro
	 * @param preu precio del libro
	 * 
	 */
	public Llibre(String titol, String autor, int exemplars, float preu) {
        this.setTitol(titol);
        this.setAutor(autor);
        this.setExemplars(exemplars);
        this.setPreu(preu);
    }

	/** 
	 * Realiza el préstamo de una cantidad determinada de libros
	 *  Si hay suficiente ejemplares para realizar el préstamo, actualiza el total de ejemplares
	 *  @param quantitat número de ejemplares a prestar
	 *  @throws Exception Si la cantidad de ejemplares solicitada es mayor a las que tenemos disponibles
	 */
    public void prestarLlibre(int quantitat) throws Exception {
        if (getExemplars() >= quantitat) {
            setExemplars(getExemplars() - quantitat);
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    /** 
     * Devuelve una cantidad determinada de libros
     *  @param quantitat cantidad de libros a devolver
     */
    public void retornarLlibre(int quantitat) {
        setExemplars(getExemplars() + quantitat);
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    /**
     *  Imprime por consola el título, autor, número de ejemplares y precio del libro
     */
    public void mostrarDades() {
        System.out.println("Títol: " + getTitol());
        System.out.println("Autor: " + getAutor());
        System.out.println("Exemplars: " + getExemplars());
        System.out.println("Preu: " + getPreu() + " €");
    }
}
