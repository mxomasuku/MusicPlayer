package com.musicplayer;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MusicRecyclerAdapter extends RecyclerView.Adapter<MusicRecyclerAdapter.ViewHolder>  {

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
		return null;
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
