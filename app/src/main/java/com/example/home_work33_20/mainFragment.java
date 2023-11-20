package com.example.home_work33_20;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class mainFragment extends Fragment {

    private RecyclerView rvNumber;

    private ArrayList<String> numberlist = new ArrayList<>();

    private NumberAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState){
        initView();
        loadData();
        initAdepter();
    }

    private void initAdepter() {
        adapter=new NumberAdapter(numberlist);
        rvNumber.setAdapter(adapter);
    }

    private void loadData() {
        numberlist.add("+996 111 222 333");
        numberlist.add("+996 743 354 674");
        numberlist.add("+996 348 343 546");
        numberlist.add("+996 342 344 121");
        numberlist.add("+996 754 456 322");
        numberlist.add("+996 222 554 344");
        numberlist.add("+996 232 000 111");
        numberlist.add("+996 777 232 657");
        numberlist.add("+996 555 237 232");
        numberlist.add("+996 223 465 789");
        numberlist.add("+996 756 220 543");
    }

    private void initView() {
        rvNumber=requireActivity().findViewById(R.id.rv_numbers);
    }
}