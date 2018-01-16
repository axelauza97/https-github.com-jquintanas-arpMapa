package com.example.axel.techbrainv2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Rastreo extends Fragment {

    public Rastreo() {
        // Required empty public constructor
    }
    //EditText etEmail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String url="http://www.google.com";
        View view = inflater.inflate(R.layout.fragment_rastreo, container, false);
        WebView web_view=(WebView) view.findViewById(R.id.web_view);
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setBuiltInZoomControls(true);
        web_view.loadUrl(url);
        //etEmail = (EditText)view.findViewById(R.id.etEmail);
        web_view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView web_view,String url){
                return false;
            }
        });

        return view;
    }
}
