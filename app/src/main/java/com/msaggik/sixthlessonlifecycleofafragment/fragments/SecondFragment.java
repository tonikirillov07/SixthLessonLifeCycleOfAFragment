package com.msaggik.sixthlessonlifecycleofafragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.msaggik.sixthlessonlifecycleofafragment.R;

public class SecondFragment extends Fragment {

    // конструктор второго фрагмента
    public SecondFragment() {
    }

    // метод прикрепления разметки ко второму фрагменту
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}
