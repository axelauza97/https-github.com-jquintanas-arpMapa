package com.example.axel.techbrainv2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Logo extends Fragment {
    public Logo() {
        // Required empty public constructor
    }
    TextView texto;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_logo, container, false);

        texto= (TextView)view.findViewById(R.id.texto);


        return view;
    }
}
