package com.example.axel.techbrainv2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class Crear_cerca extends Fragment {
    public Crear_cerca() {
        // Required empty public constructor
    }
    //TextView texto;
    Spinner lista_gps;
    WebView web_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crear_cerca, container, false);
        lista_gps=(Spinner)view.findViewById(R.id.sp_gps);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(view.getContext(),R.array.lista_gps,android.R.layout.simple_spinner_item);
        lista_gps.setAdapter(adapter);
        lista_gps.setId(0);

        String url="http://www.google.com";
/*
        web_view=(WebView) view.findViewById(R.id.web_view);
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setBuiltInZoomControls(true);
        web_view.loadUrl(url);
        web_view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView web_view,String url){
                return false;
            }
        });*/
        //texto= (TextView)view.findViewById(R.id.texto);


        return view;
    }
}
