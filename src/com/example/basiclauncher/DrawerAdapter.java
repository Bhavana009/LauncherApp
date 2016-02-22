package com.example.basiclauncher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerAdapter extends BaseAdapter{
	Context mContext;
	Pac[] pacsForAdapter;
	
	public DrawerAdapter (Context c, Pac pacs[]){
		mContext =c;
		pacsForAdapter = pacs;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pacsForAdapter.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	static class ViewHolder{
		TextView text;
		ImageView icon;
	}
	@Override
	public View getView(int pos, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder;
		LayoutInflater li = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if (convertView==null){
			convertView = li.inflate(R.layout.drawer_item, null);
			
			viewHolder = new ViewHolder();
			
			viewHolder.text= (TextView)convertView.findViewById(R.id.icon_text);
			viewHolder.icon= (ImageView)convertView.findViewById(R.id.icon_image);
			
			convertView.setTag(viewHolder);
		}
		else
			viewHolder = (ViewHolder) convertView.getTag();

		System.out.println("DSSSSSSSSSSSSSSSSSSSSSSS");
		viewHolder.text.setText(pacsForAdapter[pos].label);
		
		viewHolder.icon.setImageDrawable(pacsForAdapter[pos].icon);
		
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.browser.BrowserActivity")){
			viewHolder.icon.setImageResource(R.drawable.browser);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.calculator2.Calculator")){
			viewHolder.icon.setImageResource(R.drawable.cal);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.calendar.AllInOneActivity")){
			viewHolder.icon.setImageResource(R.drawable.calendar);
			}
		if(pacsForAdapter[pos].label.contains("Camera")){
			viewHolder.icon.setImageResource(R.drawable.camera);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.deskclock.DeskClock")){
			viewHolder.icon.setImageResource(R.drawable.clock);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.providers.downloads.ui.DownloadList")){
			viewHolder.icon.setImageResource(R.drawable.downloads1);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.email.activity.Welcome")){
			viewHolder.icon.setImageResource(R.drawable.email3);
			}
		if(pacsForAdapter[pos].label.contains("Gallery")){
			viewHolder.icon.setImageResource(R.drawable.gallery);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.mms.ui.ConversationList")){
			viewHolder.icon.setImageResource(R.drawable.message1);
			}
		
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.music.MusicBrowserActivity")){
			viewHolder.icon.setImageResource(R.drawable.music6);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.contacts.activities.PeopleActivity")){
			viewHolder.icon.setImageResource(R.drawable.contact3);
			}
		if(pacsForAdapter[pos].label.contains("Phone")){
			viewHolder.icon.setImageResource(R.drawable.phone);
			}
		if(pacsForAdapter[pos].name.equalsIgnoreCase("com.android.settings.Settings")){
			viewHolder.icon.setImageResource(R.drawable.settings);
			}
		return convertView;
	}

}
