package com.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	public static final int STORAGE_PERMISSION = 101;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initializeDisplayContent();

		requestStorageAccess();

		findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				useCamera();
			}
		});
	}

		private void useCamera() {
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, 100);

		}
		private void requestStorageAccess() {
				if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
					== PackageManager.PERMISSION_GRANTED){
				return;
				}else
			ActivityCompat.requestPermissions(this,
					new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION);
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if(requestCode == STORAGE_PERMISSION){
			if(grantResults.length > 0
			&& grantResults[0] == PackageManager.PERMISSION_GRANTED){
				//proceed
				onResume();
				return;

			}else{
				((ActivityManager) (this.getSystemService(ACTIVITY_SERVICE))).clearApplicationUserData();
				recreate();
			}
		}
	}

	private void initializeDisplayContent() {
				final RecyclerView musicRecyclerView = findViewById(R.id.music_recycler_list);
				final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
				musicRecyclerView.setLayoutManager(layoutManager);

			}
		};
