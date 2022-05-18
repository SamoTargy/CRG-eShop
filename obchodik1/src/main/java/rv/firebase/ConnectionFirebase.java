package rv.firebase;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class ConnectionFirebase {
    
    static Firestore bd;
    
    public static void connection() throws IOException {

        FileInputStream serviceAccount =
          new FileInputStream("targoshop.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .setDatabaseUrl("https://targoshop-40d41-default-rtdb.firebaseio.com")
          .build();

        FirebaseApp.initializeApp(options);
        bd = FirestoreClient.getFirestore();
        System.out.println("Databaza ide");
    }
    
    public static boolean InsertData(
            String collection,
            String document,
            Map<String,Object>data){
        try{
            DocumentReference docRef = bd.collection(collection).document(document);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Update time:"+result.get().getUpdateTime());
            
            return true;
        } catch (Exception e){
        }
        return false;
    }    
    
    public static void main(String[]args){
        try{
            connection();
        } catch (Exception e){
        }
    }
}
