package com.example.kulinerinseller.features.mainscreen.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kulinerinseller.R;
import com.example.kulinerinseller.models.ChatBubble;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatItemViewHolder> {

    private Context context;
    private ArrayList<ChatBubble> items;
    private LayoutInflater layoutInflater;
    private View view;

    public ChatAdapter (Context context, ArrayList<ChatBubble> items){
        this.context = context;
        this.items = items;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ChatItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = layoutInflater.inflate(R.layout.item_chat, viewGroup, false);
        return new ChatAdapter.ChatItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ChatItemViewHolder ChatItemViewHolder, int i) {
//        ChatItemViewHolder.textView.setText(menu.get(i));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ChatItemViewHolder extends RecyclerView.ViewHolder {

//        private Seller seller;

        public ChatItemViewHolder(@NonNull View itemView) {
            super(itemView);

//            seller = itemView.findViewById(R.id.menu_tittle);
        }
    }
}
