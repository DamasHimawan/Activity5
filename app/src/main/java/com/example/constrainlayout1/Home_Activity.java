package com.example.constrainlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    private ListViewAdapter adapter;

    String[] listnama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listnama = new String[]{"Tito", "Rama", "Yuli", "Nando", "Ganang", "Wahyu", "Pamungkas", "Budi", "Kiki", "Endoy"};

        list = findViewById(R.id.listkontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listnama.length; i++) {
            ClassNama classNama = new ClassNama(listnama[i]);

            classNamaArrayList.add(classNama);

            adapter = new ListViewAdapter(this);

            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String nama = classNamaArrayList.get(position).getName();

                    bundle.putString("a", nama.trim());

                    PopupMenu pm = new PopupMenu(getApplicationContext(), view);

                    pm.setOnMenuItemClickListener(Home_Activity.this);

                    pm.inflate(R.menu.popup_menu);

                    pm.show();

                }
            });

        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(),"ini untuk edit kontak", Toast.LENGTH_LONG).show();
                break;

        }
        return false;
    }
}