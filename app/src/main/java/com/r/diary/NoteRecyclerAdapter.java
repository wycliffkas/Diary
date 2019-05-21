package com.r.diary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder> {

    private final List<NoteInfo> mNotes;

    public NoteRecyclerAdapter(List<NoteInfo> notes) {
        this.mNotes = notes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int ViewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_note_list, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NoteInfo note = mNotes.get(position);
        holder.textCourse.setText(note.getCourse().getTitle());
        holder.textTitle.setText(note.getTitle());

    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView textCourse;
        public final TextView textTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            textCourse = itemView.findViewById(R.id.text_course);
            textTitle = itemView.findViewById(R.id.text_title);

        }
    }
}
