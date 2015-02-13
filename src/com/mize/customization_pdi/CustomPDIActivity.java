package com.mize.customization_pdi;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mize.common.ApplicationContext;
import com.mize.pdi.R;
import com.mize.pdi.activity.MainActivity;
import com.mize.pdi.application.PDIApplication;
import com.mize.pdi.fragment.DownloadFragment;
import com.mize.pdi.fragment.NewInspectionFormFragment;
import com.mize.pdi.fragment.PdiListFragment;
import com.mize.pdi.fragment.SearchFragment;



public class CustomPDIActivity extends MainActivity {

	PDIApplication app;
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
				
		//setContentView(R.layout.activity_custom_pdi);
		/*activity = this;
		Button btnStart = (Button)this.findViewById(R.id.btnStart);
		btnStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setComponent(new ComponentName("com.mize.pdi", "com.mize.pdi.activity.MainActivity"));
				startActivity(intent);
				CustomFragment frag;
                FragmentManager fm1 = activity.getFragmentManager();
                FragmentTransaction ft1 = fm1.beginTransaction();
                frag = new CustomFragment();
                ft1.replace(R.id.container, frag);
                ft1.commit();
			}
		});*/
	}

	
	
	@Override
	public void addFragmentIntoTab() {
		fields.inspectionListTab.clear();
		fields.inboxTab.clear();
		fields.searchTab.clear();
		fields.downloadsTab.clear();
		fields.newInspectionFormTab.clear();

		fields.inspectionListTab.add(getPdiListFragment());		
		fields.inboxTab.add(new SearchFragment());
		fields.searchTab.add(new SearchFragment());
		fields.downloadsTab.add(new DownloadFragment());
		fields.newInspectionFormTab.add(new NewInspectionFormFragment());
	}
	
	@Override
	public void setAppTheme() {
		setTheme(R.style.BaseActionBarTheme);
		int color = Color.parseColor("#DEDEDE");
		int buttonColor = Color.parseColor("#EFEFEF");
		ColorDrawable colorDrawable = new ColorDrawable(color);
		getActionBar().setBackgroundDrawable(colorDrawable);
		getActionBar().setStackedBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.AGCO_red)));
		ApplicationContext.mAppColor = buttonColor;
		ApplicationContext.mButtonColor = buttonColor;
		
		//set app icons
		downloadAppIcons(null, null);
	}
	
	
	@Override
	public PdiListFragment getPdiListFragment() {
		// TODO Auto-generated method stub
		return new CustomFragment();
	}
	
}
