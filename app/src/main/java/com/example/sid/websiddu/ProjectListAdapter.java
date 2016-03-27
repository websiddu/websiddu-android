package com.example.sid.websiddu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.caverock.androidsvg.SVGImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;


public class ProjectListAdapter extends ArrayAdapter<Project>{

    private List<Project> projects;

    public ProjectListAdapter(Context context, int resource, List<Project> objects){
        super(context, resource, objects);
        projects = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.project_item, parent, false);
        }

        Project project = projects.get(position);

        TextView projectName = (TextView) convertView.findViewById(R.id.project_name);
        projectName.setText(project.getTitle());


//        SVGImageView cardBanner = (SVGImageView) convertView.findViewById(R.id.card_banner);

        ImageView cardBanner = (ImageView) convertView.findViewById(R.id.card_banner);

        Picasso.with(getContext()).load(project.getBanner())
                .into(cardBanner);


        return convertView;
    }

}
