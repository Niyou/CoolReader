package com.xdd.coolreader.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.xdd.coolreader.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ShelfAdapter extends BaseAdapter{

    private String[] name={
    		"�����˲�","�����","ˮ䰴�","�ڵ�����"
    };
	// ������
	private Context mContext;
	// �������벼��
	private LayoutInflater inflater = null;
	private List<Map<String, Object>> mData;
	// ������ݵ�list
	private ArrayList<String> mList;
	// ������
	public ShelfAdapter(ArrayList<String> list, Context context) {
		this.mContext = context;
		this.mList = list;
		inflater = LayoutInflater.from(context);
		// ��ʼ������
		//initDate();
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View contentView, ViewGroup arg2) {
		// TODO Auto-generated method stub

		contentView = inflater.inflate(R.layout.book_item, null);
		
		TextView view=(TextView ) contentView.findViewById(R.id.imageView1);
		if(mList.size()>position){
			if(position<name.length){
				view.setText(name[position]);
			}
			view.setBackgroundResource(R.drawable.general__book_cover_view__default_2);
			//contentView.setBackgroundResource(R.drawable.general__book_cover_view__default_02);
		}else{
			//contentView.setBackgroundResource(R.drawable.general__book_cover_view__default_01);
			view.setBackgroundResource(R.drawable.general__book_cover_view__default_1);
			view.setClickable(false);
			view.setVisibility(View.INVISIBLE);
		}
		return contentView;
	}

}