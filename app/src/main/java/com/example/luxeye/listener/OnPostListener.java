package com.example.luxeye.listener;

import com.example.luxeye.PostInfo;

public interface OnPostListener {

    void onDelete(PostInfo postInfo);
    void onModify();
}
