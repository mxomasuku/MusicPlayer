package com.musicplayer;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MusicRecyclerAdapter extends RecyclerView.Adapter<MusicRecyclerAdapter.ViewHolder>  {

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View itemView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.support_simple_spinner_dropdown_item, parent, false);
		return new ViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
	

	}

	@Override
	public int getItemCount() {
		return 0;
	}

	public class ViewHolder extends RecyclerView.ViewHolder{

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
		}
	}

}
