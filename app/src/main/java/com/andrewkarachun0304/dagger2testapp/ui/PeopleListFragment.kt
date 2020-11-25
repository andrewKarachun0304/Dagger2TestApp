package com.andrewkarachun0304.dagger2testapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andrewkarachun0304.dagger2testapp.App
import com.andrewkarachun0304.dagger2testapp.R
import com.andrewkarachun0304.dagger2testapp.adapters.PeopleAdapter
import com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao
import com.andrewkarachun0304.dagger2testapp.database.entity.People
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PeopleListFragment : Fragment() {
    @Inject
    lateinit var peopleDao: PeopleDao

    private val peopleAdapter by lazy {
        PeopleAdapter(object : PeopleAdapter.OnClickListener {
            override fun onClick(people: People) {
                val bundle = Bundle()
                bundle.putParcelable("people", people)
                findNavController().navigate(R.id.open_updatePeopleFragment_action, bundle)
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_people_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initFab(requireView())
        injectFragment()
        initRecyclerView(requireView())

        updateRecyclerView()
    }

    private fun initFab(view: View) {
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            findNavController().navigate(R.id.open_addPeopleList_action)
        }
    }

    private fun injectFragment() {
        val app = activity?.applicationContext as App
        val component = app.getComponent()
        component.injectPeopleListFragment(this)
    }

    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.apply {
            adapter = peopleAdapter
            layoutManager = LinearLayoutManager(view.context)
        }
    }

    private fun updateRecyclerView() {
        CoroutineScope(Dispatchers.IO).launch {
            val peopleList = peopleDao.getAllPeople()
            withContext(Dispatchers.Main) {
                peopleAdapter.updateList(peopleList)
            }
        }
    }
}