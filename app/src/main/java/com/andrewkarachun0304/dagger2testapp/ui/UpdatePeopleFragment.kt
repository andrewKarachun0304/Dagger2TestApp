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

class UpdatePeopleFragment : Fragment() {
    @Inject
    lateinit var peopleDao: PeopleDao

    private lateinit var nameEt: EditText
    private lateinit var ageEt: EditText
    private lateinit var saveBtn: Button

    private var people: People? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_update_people, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        injectFragment()
        initLayout(requireView())

        people = arguments?.getParcelable("people")
        nameEt.setText(people?.name)
        ageEt.setText(people?.age.toString())
    }

    private fun initLayout(view: View) {
        with(view) {
            nameEt = findViewById(R.id.update_name_et)
            ageEt = findViewById(R.id.update_age_et)
            saveBtn = findViewById(R.id.save_people_btn)
        }
        saveBtn.setOnClickListener {
            if (checkEtOnNotEmpty()) {
                CoroutineScope(Dispatchers.IO).launch {
                    peopleDao.updatePeople(
                        people?.id,
                        nameEt.text.toString(),
                        ageEt.text.toString().toInt()
                    )
                }
                findNavController().popBackStack()
            }
        }
    }

    private fun injectFragment() {
        val app = activity?.applicationContext as App
        val component = app.getComponent()
        component.injectUpdatePeopleFragment(this)
    }

    private fun checkEtOnNotEmpty() =
        !nameEt.text.isNullOrEmpty() && !ageEt.text.isNullOrEmpty()
}