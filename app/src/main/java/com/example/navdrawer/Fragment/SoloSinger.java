package com.example.navdrawer.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawer.AdapterPenyanyi;
import com.example.navdrawer.ModelPenyanyi;
import com.example.navdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class SoloSinger extends Fragment {
    List<ModelPenyanyi> modelPenyanyi = new ArrayList<>();
    AdapterPenyanyi adapterPenyanyi;
    int[] image = {R.drawable.ardhito,R.drawable.billie_eilish,R.drawable.gangga,R.drawable.hindia,R.drawable.james_arthur,R.drawable.keshi,R.drawable.nadhif,R.drawable.teddy_aditya};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_solo_singer, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView1);

        menu();

        adapterPenyanyi = new AdapterPenyanyi(getContext(), modelPenyanyi);
        recyclerView.setAdapter(adapterPenyanyi);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    public void menu(){
        String[] bangunTitle = getResources().getStringArray(R.array.solo_singer);

        for (int i = 0; i < bangunTitle.length;i++){
            modelPenyanyi.add(new ModelPenyanyi(bangunTitle[i],image[i]));
        }
    }
}