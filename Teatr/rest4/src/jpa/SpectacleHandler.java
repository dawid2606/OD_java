package jpa;

import java.util.List;

import javax.persistence.*;
import entities.Spectacle;

public class SpectacleHandler {
	
	 @PersistenceContext(unitName="rest4", 
             type=PersistenceContextType.TRANSACTION)
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "rest4" );
    EntityManager em = emfactory.createEntityManager();
	
	public List<Spectacle> getAllSpectacles(){
		Query query =em.createNamedQuery("Spectacle.SelectAll");
		List<Spectacle> list=(List<Spectacle>)query.getResultList();
		return list;
		}
	public Spectacle getSingleSpectacle(int id){
		
		Query query=em.createNamedQuery("Spectacle.SelectDetailsOfSpectacle");
		query.setParameter("spectacle_id", id);
		Spectacle spectacle= (Spectacle)query.getSingleResult();
		return spectacle;
	}
/*	public Spectacle getSingleSpectacle(int id){
		
		Query query=em.createQuery("Spectacle.SelectDetailsOfSpectacle");
		query.setParameter("spectacle_id", id);
		Spectacle spectacle= (Spectacle)query.getSingleResult();
		return spectacle;
	}*/
	
	
	public static void main (String args[]){     
	      
		SpectacleHandler sr=new SpectacleHandler();
		sr.getSingleSpectacle(2);
		
		List <Spectacle> list= sr.getAllSpectacles();
		for(Spectacle l : list){
			System.out.println(l);
		}

	}

}
