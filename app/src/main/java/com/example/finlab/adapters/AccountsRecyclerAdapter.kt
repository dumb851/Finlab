package com.example.finlab.adapters


import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat.getDrawable
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.finlab.R
import kotlinx.android.synthetic.main.accounts_fragment_recycler_view_item.view.*


class AccountsRecyclerAdapter(private val accounts: ArrayList<Account>, val context : Context)
    : RecyclerView.Adapter<AccountsRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AccountsRecyclerAdapter.ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(
            R.layout.accounts_fragment_recycler_view_item,
            parent,
            false
        )

        return ViewHolder(cellForRow)

    }

    override fun getItemCount(): Int {
        return accounts.size
    }

    override fun onBindViewHolder(holder: AccountsRecyclerAdapter.ViewHolder, position: Int) {
        val account = accounts.get(position)
        holder.view.textView.text = account.title

        //val icon = getDrawable(context, R.drawable.ic_vault)
        //val icon = getDrawable(context, R.drawable.ic_card)

        val unwrappedDrawable =
            AppCompatResources.getDrawable(context, R.drawable.ic_card)
        val wrappedDrawable = DrawableCompat.wrap(unwrappedDrawable!!)


        DrawableCompat.setTint(
            wrappedDrawable,
            context.resources.getColor(R.color.teal_600, null)
        )


//        icon?.setColorFilter(
//            context.resources.getColor(R.color.teal_600,
//                null
//            ),
//            null
//        )

        //holder.view.imageView_icon.setImageDrawable(icon)
        holder.view.imageView_icon.setImageDrawable(wrappedDrawable)

    }



    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        //2
       //private var view: View = v

        //3
        init {
            view.setOnClickListener(this)
        }

        //4
        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")
        }

        companion object {
            //5
            private val PHOTO_KEY = "PHOTO"
        }
    }


}