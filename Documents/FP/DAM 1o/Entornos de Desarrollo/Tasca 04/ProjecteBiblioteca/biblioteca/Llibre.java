package biblioteca;

public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private float preu;

    float getPreu() {
		return preu;
	}

	void setPreu(float preu) {
		this.preu = preu;
	}

	int getExemplars() {
		return exemplars;
	}

	void setExemplars(int exemplars) {
		this.exemplars = exemplars;
	}

	String getAutor() {
		return autor;
	}

	void setAutor(String autor) {
		this.autor = autor;
	}

	String getTitol() {
		return titol;
	}

	void setTitol(String titol) {
		this.titol = titol;
	}

	public Llibre(String titol, String autor, int exemplars, float preu) {
        this.setTitol(titol);
        this.setAutor(autor);
        this.setExemplars(exemplars);
        this.setPreu(preu);
    }

    public void prestarLlibre(int quantitat) throws Exception {
        if (getExemplars() >= quantitat) {
            setExemplars(getExemplars() - quantitat);
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    public void retornarLlibre(int quantitat) {
        setExemplars(getExemplars() + quantitat);
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    public void mostrarDades() {
        System.out.println("Títol: " + getTitol());
        System.out.println("Autor: " + getAutor());
        System.out.println("Exemplars: " + getExemplars());
        System.out.println("Preu: " + getPreu() + " €");
    }
}
