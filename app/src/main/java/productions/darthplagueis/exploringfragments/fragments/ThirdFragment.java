package productions.darthplagueis.exploringfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import productions.darthplagueis.exploringfragments.R;

public class ThirdFragment extends Fragment {

    private View rootView;
    private TextView textView;


    public ThirdFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.fragment_third, container, false);
        textView = (TextView) rootView.findViewById(R.id.thirdfrag_textview);
        return rootView;
    }

}
