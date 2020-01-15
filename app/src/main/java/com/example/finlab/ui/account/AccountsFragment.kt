package com.example.finlab.ui.account


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finlab.R
import com.example.finlab.adapters.Account
import com.example.finlab.adapters.AccountsRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_accounts.*

/**
 * A simple [Fragment] subclass.
 */
class AccountsFragment : Fragment() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: AccountsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//!        linearLayoutManager = LinearLayoutManager(activity)
//        accounts_fragment_recycler_view.layoutManager = linearLayoutManager
//
//        //!demo
//
//        val demoAccount1 = Account("demo 1", 123.2.toBigDecimal())
//        val demoAccount2 = Account("demo 2", 444.8.toBigDecimal())
//
//        var accounts: ArrayList<Account> = ArrayList()
//        accounts.add(demoAccount1)
//        accounts.add(demoAccount2)
//
//        adapter = AccountsRecyclerAdapter(accounts)
//
//        accounts_fragment_recycler_view.adapter = adapter


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view1 = inflater.inflate(R.layout.fragment_accounts, container, false)

        val recycler_view = view1.findViewById<RecyclerView>(R.id.accounts_fragment_recycler_view)


        linearLayoutManager = LinearLayoutManager(activity)
        recycler_view.layoutManager = linearLayoutManager

        //!demo
        var accounts: ArrayList<Account> = ArrayList()
        accounts.add(Account("demo 01", 123.2.toBigDecimal()))
        accounts.add(Account("demo 02", 444.8.toBigDecimal()))
        accounts.add(Account("demo 03", 123.2.toBigDecimal()))
        accounts.add(Account("demo 04", 444.8.toBigDecimal()))
        accounts.add(Account("demo 05", 444.8.toBigDecimal()))
        accounts.add(Account("demo 06", 444.8.toBigDecimal()))
        accounts.add(Account("demo 07", 444.8.toBigDecimal()))
        accounts.add(Account("demo 08", 444.8.toBigDecimal()))
        accounts.add(Account("demo 09", 444.8.toBigDecimal()))
        accounts.add(Account("demo 10", 444.8.toBigDecimal()))
        accounts.add(Account("demo 11", 444.8.toBigDecimal()))
        accounts.add(Account("demo 12", 444.8.toBigDecimal()))
        accounts.add(Account("demo 13", 444.8.toBigDecimal()))
        accounts.add(Account("demo 14", 444.8.toBigDecimal()))
        accounts.add(Account("demo 15", 444.8.toBigDecimal()))
        accounts.add(Account("demo 16", 444.8.toBigDecimal()))


        adapter = AccountsRecyclerAdapter(accounts, context!!)




        recycler_view.adapter = adapter


        // Inflate the layout for this fragment
        return view1


    }


}
