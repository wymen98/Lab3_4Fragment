package my.edu.tarc.lab34fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {


    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final TextView textViewmessage;
        Button buttonShowMessage;

        View view;
        //view = layout or the UI
        view = inflater.inflate(R.layout.fragment_import, container, false);
        textViewmessage = view.findViewById(R.id.textViewMessage);
        buttonShowMessage = view.findViewById(R.id.buttonShowMessage);
        buttonShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewmessage.setText("Hello Import Fragment!");
            }
        });
        return view;
    }

}
