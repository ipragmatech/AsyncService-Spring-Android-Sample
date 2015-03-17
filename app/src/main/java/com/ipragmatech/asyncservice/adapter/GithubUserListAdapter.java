package com.ipragmatech.asyncservice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ipragmatech.asyncservice.R;
import com.ipragmatech.asyncservice.model.response.User;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by neha on 17/3/15.
 */
public class GithubUserListAdapter extends BaseAdapter {
    private final Context context;
    private final List<User> users;


    public GithubUserListAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }
    @Override public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) { view = LayoutInflater.from(context).inflate(R.layout.user_list_view, parent, false);
            holder = new ViewHolder();
            holder.image = (ImageView) view.findViewById(R.id.photo);
            holder.fullName = (TextView) view.findViewById(R.id.full_name);
            holder.location=(TextView) view.findViewById(R.id.location);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        // Get the image URL for the current position.
        User user = getItem(position);

        holder.fullName.setText(user.getUsername());
        if(user.getLocation()!=null){
            holder.location.setText(user.getLocation());
        }else{

            }

        Picasso.with(context)
                .load("https://secure.gravatar.com/avatar/")
                .resizeDimen(R.dimen.list_detail_image_size, R.dimen.list_detail_image_size)
                .centerInside()
                .tag(context)
                .into(holder.image);

        return view;
    }

    @Override public int getCount() {
        return users.size();
    }

    @Override public User getItem(int position) {
        return users.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        ImageView image;
        TextView fullName;
        TextView location;
    }



}
