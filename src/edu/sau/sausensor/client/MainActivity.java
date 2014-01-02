package edu.sau.sausensor.client;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import edu.sau.sausensor.client.domain.Mts400Results;
import edu.sau.sausensor.client.service.DAO;
import edu.sau.sausensor.client.service.WebServiceProvider;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    WebServiceProvider webServiceProvider;
    DAO dao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        dao=new DAO();
       TextView textView=(TextView)findViewById(R.id.mesaj);
        Map<String,String> params=new HashMap<String,String>();
        params.put("id","3");
        Mts400Results result=null;
        try{
        result= dao.getMts400Result(params);
        }catch(Exception e){
            Toast.makeText(MainActivity.this,"HATA !",Toast.LENGTH_LONG).show();

        }
        if(result!=null){
            textView.setText(result.toString());
        }else{
            Toast.makeText(MainActivity.this,"Veri Bulunamadı(404 not found!)",Toast.LENGTH_LONG).show();
        }

    }
}
