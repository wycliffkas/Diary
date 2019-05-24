package com.r.diary;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CourseRecyclerAdapter extends RecyclerView.Adapter<CourseRecyclerAdapter.ViewHolder> {

    private List<CourseInfo> mCourses;

    public CourseRecyclerAdapter(List<CourseInfo> courses) {
        this.mCourses = courses;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int ViewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_course_list,viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        CourseInfo course = mCourses.get(position);
        viewHolder.text_course.setText(course.getTitle());

    }

    @Override
    public int getItemCount() {

        return mCourses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView text_course;

        public ViewHolder(View itemView) {

            super(itemView);
            text_course = itemView.findViewById(R.id.text_course);


        }
    }
}
