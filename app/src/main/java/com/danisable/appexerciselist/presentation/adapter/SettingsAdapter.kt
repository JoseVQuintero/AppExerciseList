package com.danisable.appexerciselist.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danisable.appexerciselist.R
import com.danisable.appexerciselist.domain.model.Settings
import com.danisable.appexerciselist.presentation.adapter.listener.ListenerSettings
import com.danisable.appexerciselist.presentation.adapter.viewHolders.SettingsViewHolders

class SettingsAdapter(
    private val context: Context,
    private val Settings: ArrayList<Settings>,
    private val listener: ListenerSettings
): RecyclerView.Adapter<SettingsViewHolders>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingsViewHolders {
        return SettingsViewHolders(LayoutInflater.from(parent.context).inflate(R.layout.items_settings, parent, false))
    }

    override fun getItemCount(): Int = Settings.size

    override fun onBindViewHolder(holder: SettingsViewHolders, position: Int) {
        val settings = Settings[position]
        //holder.txvName.text = Settings.title
        holder.txvDescription.text = settings.description
        //holder.imageAvatar.setImageResource(artist.image)
        Glide.with(context).load(settings.image).into(holder.imageAvatar)
        /*holder.itemView.setOnClickListener{
            listener.onClickNews(news,)
        }*/
        /*holder.itemView.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity
            val newsDFragment = NewsDFragment()
            val sm = activity.supportFragmentManager.beginTransaction()

            sm.apply {
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)

                val bundle = Bundle()
                //bundle.putSerializable("news", news)
                //bundle.putString("title", news.title)
                bundle.putString("description", Settings.description)
                bundle.putString("image", Settings.image)
                Log.e("TAG",Settings.image)
                newsDFragment.arguments = bundle

                replace(R.id.container, newsDFragment)
                addToBackStack(null)
                commit()
            }
        }*/

    }
}
