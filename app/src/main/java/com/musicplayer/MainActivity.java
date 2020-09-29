package com.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initializeDisplayContent();
	}

	private void initializeDisplayContent() {
		final RecyclerView musicRecyclerView = findViewById(R.id.music_recycler_list);
		final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		musicRecyclerView.setLayoutManager(layoutManager);
	}
}