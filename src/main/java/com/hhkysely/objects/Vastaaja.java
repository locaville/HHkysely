package fi.hh.gitgud.kysely.bean;

public class Vastaaja {
	private int id;

	public Vastaaja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vastaaja(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vastaaja [id=" + id + "]";
	}
	
}
