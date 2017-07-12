package id.mediacomputer.androidview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String url = "http://suryapersada.com/";  //Pendefinisian URL
        WebView view = (WebView) this.findViewById(R.id.webView);  //sinkronisasi object berdasarkan id
        view.getSettings().setJavaScriptEnabled(true);  //untuk mengaktifkan javascript
        view.loadUrl(url);   //agar URL terload saat dibuka aplikasi
    }
}
