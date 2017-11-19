package productions.darthplagueis.exploringfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import productions.darthplagueis.exploringfragments.R;

public class FourthFragment extends Fragment {

    private View rootView;
    private TextView textView;

    public FourthFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_fourth, container, false);
        textView = (TextView) rootView.findViewById(R.id.fourthfrag_textview);
        return rootView;
    }

}
