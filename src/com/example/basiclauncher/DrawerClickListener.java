package com.example.basiclauncher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class DrawerClickListener implements OnItemClickListener {

	Context mContext;
	Pac[] pacsForAdapter;
	PackageManager pmForListener;
	
	public DrawerClickListener(Context c, Pac[] pacs, PackageManager pm){
		mContext=c;
		pacsForAdapter=pacs;
		pmForListener = pm;
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
		if (MainActivity.appLaunchable){
			
			Intent launchIntent = new Intent(Intent.ACTION_MAIN);
			launchIntent.addCategory(Intent.CATEGORY_LAUNCHER);
			ComponentName cp = new ComponentName(pacsForAdapter[pos].packageName, pacsForAdapter[pos].name);
			System.out.println("packpacknames"+pacsForAdapter[pos].packageName.toString()+"namenames"+pacsForAdapter[pos].name.toString());
			Toast.makeText(mContext,"packagename::"+pacsForAdapter[pos].packageName+"classname::"+pacsForAdapter[pos].name, Toast.LENGTH_LONG).show();
			launchIntent.setComponent(cp);
			
			mContext.startActivity(launchIntent);
		}
	}

}
