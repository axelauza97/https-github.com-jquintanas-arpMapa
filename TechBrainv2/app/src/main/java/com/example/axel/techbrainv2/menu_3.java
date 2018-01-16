package com.example.axel.techbrainv2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;
import android.content.Intent;

public class menu_3 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        menu menu_fondo=new menu();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(
                R.id.relativelayout_for_fragment,
                menu_fondo,
                menu_fondo.getTag()
        ).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        FragmentManager manager = getSupportFragmentManager();
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            Toast.makeText(this,"Accion",Toast.LENGTH_LONG).show();
        } else {
            menu menu_fondo=new menu();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    menu_fondo,
                    menu_fondo.getTag()
            ).commit();
            //super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(menu_3.this,Home.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager manager = getSupportFragmentManager();
        if (id == R.id.nav_camera) {
            menu menu_fondo=new menu();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    menu_fondo,
                    menu_fondo.getTag()
            ).commit();

        } else if (id == R.id.nav_gallery) {
            Rastreo rastreo=new Rastreo();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    rastreo,
                    rastreo.getTag()
            ).commit();
        } else if (id == R.id.nav_slideshow) {
            Crear_cerca cerca=new Crear_cerca();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    cerca,
                    cerca.getTag()
            ).commit();
        } else if (id == R.id.nav_manage) {
            Help help=new Help();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    help,
                    help.getTag()
            ).commit();

        } else if (id == R.id.nav_share) {
            Nosotros nosotros=new Nosotros();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    nosotros,
                    nosotros.getTag()
            ).commit();
        } else if (id == R.id.nav_send) {
            Redes_sociales red_social=new Redes_sociales();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    red_social,
                    red_social.getTag()
            ).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
