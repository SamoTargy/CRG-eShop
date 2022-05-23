/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv.firebase;

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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class BNombers {
    
    List<Nombers> ListCiselok = new ArrayList<Nombers>();
    
    public void buscarNombres()throws InterruptedException, ExecutionException { 
        CollectionReference nombres = ConnectionFirebase.bd.collection("ciselka");
        ApiFuture<QuerySnapshot>querySnapshot = nombres.get();
        
        for(DocumentSnapshot document : querySnapshot.get().getDocuments()){
            Nombers nombers = new Nombers(
                    document.getId(),
                    document.getString("Cislo1"),
                    document.getString("Cislo2"),
                    document.getString("Cislo3"));                       
            ListCiselok.add(nombres);
        }
    }
    
    private void mostrarNombres(){
        agregarFilasTabla(NewJFrame.listaNombres,0);
        for(int posN=0; posN<ListCiselok.size(); posN ++){
            NewJFrame.listaNombres.setValueAt(ListCiselok.get(posN).jetNombre(),posN,0);
            NewJFrame.listaNombres.setValueAt(ListCiselok.get(posN).getApellidoPaterno(),posN,1);
            NewJFrame.listaNombres.setValueAt(ListCiselok.get(posN).getApellidoMaterno(),posN,2);
        }
    }
    
    public void agregarFilasTabla(JTable jTable,int filas){
        DefaultTableModel modelov =(DefaultTableModel)jTable.getModel();// se agregan filasala tabla
        modelov.setRowCount(filas);
    }
}
