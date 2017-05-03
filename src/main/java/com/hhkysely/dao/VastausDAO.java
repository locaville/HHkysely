package com.hhkysely.dao;

import java.util.List;

import com.hhkysely.objects.Vastaus;

public interface VastausDAO {
	
public abstract void talletaVastaukset(int id, List<Vastaus> vastaukset);
	
	//public abstract Vastaus etsi(int id);

}
