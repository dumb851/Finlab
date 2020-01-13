package com.example.finlab.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finlab.R
import kotlinx.android.synthetic.main.accounts_fragment_recycler_view_item.view.*

class AccountsRecyclerAdapter(private val accounts: ArrayList<Account>) : RecyclerView.Adapter<AccountsRecyclerAdapter.ViewHolder>() {

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
        holder?.view?.textView.text = account.title
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