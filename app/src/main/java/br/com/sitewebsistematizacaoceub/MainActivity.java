package br.com.sitewebsistematizacaoceub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Sistematização");

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.ea.uniceub.br/");
    }
}