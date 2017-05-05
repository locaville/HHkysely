package com.hhkysely.objects;

import java.util.ArrayList;

/**
 * @author Alex
 *
 */
public class Vastaaja {
	private int id;
	private ArrayList<Vastaus> vastaukset;

	public Vastaaja(int id, ArrayList<Vastaus> vastaukset) {
		super();
		this.id = id;
		if (vastaukset == null){
			this.vastaukset = new ArrayList<Vastaus>();
			
		}else{
			this.vastaukset = vastaukset;
			
		}
	}

	public Vastaaja() {
		super();
		this.id = 0;
		this.vastaukset = new ArrayList<Vastaus>();
		
	}

	public Vastaaja(int id) {
		super();
		this.id = id;
		
	}

	public ArrayList<Vastaus> getVastaukset() {
		return vastaukset;
	}

	public void setVastaukset(ArrayList<Vastaus> vastaukset) {
		this.vastaukset = vastaukset;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vastaaja [id=" + id + ", vastaukset=" + vastaukset + "]";
	}


	
}
