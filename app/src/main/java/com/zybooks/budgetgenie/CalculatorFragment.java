package com.zybooks.budgetgenie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class CalculatorFragment extends Fragment {

    public CalculatorFragment(){
        // require a empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);


        EditText mNumberOfEmployees = view.findViewById(R.id.editNumberOfEmployees);
        EditText mContingencyPercent = view.findViewById(R.id.editContingencyPercent);
        Button btn = view.findViewById(R.id.calculateButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              showToast("Calculating costs...");
            }
        });
        return view;
    }

    private Toast mToast;
    protected  void showToast(String msg){
        if (mToast == null){
            mToast = Toast.makeText(getContext(), "", Toast.LENGTH_LONG);
        } else {
            mToast.cancel();
            mToast = Toast.makeText(getContext(), "", Toast.LENGTH_LONG);
        }
        mToast.setText(msg);
        mToast.show();

    }

}
