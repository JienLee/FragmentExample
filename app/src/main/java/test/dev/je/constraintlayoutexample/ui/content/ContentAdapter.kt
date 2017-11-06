package test.dev.je.constraintlayoutexample.ui.content

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.item_content.view.*
import test.dev.je.constraintlayoutexample.R

/**
 * Created by jieun on 2017. 10. 25..
 */
class ContentAdapter(con: Context, items: List<String>, val itemClick: (Int)-> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val context by lazy {
        con
    }

    private var dataList : List<String> = items

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        holder as ItemViewHolder
        holder.onBindView(position)
    }

    override fun getItemCount(): Int  = dataList.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(parent, context)
    }

    inner class ItemViewHolder(parent: ViewGroup?, context: Context) : RecyclerView.ViewHolder
    (LayoutInflater.from(context).inflate(R.layout.item_content, parent, false)) {

        fun onBindView(item: Int){
            itemView.run {
                setOnClickListener{
                    itemClick(item)
                }

                txtTitle.text = dataList.get(item)
                txtNumber.text = item.toString()
            }
        }
    }
}
