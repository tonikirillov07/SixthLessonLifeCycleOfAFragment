package com.msaggik.sixthlessonlifecycleofafragment.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.msaggik.sixthlessonlifecycleofafragment.R;

public class FirstFragment extends Fragment {

    // конструктор фрагмента
    public FirstFragment() {
    }

    // метод прикрепления фрагмента к активности
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "Прикрепление фрагмента к активности", Toast.LENGTH_SHORT).show();
    }
    // метод создания фрагмента
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "Создание фрагмента", Toast.LENGTH_SHORT).show();
    }
    // метод прикрепления разметки к фрагменту
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "Прикрепление разметки к фрагменту", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    // метод привязки разметки к полям
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getActivity(), "Привязка разметки к полям", Toast.LENGTH_SHORT).show();
    }
    // метод получения предыдущего состояния фрагмента
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Toast.makeText(getActivity(), "Получение предыдущего состояния фрагмента", Toast.LENGTH_SHORT).show();
    }
    // метод видимости фрагмента
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "Фрагмент видим", Toast.LENGTH_SHORT).show();
    }
    // метод доступности фрагмента для взаимодействия с пользователем
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "С фрагментом можно взаимодействовать", Toast.LENGTH_SHORT).show();
    }
    // метод прекращения взаимодействия пользователя с фрагментом
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "Пауза (взаимодействие с фрагментом прекращено)", Toast.LENGTH_SHORT).show();
    }
    // метод невидимости фрагмента
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getActivity(), "Фрагмент невидим", Toast.LENGTH_SHORT).show();
    }
    // метод сохранения состояния текущего фрагмента
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getActivity(), "Сохранение данных фрагмента", Toast.LENGTH_SHORT).show();
    }
    // метод уничтожения привязки к разметке
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "Уничтожение привязки к разметке", Toast.LENGTH_SHORT).show();
    }
    // метод уничтожения фрагмента
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "Уничтожение фрагмента", Toast.LENGTH_SHORT).show();
    }
    // метод открепления фрагмента от активности
    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "Открепление фрагмента от активности", Toast.LENGTH_SHORT).show();
    }
}
