package com.applutions.mgl.modules.Auth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.applutions.mgl.R;

import java.util.ArrayList;
//
//public class PageAdapter extends RecyclerView.Adapter<PageAdapter.PageHolder> {
//
//    private Context context;
//    private ArrayList<String> pages;
//
//    public PageAdapter(Context context, ArrayList<String> pages) {
//        this.context = context;
//        this.pages = pages;
//    }
//
//    @NonNull
//    @Override
//    public PageAdapter.PageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        PageHolder holder = new PageHolder(LayoutInflater.from(context).inflate(R.layout.page_layout, parent, false));
//        return holder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull PageAdapter.PageHolder holder, int position) {
//        holder.textView.setText(pages.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return pages.size();
//    }
//
//    public class PageHolder extends RecyclerView.ViewHolder {
//        TextView textView;
//        public PageHolder(@NonNull View itemView) {
//            super(itemView);
//            textView = itemView.findViewById(R.id.textView);
//        }
//    }
//}

public class PageAdapter extends FragmentStateAdapter{

    private final Fragment[] fragments = new Fragment[]{
            new LoginFragment()
    };
    public final String[] names = new String[]{
            "Login",
            "Sign Up"
    };

    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments[position];
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return fragments.length;
    }
}