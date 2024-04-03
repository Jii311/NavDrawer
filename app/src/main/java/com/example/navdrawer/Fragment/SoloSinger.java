package com.example.navdrawer.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.navdrawer.AdapterPenyanyi;
import com.example.navdrawer.ModelPenyanyi;
import com.example.navdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class SoloSinger extends Fragment implements AdapterPenyanyi.ItemClickListener {

    List<ModelPenyanyi> modelPenyanyi = new ArrayList<>();
    AdapterPenyanyi adapterPenyanyi;
    int[] image = {R.drawable.ardhito,R.drawable.billie_eilish,R.drawable.gac,R.drawable.gangga,R.drawable.hindia,R.drawable.james_arthur,R.drawable.keshi,R.drawable.teddy_aditya};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_solo_singer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycleview1);

        menu();

        adapterPenyanyi = new AdapterPenyanyi(getContext(), modelPenyanyi);
        recyclerView.setAdapter(adapterPenyanyi);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPenyanyi.setClickListener(this);

    }

    public void menu(){
        String[] bangunTitle = getResources().getStringArray(R.array.solo_singer);

        for (int i = 0; i < bangunTitle.length;i++){
            modelPenyanyi.add(new ModelPenyanyi(bangunTitle[i],image[i]));
        }
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}