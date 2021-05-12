package br.com.sitewebsistematizacaoceub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Sistematização");

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.ea.uniceub.br/");
        webView.getSettings().setJavaScriptEnabled(true);

        final ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
    }
}


