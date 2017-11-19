package productions.darthplagueis.exploringfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
        return rootView;
    }

}
