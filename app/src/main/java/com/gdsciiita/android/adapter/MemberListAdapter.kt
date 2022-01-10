package com.gdsciiita.android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gdsciiita.android.databinding.MemberItemBinding
import com.gdsciiita.android.model.Member

/**
 * ListAdapter for the list of [Member]s retrieved from the database
 */
class MemberListAdapter(
    private val clickListener: (Member) -> Unit
) : ListAdapter<Member, MemberListAdapter.MemberViewHolder>(DiffCallback) {

    class MemberViewHolder(
        private var binding: MemberItemBinding
    ): RecyclerView.ViewHolder(binding.root) {

        fun bind(member: Member) {
            binding.member = member
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback: DiffUtil.ItemCallback<Member>() {
        override fun areItemsTheSame(oldItem: Member, newItem: Member): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Member, newItem: Member): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MemberViewHolder(
            MemberItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val member = getItem(position)
        holder.bind(member)
    }
}
