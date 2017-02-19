package rooksoto.c4q.nyc.c4qhackathonapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import rooksoto.c4q.nyc.c4qhackathonapp.R;

import static android.R.attr.fragment;

/**
 * Created by rook on 2/18/17.
 */

public class EstimateCostFragment extends Fragment {

    View view;
    Spinner spnFamilySize;
    Spinner spnIncome;
    TextView tvQHouseholdSize;
    TextView tvQIncome;
    TextView tvQFeeLevel;
    TextView tvFeeLevel;
    TextView tvCalculateFees;
    int feeLevel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_estimate_cost_questionnaire, container, false);
        tvQHouseholdSize = (TextView) view.findViewById(R.id.tv_question_household_size);
        spnFamilySize = (Spinner) view.findViewById(R.id.spn_family_size);
        tvQIncome = (TextView) view.findViewById(R.id.tv_question_income);
        spnIncome = (Spinner) view.findViewById(R.id.spn_income);
        tvQFeeLevel = (TextView) view.findViewById(R.id.tv_question_fee_level);
        tvFeeLevel = (TextView) view.findViewById(R.id.tv_fee_level);
        tvCalculateFees = (TextView) view.findViewById(R.id.tv_calculate_fees);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        hideAll();

        tvCalculateFees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new MedicalCostsFragment();
                getFragmentManager().beginTransaction().replace(R.id.fl_fragment_host, fragment).commit();
            }
        });


        spnFamilySize.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ArrayAdapter<CharSequence> spinnerTwoArray;

                switch (position) {
                    case 0:
                        hideAll();
                        break;
                    case 1:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_1, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                    case 2:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_2, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                    case 3:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_3, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                    case 4:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_4, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                    case 5:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_5, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                    case 6:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_6, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                    case 7:
                        spinnerTwoArray = ArrayAdapter.createFromResource(getActivity(), R.array.fam_size_7, android.R.layout.simple_spinner_item);
                        spinnerTwoArray.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spnIncome.setAdapter(spinnerTwoArray);
                        showSetTwo();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Do Nothing
            }
        });

        spnIncome.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        hideSetThree();
                        break;
                    case 1:
                        feeLevel = 1;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                    case 2:
                        feeLevel = 2;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                    case 3:
                        feeLevel = 3;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                    case 4:
                        feeLevel = 4;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                    case 5:
                        feeLevel = 5;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                    case 6:
                        feeLevel = 6;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                    case 7:
                        feeLevel = 7;
                        tvFeeLevel.setText(String.valueOf(feeLevel));
                        showSetThree();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Do Nothing
            }
        });
    }

    private void showSetThree() {
        tvQFeeLevel.setEnabled(true);
        tvQFeeLevel.setVisibility(View.VISIBLE);
        tvFeeLevel.setEnabled(true);
        tvFeeLevel.setVisibility(View.VISIBLE);
        tvCalculateFees.setEnabled(true);
        tvCalculateFees.setVisibility(View.VISIBLE);
    }

    private void showSetTwo() {
        tvQIncome.setEnabled(true);
        tvQIncome.setVisibility(View.VISIBLE);
        spnIncome.setEnabled(true);
        spnIncome.setVisibility(View.VISIBLE);
    }

    private void hideSetThree() {
        tvQFeeLevel.setEnabled(false);
        tvQFeeLevel.setVisibility(View.GONE);
        tvFeeLevel.setEnabled(false);
        tvFeeLevel.setVisibility(View.GONE);
        tvCalculateFees.setEnabled(false);
        tvCalculateFees.setVisibility(View.GONE);
    }

    private void hideAll() {
        tvQIncome.setEnabled(false);
        tvQIncome.setVisibility(View.GONE);
        spnIncome.setEnabled(false);
        spnIncome.setVisibility(View.GONE);
        tvQFeeLevel.setEnabled(false);
        tvQFeeLevel.setVisibility(View.GONE);
        tvFeeLevel.setEnabled(false);
        tvFeeLevel.setVisibility(View.GONE);
        tvCalculateFees.setEnabled(false);
        tvCalculateFees.setVisibility(View.GONE);
    }
}
