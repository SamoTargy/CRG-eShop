/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import static java.lang.System.out;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Nieco {
    
    List<Ucty>ListUctov = new ArrayList<Ucty>();
    
    public void urob()throws InterruptedException, ExecutionException { 
        CollectionReference nombres = pages.ConnectionFirebase.bd.collection("ucty");
        ApiFuture<QuerySnapshot>querySnapshot = nombres.get();
        
        for(DocumentSnapshot document : querySnapshot.get().getDocuments()){
            Ucty ucty = new Ucty(
                    document.getString("Meno"),
                    document.getString("Priezvisko"),
                    document.getString("PrihlasMeno"),
                    document.getString("Heslo"));            
            ListUctov.add(ucty);
            
            
            System.out.println(document.getString("Meno"));
            System.out.println(document.getString("Priezvisko"));
            System.out.println(document.getString("PrihlasMeno"));
            System.out.println(document.getString("Heslo"));
             
                        
            Prihlasenie Prihlasenie = new Prihlasenie(); // Zadefinuje Jframe(Domov)  
            
            
                    if(Prihlasenie.MenoTextField.getText().contains(document.getString("Meno")) && Prihlasenie.HesloPasswordField.getText().contains(document.getString("Heslo")))
                    {
                        Domov Domov = new Domov(); // Zadefinuje Jframe(Domov)
                        Domov.show(); // Zobrazí Jframe(Domov)
                        Prihlasenie.dispose(); // Zatvoí povodný Jframe
                    }

        }
    }    
}