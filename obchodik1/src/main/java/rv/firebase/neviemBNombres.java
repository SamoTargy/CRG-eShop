/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv.firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import javax.swing.text.Document;

/**
 *
 * @author PC
 */
public class neviemBNombres {
    
    List<Ciselka> ListCiselok = new ArrayList<Nombres>();
    
    public void buscarNombres()throws InterruptedException, ExecutionException{
        CollectionReference ciselka = ConnectionFirebase.bd.collection("nombres");
        ApiFuture<QuerySnapshot> querysnapshot = ciselka.get();
                                      
        for(DocumentSnapshot document : querySnapshot.get().getDocuments()){
                Ciselka cislo = new Ciselka(
                document.getId(),
                document.getString("Cislo1"),
                document.getString("Cislo2"),
                document.getString("Cislo3"));
            System.out.println(document.getId());
        }                            
    }                               
}
