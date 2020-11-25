package com.andrewkarachun0304.dagger2testapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.andrewkarachun0304.dagger2testapp.App
import com.andrewkarachun0304.dagger2testapp.R
import com.andrewkarachun0304.dagger2testapp.database.dao.PeopleDao
import com.andrewkarachun0304.dagger2testapp.database.entity.People
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class AddPeopleFragment : Fragment() {

    @Inject
    lateinit var peopleDao: PeopleDao

    private lateinit var addBtn: Button
    private lateinit var nameEt: EditText
    private lateinit var ageEt: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_people, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        injectFragment()
        initLayout(requireView())

        addBtn.setOnClickListener {
            if (checkEtOnNotEmpty()) {
                val name = nameEt.text.toString()
                val age = ageEt.text.toString().toInt()
                CoroutineScope(Dispatchers.IO).launch {
                    peopleDao.addPeople(People(name = name, age = age))
                }
                findNavController().popBackStack()
            }
        }
    }

    private fun injectFragment(){
        val app = activity?.applicationContext as App
        val component = app.getComponent()
        component.injectAddPeopleFragment(this)
    }

    private fun initLayout(view: View) {
        with(view){
            addBtn = findViewById(R.id.add_people_btn)
            nameEt = findViewById(R.id.name_et)
            ageEt = findViewById(R.id.age_et)
        }
    }

    private fun checkEtOnNotEmpty() =
        !nameEt.text.isNullOrEmpty() && !ageEt.text.isNullOrEmpty()
}