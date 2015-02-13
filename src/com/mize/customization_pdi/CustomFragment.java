package com.mize.customization_pdi;

import java.util.List;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.mize.common.MizeUtil;
import com.mize.domain.form.SectionGroup;
import com.mize.domain.inspection.InspectionForm;
import com.mize.pdi.R;
import com.mize.pdi.activity.MainActivity;
import com.mize.pdi.fragment.LoginFragment;
import com.mize.pdi.fragment.PdiListFragment;


public class CustomFragment extends PdiListFragment{
		
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
	@Override
	public void showAlert(){
		MizeUtil.showDialog(getActivity(), "From Custom Fragment");
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
	}
	@Override
	public void onPause() {
		super.onPause();
	}
}
