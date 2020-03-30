package com.example.luxeye.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.example.luxeye.R;

public class ContentsItemView extends LinearLayout {

    private ImageView imageView;
    private EditText editText,editText1;

    private static final String TAG = "ContentsItemView";


    public ContentsItemView(Context context) {
        super(context);
        initView();
    }

    public ContentsItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    private void initView(){
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        addView(layoutInflater.inflate(R.layout.view_contents_image, this, false));
        addView(layoutInflater.inflate(R.layout.view_contents_edit_text, this, false));


        imageView = findViewById(R.id.contentsImageView);
        editText = findViewById(R.id.contentsEditText);

        

        Log.d(TAG, "TAG editText: " +editText);



    }

    public void setImage(String path){
        Glide.with(this).load(path).override(1000).into(imageView);
    }

    public void setText(String text){
        editText.setText(text);
        Log.d(TAG, "TAG1: " +editText);
        editText1.setText(text);

    }


    public void setOnClickListener(OnClickListener onClickListener){
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener){
        editText.setOnFocusChangeListener(onFocusChangeListener);

    }
}



