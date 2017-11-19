package productions.darthplagueis.exploringfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import productions.darthplagueis.exploringfragments.R;

public class MainFragment extends Fragment {

    private View rootView;
    private Button button01, button02, button03, button04, button05;
    private EditText editText;

    public MainFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        editText = (EditText) rootView.findViewById(R.id.mainfrag_edittext);
        button01 = (Button) rootView.findViewById(R.id.mainfrag_btn1);
        button02 = (Button) rootView.findViewById(R.id.mainfrag_btn2);
        button03 = (Button) rootView.findViewById(R.id.mainfrag_btn3);
        button04 = (Button) rootView.findViewById(R.id.mainfrag_btn4);
        button05 = (Button) rootView.findViewById(R.id.mainfrag_btn5);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment firstFragment = new FirstFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("first", editTextContents);
                firstFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment_container, firstFragment).addToBackStack("first");
                fragmentTransaction.commit();
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("second", editTextContents);
                secondFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment_container, secondFragment).addToBackStack("second");
                fragmentTransaction.commit();
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdFragment thirdFragment = new ThirdFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("third", editTextContents);
                thirdFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment_container, thirdFragment).addToBackStack("third");
                fragmentTransaction.commit();
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragment fourthFragment = new FourthFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("fourth", editTextContents);
                fourthFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment_container, fourthFragment).addToBackStack("fourth");
                fragmentTransaction.commit();
            }
        });
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FifthFragment fifthFragment = new FifthFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("fifth", editTextContents);
                fifthFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment_container, fifthFragment).addToBackStack("fifth");
                fragmentTransaction.commit();
            }
        });
        return rootView;
    }

}
