package com.example.lenovo.iopd;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView queue,date,time,doing,where,when,name,right;
    private CardView suggestion;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        queue = root.findViewById(R.id.queueNo);
        where = root.findViewById(R.id.proWhere);
        when = root.findViewById(R.id.proWhen);
        name = root.findViewById(R.id.name);
        right = root.findViewById(R.id.right);
        suggestion = root.findViewById(R.id.suggestion);
        time = root.findViewById(R.id.apTime);
        doing = root.findViewById(R.id.proDoing);
        date = root.findViewById(R.id.apDate);

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(1);

            }
        });
        return root;
    }


}
