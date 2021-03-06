package net.simplifiedcoding.retrofitandroidtutorial.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.simplifiedcoding.retrofitandroidtutorial.R;
import net.simplifiedcoding.retrofitandroidtutorial.storage.SharedPrefManager;

public class HomeFragment extends Fragment {

    private TextView textViewEmail, textViewName, textViewEmailVer,textViewCreated,textViewUpdated,textViewRole;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewEmail = view.findViewById(R.id.textViewEmail);
        textViewName = view.findViewById(R.id.textViewName);
        textViewEmailVer = view.findViewById(R.id.textViewEmailVer);
        textViewCreated = view.findViewById(R.id.textViewCreated);
        textViewUpdated = view.findViewById(R.id.textViewCreated);
        textViewRole = view.findViewById(R.id.textViewRole);


        textViewEmail.setText(SharedPrefManager.getInstance(getActivity()).getUser().getEmail());
        textViewName.setText(SharedPrefManager.getInstance(getActivity()).getUser().getName());
        textViewEmailVer.setText(SharedPrefManager.getInstance(getActivity()).getUser().getEmail_verified_at());
        textViewCreated.setText(SharedPrefManager.getInstance(getActivity()).getUser().getCreated_at());
        textViewUpdated.setText(SharedPrefManager.getInstance(getActivity()).getUser().getUpdated_at());
        textViewRole.setText(SharedPrefManager.getInstance(getActivity()).getUser().getRole());
    }
}
