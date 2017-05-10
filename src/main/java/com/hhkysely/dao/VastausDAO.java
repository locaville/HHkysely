package com.hhkysely.dao;

import java.util.List;

import com.hhkysely.objects.Vastaaja;
import com.hhkysely.objects.Vastaus;

public interface VastausDAO {
	
public abstract void talletaVastaukset(int id, Vastaaja v);
	
	//public abstract Vastaus etsi(int id);

}
