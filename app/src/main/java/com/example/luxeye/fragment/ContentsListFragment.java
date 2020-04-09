package com.example.luxeye.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luxeye.R;
import com.example.luxeye.YoutubeVideo;
import com.example.luxeye.adapter.ContentsListAdapter;
import com.example.luxeye.adapter.UserListAdapter;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ContentsListFragment extends Fragment {

    private static final String TAG = "ContentsListFragment";

    @BindView(R.id.recyclerViewFeed)

    RecyclerView recyclerViewFeed;
    ContentsListAdapter mRecyclerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_contents_list, container, false);
        ButterKnife.bind(this,view);

        // prepare data for list
        List<YoutubeVideo> youtubeVideos = prepareList();
        mRecyclerAdapter = new ContentsListAdapter(youtubeVideos);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerViewFeed.setLayoutManager(mLayoutManager);
        recyclerViewFeed.setItemAnimator(new DefaultItemAnimator());
        recyclerViewFeed.setAdapter(mRecyclerAdapter);


        return view;
    }

    private List<YoutubeVideo> prepareList(){

        ArrayList<YoutubeVideo> videoArrayList = new ArrayList<>();
        // add first item
        YoutubeVideo video1 = new YoutubeVideo();
        video1.setId(1l);
        video1.setImageUrl("https://i.ytimg.com/vi/MTgLtWZDajk/maxresdefault.jpg");
        video1.setTitle(
                "쿠팡의 로켓배송 사실 티파니가 먼저 시작했다?!!");
        video1.setVideoId("MTgLtWZDajk");
        //videoArrayList.add(video1);
        // add second item
        YoutubeVideo video2 = new YoutubeVideo();
        video2.setId(2l);
        video2.setImageUrl("https://i.ytimg.com/vi/f6idt-2nRRw/maxresdefault.jpg");
        video2.setTitle(
                "흙수저가 만든 명품 브랜드 크리스찬 디올");
        video2.setVideoId("f6idt-2nRRw");
        // add third item
        YoutubeVideo video3 = new YoutubeVideo();
        video3.setId(3l);
        //video3.setImageUrl("https://i.ytimg.com/vi/-b6yYNpT2jg/hqdefault.jpg");     화면크기 크게
        video3.setImageUrl("https://i.ytimg.com/vi/-b6yYNpT2jg/maxresdefault.jpg");

        video3.setTitle("시대를 앞서간 천재 입생로랑");
        video3.setVideoId("-b6yYNpT2jg");
        // add four item
        YoutubeVideo video4 = new YoutubeVideo();
        video4.setId(4l);
        video4.setImageUrl("https://i.ytimg.com/vi/xIa3KKgpKXw/maxresdefault.jpg");
        video4.setTitle("LVMH가 19조원 써가며 티파니 인수한 진짜 이유");
        video4.setVideoId("xIa3KKgpKXw");
        // add four item
        YoutubeVideo video5 = new YoutubeVideo();
        video5.setId(5l);
        video5.setImageUrl("https://i.ytimg.com/vi/MNw2JPfrcYM/maxresdefault.jpg");
        video5.setTitle("코코 샤넬의 성공과 실패");
        video5.setVideoId("MNw2JPfrcYM");
        videoArrayList.add(video1);
        videoArrayList.add(video2);
        videoArrayList.add(video3);
        videoArrayList.add(video4);
        videoArrayList.add(video5);

        return videoArrayList;
        
    }
}
