package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entities.*;

public class TicketsHandler {
	@PersistenceContext
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "rest4" );
    EntityManager em = emfactory.createEntityManager();
	public List<Seat> getAllSeats(){
		Query query =em.createNamedQuery("Seat.SELECT_ALL");
		List<Seat> list=(List<Seat>)query.getResultList();
		return list;
		}

//	public static void main (String args[]){
//		
//	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Teatr" );
//	      EntityManager entitymanager = emfactory.createEntityManager();
//	      Seat seat = entitymanager.find( Seat.class, 2 );
//
//	      System.out.println("seat ID = " + seat.getSeat_id());
//	      System.out.println("seat row number = " + seat.getRow_number());
//	      System.out.println("seat place number = " + seat.getPlace_number());	      
//	      
//		TicketsHandler tr=new TicketsHandler();
//		
//		List <Seat> list= tr.getAllSeats();
//		for(Seat l : list){
//			System.out.println(l);
//		}
//		
//SpectacleHandler sr=new SpectacleHandler();
//		
//		List <Spectacle> list2= sr.getAllSpectacles();
//		for(Spectacle l : list2){
//			System.out.println(l);
//		}
//
//	}
}