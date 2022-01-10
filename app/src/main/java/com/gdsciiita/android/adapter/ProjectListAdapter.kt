package com.gdsciiita.android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gdsciiita.android.databinding.ProjectItemBinding
import com.gdsciiita.android.model.Project


class ProjectListAdapter(
    private val clickListener: (Project) -> Unit
) : ListAdapter<Project, ProjectListAdapter.ProjectViewHolder>(DiffCallback) {

    class ProjectViewHolder(
        private var binding: ProjectItemBinding
    ): RecyclerView.ViewHolder(binding.root) {

        fun bind(project: Project) {
            binding.project = project
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback: DiffUtil.ItemCallback<Project>() {
        override fun areItemsTheSame(oldItem: Project, newItem: Project): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Project, newItem: Project): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProjectViewHolder(
            ProjectItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val project = getItem(position)
        holder.bind(project)
    }
}
